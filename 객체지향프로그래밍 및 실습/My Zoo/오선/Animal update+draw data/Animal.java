package zoo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;

public class Animal extends Thread{
	public Cage										fence;
	public Point										location;
	public Dimension							bound;
	public ArrayList<Shape>			figure;
	public ArrayList<Color>				color;
	public ArrayList<Boolean>			transparent;
	public ArrayList<BasicStroke>	stroke;
	private Rectangle2D.Double		a;
	private Line2D.Double					b;
	private Ellipse2D.Double				c;
	private int										dx;
	private int										dy;
	private Random								R;
	
	public Animal(Cage fence, int selection) {
		this.fence = fence;
		R = new Random();
		stroke = new ArrayList<BasicStroke>();
		FileInputStream fis;
		ObjectInputStream ois;
		
		try{
			fis						= new FileInputStream("draw.dat"+selection);
			ois						= new ObjectInputStream(fis);
			
			figure					= (ArrayList<Shape>) ois.readObject();
			color					= (ArrayList<Color>) ois.readObject();
			transparent		= (ArrayList<Boolean>) ois.readObject();
			
			for(int i=0; i<figure.size(); i++)
				stroke.add(new BasicStroke(ois.readFloat()));
			
			ois.close();
			fis.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		Point a				= findLeftPivot();
		Point b				= findRightPivot();
		
		bound	= new Dimension(b.x - a.x, b.y - a.y);
	
		convertFigureBound(selection);
		
		location = new Point(R.nextInt(fence.getCageDimension().width-bound.width)+fence.getCagePoint().x,
				R.nextInt(fence.getCageDimension().height-bound.height)+fence.getCagePoint().y);
	}
	
	/**
	 * width, height
	 * 0: pig -> 60, 30
	 * 1: penguin -> 30, 50
	 * @param selection
	 */
	private void convertFigureBound(int selection){
		Point leftPivot = findLeftPivot();
		double proportionX;
		double proportionY;
		
		switch(selection){
			case 1:		proportionX = 90.0/bound.width;
								proportionY = 50.0/bound.height;
								break;
			case 2:		proportionX = 30.0/bound.width;
								proportionY = 50.0/bound.height;
								break;
			default:	proportionX = 1;
								proportionY = 1;
								break;
		}
		
		for(BasicStroke next1 : stroke)
			next1 = new BasicStroke(next1.getLineWidth()*(float) Math.sqrt(Math.pow(proportionX, 2)+Math.pow(proportionY, 2)));
		
		for(Shape next2 : figure){
			switch(whatShape(next2)){
				case "Rectangle":	a = (Rectangle2D.Double) next2;
				
														a.x = leftPivot.x + (a.x - leftPivot.x)*proportionX;
														a.y = leftPivot.y + (a.y - leftPivot.y)*proportionY;
														a.width *= proportionX;
														a.height *= proportionY;
														break;
				case "Line":				b = (Line2D.Double) next2;
														
														b.x1 = leftPivot.x + (b.x1 - leftPivot.x)*proportionX;
														b.y1 = leftPivot.y + (b.y1 - leftPivot.y)*proportionY;
														b.x2 = leftPivot.x + (b.x2 - leftPivot.x)*proportionX;
														b.y2 = leftPivot.y + (b.y2 - leftPivot.y)*proportionY;
														break;
				case "Ellipse":			c = (Ellipse2D.Double) next2;
														
														c.x = leftPivot.x + (c.x - leftPivot.x)*proportionX;
														c.y = leftPivot.y + (c.y - leftPivot.y)*proportionY;
														c.width *= proportionX;
														c.height *= proportionY;
														break;
				default:						break;
			}
		}
		
		Point rightPivot = findRightPivot();
		
		bound.setSize(rightPivot.x - leftPivot.x, rightPivot.y - leftPivot.y);
	}
	
	private void convertFigureLocation(Point location){
		Point leftPivot	= findLeftPivot();
		double dx		= location.x - leftPivot.x;
		double dy		= location.y - leftPivot.y;
		
		for(Shape next : figure){
			switch(whatShape(next)){
				case "Rectangle":	a = (Rectangle2D.Double) next;
														a.x += dx;
														a.y += dy;
														break;
				case "Line":				b = (Line2D.Double) next;
														b.x1 += dx;
														b.x2 += dx;
														b.y1 += dy;
														b.y2 += dy;
														break;
				case "Ellipse":			c = (Ellipse2D.Double) next;
														c.x += dx;
														c.y += dy;
														break;
				default:						break;
			}
		}
	}
	
	public void draw(Graphics2D graphics2d) {
		convertFigureLocation(location);
		
		for(int i=0; i < figure.size(); i++){
			graphics2d.setColor(color.get(i));
			graphics2d.setStroke(stroke.get(i));
			
			if(transparent.get(i))
				graphics2d.draw(figure.get(i));
			else{
				if(whatShape(figure.get(i)).equals("Line"))
					graphics2d.draw(figure.get(i));
				else
				graphics2d.fill(figure.get(i));
			}
		}
		
	}
	
	/**
	 * find and return left-upper corner Point.
	 * @return
	 */
	private Point findLeftPivot(){
		double	 smallX	= Double.MAX_VALUE;
		double smallY	= Double.MAX_VALUE;
		
		for(Shape next : figure){
			switch(whatShape(next)){
				case "Rectangle":	a = (Rectangle2D.Double) next;
														if(smallX > a.x)
															smallX = a.x;
														if(smallY > a.y)
															smallY = a.y;
														break;
				case "Line":				b = (Line2D.Double) next;
														if(smallX > Math.min(b.x1, b.x2))
															smallX = Math.min(b.x1, b.x2);
														if(smallY > Math.min(b.y1, b.y2))
															smallY = Math.min(b.y1, b.y2);
														break;
				case "Ellipse":			c = (Ellipse2D.Double) next;
														if(smallX > c.x)
															smallX = c.x;
														if(smallY > c.y)
															smallY = c.y;
														break;
				default:						break;
			}
		}
		
		return new Point((int) smallX, (int) smallY);
	}
	
	/**
	 * find and return right-under corner Point.
	 * @return
	 */
	private Point findRightPivot(){
		double	 bigX	= 0;
		double bigY	= 0;
		
		for(Shape next : figure){
			switch(whatShape(next)){
				case "Rectangle":	a = (Rectangle2D.Double) next;
														if(bigX < a.x+a.width)
															bigX = a.x+a.width;
														if(bigY < a.y+a.height)
															bigY = a.y+a.height;
														break;
				case "Line":				b = (Line2D.Double) next;
														if(bigX < Math.max(b.x1, b.x2))
															bigX = Math.max(b.x1, b.x2);
														if(bigY < Math.max(b.y1, b.y2))
															bigY = Math.max(b.y1, b.y2);
														break;
				case "Ellipse":			c = (Ellipse2D.Double) next;
														if(bigX < c.x+c.width)
															bigX = c.x+c.width;
														if(bigY < c.y+c.height)
															bigY = c.y+c.height;
														break;
				default:						break;
			}
		}
		
		return new Point((int) bigX, (int) bigY);
	}
	
	public void move(int dx, int dy) {
		if(fence.isItInside(new Point(location.x+dx, location.y+dy), bound))
			location.translate(dx, dy);
	}
	
	public void run() {
		if(R.nextInt(100) > 91){
			if(R.nextBoolean()){
				dx = R.nextInt(10) - 5;
				dy = R.nextInt(10) - 5;
			}else{
				dx = 0;
				dy = 0;
			}
		}
		
		move(dx,dy);
	}
	
	public String whatShape(Shape figure){
		if(figure instanceof Rectangle2D.Double)
			return "Rectangle";
		else if(figure instanceof Ellipse2D.Double)
			return "Ellipse";
		else if(figure instanceof Line2D.Double)
			return "Line";
		else
			return null;
	}
}

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

public class MyAnimal extends Animal{
	public ArrayList<Shape>			figure;
	public ArrayList<Color>				color;
	public ArrayList<Boolean>			transparent;
//	public ArrayList<BasicStroke>	stroke;
	private Rectangle2D.Double		a;
	private Line2D.Double					b;
	private Ellipse2D.Double				c;
	
	public MyAnimal(Cage fence, int selection) {
		super();
		
		this.fence = fence;
		FileInputStream fis;
		ObjectInputStream ois;
		
		try{
			fis = new FileInputStream("draw.dat"+selection);
			ois = new ObjectInputStream(fis);
			
			figure				= (ArrayList<Shape>) ois.readObject();
			color				= (ArrayList<Color>) ois.readObject();
			transparent	= (ArrayList<Boolean>) ois.readObject();
//			stroke			= (ArrayList<BasicStroke>) ois.readObject();
			
			ois.close();
			fis.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		Point a				= findLeftPivot();
		Point b				= findRightPivot();
		
		super.bound	= new Dimension(b.x - a.x, b.y - a.y);
	
		convertFigureBound(selection);
		
		location = new Point(R.nextInt(fence.getCageDimension().width-bound.width)+fence.getCagePoint().x,
				R.nextInt(fence.getCageDimension().height-bound.height)+fence.getCagePoint().y);
	}
	
	@Override
	public void draw(Graphics2D graphics2d) {
		convertFigureLocation(location);
		
		for(int i=0; i < figure.size(); i++){
			graphics2d.setColor(color.get(i));
			
			if(transparent.get(i))
				graphics2d.draw(figure.get(i));
			else
				graphics2d.fill(figure.get(i));
		}
		
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
	
	/**
	 * width, height 순
	 * 0: 돼지 -> 60, 30
	 * 1: 펭귄 -> 30, 50
	 * @param selection
	 */
	private void convertFigureBound(int selection){
		Point leftPivot = findLeftPivot();
		double proportionX;
		double proportionY;
		double dx;
		double dy;
		
		switch(selection){
			case 1:		proportionX = 60.0/bound.width;
								proportionY = 30.0/bound.height;
								break;
			case 2:		proportionX = 30.0/bound.width;
								proportionY = 50.0/bound.height;
								break;
			default:	proportionX = 1;
								proportionY = 1;
								break;
		}
		
		for(Shape next : figure){
			switch(whatShape(next)){
				case "Rectangle":	a = (Rectangle2D.Double) next;
				
														a.x = leftPivot.x + (a.x - leftPivot.x)*proportionX;
														a.y = leftPivot.y + (a.y - leftPivot.y)*proportionY;
														a.width *= proportionX;
														a.height *= proportionY;
														break;
				case "Line":				b = (Line2D.Double) next;
														
														if(b.x1 < b.x2)
															dx = (b.x1 - leftPivot.x)*(1 - proportionX);
														else
															dx = (b.x2 - leftPivot.x)*(1 - proportionX);
														
														if(b.y1 < b.y2)
															dy = (b.y1 - leftPivot.y)*(1 - proportionY);
														else
															dy = (b.y2 - leftPivot.y)*(1 - proportionY);
														
														b.x1 -= dx;
														b.x2 -= dx;
														b.y1 -= dy;
														b.y2 -= dy;
														
														convertLine(b, proportionX, proportionY);
														break;
				case "Ellipse":			c = (Ellipse2D.Double) next;
														
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
	
	private void convertLine(Line2D.Double line, double proportionX, double proportionY){
		Point2D left;
		Point2D right;
		double x;
		double y;
		
		if(line.getP1().getX() < line.getP2().getX()){
			left = line.getP1();
			right = line.getP2();
		}else{
			left = line.getP2();
			right = line.getP1();
		}
		
		x = left.getX() + (right.getX() - left.getX())*proportionX;
		
		if(left.getY() > right.getY())
			y = left.getY() - (left.getY() - right.getY())*proportionY;
		else
			y = left.getY() + (right.getY() - left.getY())*proportionY;
		
		right.setLocation(x, y);
		
		line.setLine(left.getX(), left.getY(), x, y);
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

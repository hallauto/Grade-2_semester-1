package zoo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MyAnimal extends Animal{
	public ArrayList<Shape>		figure;
	public ArrayList<Color>			color;
	public ArrayList<Boolean>		transparent;
	private Rectangle2D.Double	a;
	private Line2D.Double				b;
	private Ellipse2D.Double			c;
	
	public MyAnimal(Point location, int selection) {
		super(location);
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		try{
			fis = new FileInputStream("draw.dat"+selection);
			ois = new ObjectInputStream(fis);
			
			figure				= (ArrayList<Shape>) ois.readObject();
			color				= (ArrayList<Color>) ois.readObject();
			transparent	= (ArrayList<Boolean>) ois.readObject();
			ois.close();
			fis.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	@Override
	public void draw(Graphics2D graphics2d) {
		convertFigures(location);
		
		for(int i=0; i < figure.size(); i++){
			graphics2d.setColor(color.get(i));
			
			if(transparent.get(i))
				graphics2d.draw(figure.get(i));
			else
				graphics2d.fill(figure.get(i));
		}
		
	}
	

	private void convertFigures(Point location){
		Point pivot	= findPivot();
		double dx	= location.x - pivot.x;
		double dy	= location.y - pivot.y;
		
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
	
	private Point findPivot(){
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

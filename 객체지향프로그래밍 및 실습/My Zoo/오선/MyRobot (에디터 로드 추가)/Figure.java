package MyRobot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;


public class Figure implements MyRobot{
	public ArrayList<Shape>			figure;
	public ArrayList<Color>				color;
	public ArrayList<Boolean>			transparent;
	public ArrayList<BasicStroke>	stroke;
	public boolean								reach;					//is it reached right side?
	public int											i;								//index of figure or number of figure
	
	public Figure(){
		figure = new ArrayList<Shape>();
		color = new ArrayList<Color>();
		transparent = new ArrayList<Boolean>();
		stroke = new ArrayList<BasicStroke>();
	}
	
	@Override
	public void draw(Graphics2D g2) {
		for(int index = 0; index < i; index++){
			g2.setColor(color.get(index));
			
			if(!stroke.isEmpty())
				g2.setStroke(stroke.get(index));
			else
				g2.setStroke(new BasicStroke(1));
			
			if(transparent.get(index))
				g2.draw(figure.get(index));
			else
				g2.fill(figure.get(index));
		}
	}
	
	@Override
	public void move() {
		boolean nextMove = reach;
		Shape temp;
		Rectangle2D.Double a;
		Line2D.Double b;
		Ellipse2D.Double c;
		Iterator<Shape> iterator = figure.iterator();
		
		while(iterator.hasNext()){
			switch(whatShape(temp = iterator.next())){
				case "Rectangle":	a = (Rectangle2D.Double) temp;
														if(reach){
															a.x -= 5;
															
															if(a.x <= 0)
																nextMove = false;
														}else{
															a.x += 5;
															
															if(a.x+a.width >= 640)
																nextMove = true;
														}
														break;
				case "Line":				b = (Line2D.Double) temp;
														if(reach){
															b.x1 -= 5;
															b.x2 -= 5;
															
															if(Math.min(b.x1, b.x2) <= 0)
																nextMove = false;
														}else{
															b.x1 += 5;
															b.x2 += 5;
															
															if(Math.max(b.x1, b.x2) >= 640)
																nextMove = true;
														}
														break;
				case "Ellipse":			c = (Ellipse2D.Double) temp;
														if(reach){
															c.x -= 5;
															
															if(c.x <= 0)
																nextMove = false;
														}else{
															c.x += 5;
															
															if(c.x+c.width >= 640)
																nextMove = true;
														}
														break;
				default:						break;
			}
		}
		
		reach = nextMove;
	}
	
	public void printInfo(){
		Iterator<Shape> iterator = figure.iterator();
		Shape temp;
		Rectangle2D.Double a;
		Line2D.Double b;
		Ellipse2D.Double c;
		int index = 1;
		
		while(iterator.hasNext()){
			System.out.println((index++)+"#");
			
			switch(whatShape(temp = iterator.next())){
				case "Rectangle":	a = (Rectangle2D.Double) temp;
														System.out.println("rect.x: "+a.x);
														System.out.println("rect.y: "+a.y);
														System.out.println("rect.width: "+a.width);
														System.out.println("rect.height: "+a.height);
														break;
				case "Line":				b = (Line2D.Double) temp;
														System.out.println("line.x1: "+b.x1);
														System.out.println("line.y1: "+b.y1);
														System.out.println("line.x2: "+b.x2);
														System.out.println("line.y2: "+b.y2);
														break;
				case "Ellipse":			c = (Ellipse2D.Double) temp;
														System.out.println("ellipse.x"+c.x);
														System.out.println("ellipse.y"+c.y);
														System.out.println("ellipse.width"+c.width);
														System.out.println("ellipse.height"+c.height);
														break;
				default:						break;
			}
		}
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

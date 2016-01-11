package MyRobot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


//the class CreateFigure processes tasks about mouse events.
//when you clicked frame, the class constructs a new figure with selected options.
//if you do not clicked any color options, this class do not constructs a new figure.
//when you released the mouse, the class fixes size and bound with the initial and present position of mouse.
public class CreateFigure extends MouseAdapter{
	MakeFigure mf;
	Components c;
	Figure f;
	
	public CreateFigure(MakeFigure mf){
		this.mf = mf;
		c = mf.c;
		f = mf.f;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		mf.clicked = true;
		mf.initial = mf.mouse;
		f.i++;
		
		f.color.add(new Color(c.red.getValue(), c.green.getValue(), c.blue.getValue()));
		
		switch((String) c.box.getSelectedItem()){
			case "Rectangle": 	f.figure.add(new Rectangle2D.Double(mf.initial.x, mf.initial.y, 0, 0));
											break;
			case "Line" :			f.figure.add(new Line2D.Double(mf.initial.x, mf.initial.y, mf.initial.x, mf.initial.y));
											break;
			case "Ellipse" :		f.figure.add(new Ellipse2D.Double(mf.initial.x, mf.initial.y, 0, 0));
											break;
			default:					break;
		}
		
		if(c.transparent.isSelected())
			f.transparent.add(true);
		else
			f.transparent.add(false);
		
		f.stroke.add(new BasicStroke(c.stroke.getValue()));
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		mf.clicked = false;
		if(mf.mouse != null){
			switch(f.whatShape(f.figure.get(f.i-1))){
				case "Rectangle":	((Rectangle2D.Double) f.figure.get(f.i-1)).setRect(Math.min(mf.initial.x, mf.mouse.x), Math.min(mf.initial.y, mf.mouse.y), Math.abs(mf.mouse.x - mf.initial.x), Math.abs(mf.mouse.y - mf.initial.y));
												break;
				case "Line":				((Line2D.Double) f.figure.get(f.i-1)).setLine(mf.initial.x, mf.initial.y, mf.mouse.x, mf.mouse.y);
												break;
				case "Ellipse":			((Ellipse2D.Double) f.figure.get(f.i-1)).setFrame(Math.min(mf.initial.x, mf.mouse.x), Math.min(mf.initial.y, mf.mouse.y), Math.abs(mf.mouse.x - mf.initial.x), Math.abs(mf.mouse.y - mf.initial.y));
												break;
				default:					break;
			}
		}
	}

}
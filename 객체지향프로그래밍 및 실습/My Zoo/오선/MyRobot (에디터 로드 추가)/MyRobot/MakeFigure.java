package MyRobot;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

// the class MakeFigure implements MyRobot interface.
public class MakeFigure implements ActionListener{
	public JFrame frm;
	public Figure f;
	public Components c;
	public Point initial;										//initial location of mouse point when you clicks the frame
	public Point mouse;									//present location of mouse point
	public boolean clicked;							//do you dragged the mouse now?
	public boolean move;								//do you clicked button?
	public Timer T;
	
	public MakeFigure(){
		frm = new JFrame("My Robot");
		frm.setBounds(350, 100, 640, 480);
		frm.setBackground(Color.white);
		
		if(JOptionPane.showConfirmDialog(null, "Try to focus your mouse on the component to know function.", "Notice", JOptionPane.OK_CANCEL_OPTION) == 2)
			System.exit(0);
		
		mouse = new Point();
		f = new Figure();
		c = new Components(this);
		
		frm.add(c);
		frm.addMouseListener(new CreateFigure(this));
		frm.setVisible(true);
		
		T = new Timer(50, this);
		T.start();
	}
	
	
//	with Timer instance, this action is performed every 50 milliseconds.
//	this method gets a present location of mouse and calculates size and bound when mouse is dragged.
//	when button is clicked, all figures are moved and when button is clicked again, all figures are stopped.
//	and repaints all figures.
	@Override
	public void actionPerformed(ActionEvent e){
		if(T.isRunning()){
			mouse = frm.getMousePosition();
			if(mouse != null){
				mouse.x -= 2;
				mouse.y -= 133;
			}
			if(clicked && mouse != null){
				switch(f.whatShape(f.figure.get(f.i-1))){
					case "Rectangle":	((Rectangle2D.Double) f.figure.get(f.i-1)).setRect(Math.min(initial.x, mouse.x), Math.min(initial.y, mouse.y), Math.abs(mouse.x - initial.x), Math.abs(mouse.y - initial.y));
													break;
					case "Line":				((Line2D.Double) f.figure.get(f.i-1)).setLine(initial.x, initial.y, mouse.x, mouse.y);
													break;
					case "Ellipse":			((Ellipse2D.Double) f.figure.get(f.i-1)).setFrame(Math.min(initial.x, mouse.x), Math.min(initial.y, mouse.y), Math.abs(mouse.x - initial.x), Math.abs(mouse.y - initial.y));
													break;
					default:					break;
				}
				
			}
			if(move)
				f.move();
			c.repaint();
			
		}
	}
	
}

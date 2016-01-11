package question2_Cursor;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.event.*;
import java.awt.Point;

import java.util.Date;

public class Cursor extends JPanel{
	Point cursorPoint;
	TimerListener timerListener;
	CursorListener mouseCursor;
	Timer time;
	String shape = new String("");
	Date date;
	int current;
	Cursor()
	{
		current = 0;
		shape = new String("Rectangle");
		cursorPoint = new Point(500, 500);
		mouseCursor = new CursorListener();
		addMouseMotionListener(mouseCursor);
		timerListener = new TimerListener();
		time = new Timer(200,timerListener);
		time.start();
	}
	public void paintComponent (Graphics G)
	{
		super.paintComponent(G);
		Graphics2D g2D = (Graphics2D)G;
		switch (shape)
		{
			case "Rectangle" : 
				g2D.setColor(Color.BLACK);
				g2D.drawRect((int)cursorPoint.getX(),(int)cursorPoint.getY(),10,10);
				break;
			case "Fillrect" :
				g2D.setColor(Color.BLUE);
				g2D.fill(new Rectangle((int)cursorPoint.getX(),(int)cursorPoint.getY(),10,10));
				break;
			case "Ellipse" :
				g2D.setColor(Color.RED);
				g2D.draw(new Ellipse2D.Double(cursorPoint.getX(),cursorPoint.getY(),20,20));
				break;
			default :
				System.out.println("오류가 생겼습니다.");
		}
	}
	private class CursorListener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			cursorPoint.setLocation(arg0.getPoint());
			repaint();
		}
	}
	private class TimerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if(current==0)
			{
				System.out.println("Rectangle로 결정");
				shape="Rectangle";
				current++;
			}
			else if(current==1)
			{
				System.out.println("Fillrect로 결정");
				shape="Fillrect";
				current++;
			}
			else if(current==2)
			{
				System.out.println("Ellips로 결정");
				shape="Ellipse";
				current=0;
			}
			repaint();
		}
		
	}
}

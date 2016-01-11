package question3_MovingClock;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.util.Date;

import javax.swing.Timer;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class MovingClock extends JPanel{
	int mouseX,mouseY;
	Timer time;
	Date current = new Date();
	MouseclickListener mouseListener;
	JLabel print = new JLabel();
	Font printFont = new Font("start",5,45);
	MovingClock()
	{
		current = new Date();
		TimerListener timeListener = new TimerListener();
		mouseListener = new MouseclickListener();
		time = new Timer(1,timeListener);
		addMouseMotionListener(mouseListener);
		time.start();
	}
	public void paintComponent(Graphics G)
	{
		Graphics2D g2 = (Graphics2D)G;
		g2.setColor(Color.GREEN);
		g2.fillRect(0, 0, 500, 500);
		print.setFont(printFont);
		print.setForeground(Color.RED);
		print.setLocation(mouseX, mouseY);
	}
	public class TimerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			current=new Date();
			print.setText(current.getHours()+":"+current.getMinutes()+":"+current.getSeconds());
			add(print);
		}
		
	}
	public class MouseclickListener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			mouseX=arg0.getX();
			mouseY=arg0.getY();
			System.out.println(mouseX);
			System.out.println(mouseY);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			mouseX=arg0.getX();
			mouseY=arg0.getY();
			repaint();
		}
		
	}
}

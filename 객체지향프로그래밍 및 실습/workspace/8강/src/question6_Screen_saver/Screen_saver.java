package question6_Screen_saver;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

import java.util.Random;
import javax.swing.Timer;
public class Screen_saver extends JPanel {
	Line_number Line_Array;
	Line2D.Double Line;
	Timerlistner t;
	Timer time;
	Screen_saver()
	{
		super();
		Line_Array = new Line_number();
		Line = new Line2D.Double();
		t = new Timerlistner();
		time = new Timer(50,t);
		time.start();
	}
	public void paintComponent(Graphics Frame_G)
	{
		Graphics2D G2 = (Graphics2D)Frame_G;
		if (Line_Array.number<100)
		{
			BasicStroke stroke = new BasicStroke(Line_Array.Stroke_Array[Line_Array.number]);
			Color color = new Color(Line_Array.Color_Array[Line_Array.number][0],Line_Array.Color_Array[Line_Array.number][1],Line_Array.Color_Array[Line_Array.number][2]);
			Line.setLine(Line_Array.Line_Array[Line_Array.number][0], Line_Array.Line_Array[Line_Array.number][1], Line_Array.Line_Array[Line_Array.number][2], Line_Array.Line_Array[Line_Array.number][3]);
			G2.setColor(color);
			G2.setStroke(stroke);
			G2.draw(Line);
			Line_Array.number++;
		}
		else
		{
			Line_Array.number=0;
			Line_Array.other_random();
			super.paintComponent(Frame_G);
		}
	}
	public class Timerlistner implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
	
}



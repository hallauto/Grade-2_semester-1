package question1_Random_Line;

import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
public class Line_Graphic extends JComponent {
	public void paintComponent(Graphics Frame_G)
	{
		Graphics2D G2=(Graphics2D) Frame_G;
		Line2D.Double Line = new Line2D.Double(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
		for (int i=0;i<Math.random()*100;i++)
		{
			BasicStroke Basic = new BasicStroke((float)Math.random()*10);
			Color random_color = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
			Line.setLine(Math.random()*200,Math.random()*500,Math.random()*500,Math.random()*500);
			G2.setStroke(Basic);
			G2.draw(Line);
			G2.setColor(random_color);
		}
	}
	
}

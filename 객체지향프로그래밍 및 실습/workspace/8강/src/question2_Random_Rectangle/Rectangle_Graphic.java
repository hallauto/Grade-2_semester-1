package question2_Random_Rectangle;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.BasicStroke;

import javax.swing.JComponent;
public class Rectangle_Graphic extends JComponent {
	public void paintComponent (Graphics Frame_G)
	{
		Graphics2D G2= (Graphics2D)Frame_G;
		Rectangle square = new Rectangle((int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100);
		for (int i=0;i<Math.random()*100;i++)
		{
			BasicStroke Basic = new BasicStroke((float)Math.random()*10);
			Color random = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
			square.setRect(Math.random()*250, Math.random()*250, Math.random()*250, Math.random()*250);
			G2.setStroke(Basic);
			G2.setColor(random);
			G2.draw(square);
		}
	}
}

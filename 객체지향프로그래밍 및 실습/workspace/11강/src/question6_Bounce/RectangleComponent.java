package question6_Bounce;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class RectangleComponent extends JPanel {
	int x=0,y=0,w=50,h=50,x_limit,y_limit;
	boolean direction_x = true,direction_y = true;
	RectangleComponent(int Frame_width,int Frame_height)
	{
		x_limit=Frame_width;
		y_limit=Frame_height;
	}
	public void paintComponent (Graphics G)
	{
		super.paintComponent(G);
		Graphics2D G2 = (Graphics2D) G;
		Rectangle r1 = new Rectangle(x,y,w,h);
		G2.draw(r1);
	}
	public void moveBy(int x_movement,int y_movement)
	{
		if (direction_x)
		{
			if (x+x_movement+w+10<=x_limit)
				x+=x_movement;
			else
			{
				direction_x=false;
			}
		}
		else
		{
			if (x-x_movement>=0)
			{
				x-=x_movement;
			}
			else
			{
				direction_x=true;
			}
		}
		if (direction_y)
		{
			if (y+y_movement+h+25<=y_limit)
			{
				y+=y_movement;	
			}
			else
			{
				direction_y=false;
			}
		}
		else
		{
			if (y-y_movement>=0)
			{
				y-=y_movement;
			}
			else
			{
				direction_y=true;
			}
		}
		repaint();
	}
}

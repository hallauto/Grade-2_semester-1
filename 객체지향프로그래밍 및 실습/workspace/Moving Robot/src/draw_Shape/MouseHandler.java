package draw_Shape;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter{
	int x1,y1,x2,y2;
	MouseHandler(int x1,int y1,int x2,int y2)
	{
		x1=this.x1;
	}
	public void mousePressed(MouseEvent event)
	{
		x1 = event.getX();
		x2 = event.getY();
	}
	public void mouseReleased(MouseEvent event)
	{
		x2 = event.getX();
		y2 = event.getY();
	}
}

package question2_Mouse;

import javax.swing.JPanel;
import java.awt.geom.Ellipse2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MouseCircle extends JPanel{
	MouseHandler mouseListener;
	int center_x,center_y,radious_x,radious_y,radious,x,y,w,h;
	boolean first=true;
	Ellipse2D.Double circle;
	MouseCircle()
	{
		mouseListener = new MouseHandler();
		addMouseListener(mouseListener);
	}
	public void paintComponent (Graphics G)
	{
		System.out.println("그림을 그립니다.");
		Graphics2D G2 = (Graphics2D)G;
		circle = new Ellipse2D.Double(x, y, w, h);
		G2.draw(circle);
	}
	private class MouseHandler extends MouseAdapter
	{
		public void mouseClicked (MouseEvent e)
		{
			System.out.println("클릭 입력");
			if (first)
			{
				center_x=e.getX();
				center_y=e.getY();
				first=false;
			}
			else
			{
				radious_x=e.getX();
				radious_y=e.getY();
				radious=(int)Math.sqrt((Math.abs(radious_x-center_x)*Math.abs(radious_x-center_x)+Math.abs(radious_y-center_y)*Math.abs(radious_y-center_y)));
				x=center_x-radious;
				y=center_y-radious;
				w=radious*2;
				h=radious*2;
				repaint();
			}
		}
	}
}

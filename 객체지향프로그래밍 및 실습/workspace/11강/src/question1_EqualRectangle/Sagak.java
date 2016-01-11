package question1_EqualRectangle;

import java.awt.Rectangle;
import javax.swing.JPanel;

public class Sagak extends JPanel{
	Rectangle r1;
	Sagak(int i,int j)
	{
		r1 = new Rectangle(i,j);
	}
	public boolean equals (Sagak r2)
	{
		if (r1.width==r2.r1.width)
		{
			if (r1.height==r2.r1.height)
			{
				return true;
			}
		}
		return false;
	}
}

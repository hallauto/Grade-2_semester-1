package moving_Robot;

import javax.swing.JComponent;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;

import java.awt.event.MouseMotionListener;

public class DrawParts extends JComponent implements MyRobot{
	int x1,y1,x2,y2;
	boolean direction,accessX,accessY;
	String art;
	Color color;
	Graphics2D drawG;
	DrawParts(int x1_input,int y1_input,int x2_input,int y2_input,String art_input,Color color_input)
	{
			x1=x1_input;
			x2=x2_input;
			y1=y1_input;
			y2=y2_input;
		accessX=false;
		accessY=false;
		direction=true;
		art=art_input;
		color=color_input;
	}
	public void Changedirection(boolean direction_input)
	{
		direction=direction_input;
	}
	public void union (DrawParts body)
	{
		System.out.println("union�Լ� �۵�");
		if ((!accessX)||(!accessY))
		{
			//��ü �޼ҵ� ����
			if (x1<body.x1)
			{
				if (x2<body.x1)
				{
					/*
				 	* ������ ���ʿ� �ְ� �ٵ� ��ġ�� ���� ����
				 	* ��ĥ�� ����(x2>=body.x1)�̵� ��Ų��.
				 	*/
					x1=x1+5;
					x2=x2+5;
				}
				else if (x2>=body.x1)
				{
					accessX = true;
				}
			}
			else if (x1>body.x2)
			{
				/*
				 * ������ �����ʿ� �ְ� �ٵ� ��ġ������ ����
				 * ��ĥ�� ���� (x1<=body.x2)�̵� ��Ų��.
				 */
				if (x1>body.x2)
				{
					x1=x1-5;
					x2=x2-5;
				}
				else if (x1<=body.x2)
				{
					accessX = true;
				}
			}
			//y��ǥ�� ��ü ����
			if (y2<body.y1)
			{
				if (y2<body.y1)
				{
					/*
				 	* ������ ���� �ְ� �ٵ� ��ġ�� ���� ����
				 	* ��ĥ�� ����(y2>=body.y2)�̵� ��Ų��.
				 	*/
					y1=y1+5;
					y2=y2+5;
				}
				else if (y2>=body.y1)
				{
					accessY = true;
				}
			}
			else if (y1>body.y2)
			{
				/*
				 * ������ �����ʿ� �ְ� �ٵ� ��ġ������ ����
				 * ��ĥ�� ���� (y2<=body.y2)�̵� ��Ų��.
				 */
				if (y1>body.y2)
				{
					y1=y1-5;
					y2=y2-5;
				}
				else if (y1<=body.y2)
				{
					accessY = true;
				}
			}
			
		}
	}
	public void draw(Graphics2D G2) 
	{
		drawG=G2;
		G2.setColor(color);
		if (art=="Rectangle")
		{
			G2.fillRect(x1, y1,x2-x1, y2-y1);
		}
		if (art=="Circle")
		{
			G2.fillOval(x1, y1,x2-x1, y2-y1);
		}
		if (art=="Line")
		{
			G2.drawLine(x1, y1, x2, y2);
		}
	}
	{
	}
	public void move()
	{
		/*
		 * drawG�� Robot.G2�� ����Ű�� ����
		 * postcondtion:��ǥ���� +1�ϰ� �� ����� draw�Լ��� �θ�;
		 */
		if (direction)
		{
			x1=x1+5;
			x2=x2+5;
		}
		else
		{
			x1=x1-5;
			x2=x2-5;
		}
	}
}

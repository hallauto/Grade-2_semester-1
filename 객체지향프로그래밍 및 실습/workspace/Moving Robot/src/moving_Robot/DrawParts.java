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
		System.out.println("union함수 작동");
		if ((!accessX)||(!accessY))
		{
			//합체 메소드 제작
			if (x1<body.x1)
			{
				if (x2<body.x1)
				{
					/*
				 	* 파츠가 왼쪽에 있고 바디에 겹치지 않은 상태
				 	* 겹칠때 까지(x2>=body.x1)이동 시킨다.
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
				 * 파츠가 오른쪽에 있고 바디에 겹치지않은 상태
				 * 겹칠때 까지 (x1<=body.x2)이동 시킨다.
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
			//y좌표축 합체 시작
			if (y2<body.y1)
			{
				if (y2<body.y1)
				{
					/*
				 	* 파츠가 위에 있고 바디에 겹치지 않은 상태
				 	* 겹칠때 까지(y2>=body.y2)이동 시킨다.
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
				 * 파츠가 오른쪽에 있고 바디에 겹치지않은 상태
				 * 겹칠때 까지 (y2<=body.y2)이동 시킨다.
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
		 * drawG는 Robot.G2를 가리키고 있음
		 * postcondtion:좌표값을 +1하고 그 값대로 draw함수를 부름;
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

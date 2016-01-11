package my_Zoo;

import javax.swing.JComponent;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class Cage {
	/*
	 * Cages에 들어갈 각각의 우리를 표현하는 객체
	 * Access modifier(접근제한자):private
	 * Point cagePoint
	 * 우리가 위치할 좌표를 저장
	 * Dimension cageDimension
	 * 우리의 width와 height를 저장
	 * Rectangle boundary
	 * 우리의 경계를 저장
	 * 이 경계보다 가로,세로를 5줄여서 우리를 그린다.
	 * 따라서 fillRect(x+5,y+5,width-5,height-5)로 우리 내부를 그린다.
	 */
	private Point 		cagePoint;
	private Dimension	cageDimension;
	private Rectangle 	boundary;
	
	Cage(Point inputPoint)
	{
		/*
		 * cage의 생성자
		 * 인자:Point inputPoint
		 * exception:NullPointerException
		 */
	
		cagePoint = inputPoint;
		cageDimension = new Dimension(300,180);
		boundary = new Rectangle((int)cagePoint.getX(),(int)cagePoint.getY(),(int)cageDimension.getWidth(),(int)cageDimension.getHeight());
	}
	public void drawCage (Graphics2D G2)
	{
		G2.draw(boundary);
		/*
		 * 이 경계보다 가로,세로를 5줄여서 우리를 그린다.
		 * 따라서 fillRect(x+5,y+5,width-5,height-5)로 우리 내부를 그린다.
		 */
		G2.fillRect((int)cagePoint.getX()+5, (int)cagePoint.getY()+5, (int)cageDimension.getWidth()-5, (int)cageDimension.getHeight()-5);
	}
	public Point getPoint()
	{
		return cagePoint;
	}
	public Rectangle getboundery()
	{
		return boundary;
	}
	public Dimension getDimension()
	{
		return cageDimension;
	}
	public void setPoint(Point inputPoint)
	{
		cagePoint=inputPoint;
		boundary = new Rectangle((int)cagePoint.getX(),(int)cagePoint.getY(),(int)cageDimension.getWidth(),(int)cageDimension.getHeight());
	}
	public void setDimension(Dimension inputDimension)
	{
		cageDimension=inputDimension;
		boundary = new Rectangle((int)cagePoint.getX(),(int)cagePoint.getY(),(int)cageDimension.getWidth(),(int)cageDimension.getHeight());
	}
}

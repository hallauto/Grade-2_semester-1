package my_Zoo;

import javax.swing.JComponent;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class Cage {
	/*
	 * Cages�� �� ������ �츮�� ǥ���ϴ� ��ü
	 * Access modifier(����������):private
	 * Point cagePoint
	 * �츮�� ��ġ�� ��ǥ�� ����
	 * Dimension cageDimension
	 * �츮�� width�� height�� ����
	 * Rectangle boundary
	 * �츮�� ��踦 ����
	 * �� ��躸�� ����,���θ� 5�ٿ��� �츮�� �׸���.
	 * ���� fillRect(x+5,y+5,width-5,height-5)�� �츮 ���θ� �׸���.
	 */
	private Point 		cagePoint;
	private Dimension	cageDimension;
	private Rectangle 	boundary;
	
	Cage(Point inputPoint)
	{
		/*
		 * cage�� ������
		 * ����:Point inputPoint
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
		 * �� ��躸�� ����,���θ� 5�ٿ��� �츮�� �׸���.
		 * ���� fillRect(x+5,y+5,width-5,height-5)�� �츮 ���θ� �׸���.
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

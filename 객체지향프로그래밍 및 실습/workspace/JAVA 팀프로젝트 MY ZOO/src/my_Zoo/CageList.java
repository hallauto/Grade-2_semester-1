package my_Zoo;

import javax.swing.JPanel;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
/*
 * Graphics �� �������� �������̽��� ������ �޾ƿ��� ������� ����
 */
import java.awt.Point;

public class CageList {
	
	/*
	 * ArrayList<Cage>list
	 * CageŬ������ ��Ƴ��� ArrayList.
	 * �� CageŬ������ ��輱�� �׸��� ���ڿ� ���õ� ����,�ڽ��� ��ġ��ǥ�� �����Ѵ�.
	 * Access modifier(����������):private
	 * exception:NullPointerException
	 * 		add�� remove������ ������ �־��ٸ� list�� �� ������ �����.
	 */
	
	private ArrayList<Cage> list;
	
	CageList()
	{
		ArrayList<Cage> list = new ArrayList<Cage>();
	}
	
	public void addCage (Point cagePoint)
	{
		Cage makingCage = new Cage(cagePoint);
		list.add(makingCage);
	}
	public void removeCage(int index)
	{
		list.remove(index);
		list.trimToSize();
	}
	public void removeLastCage()
	{
		list.remove(list.size()-1);
	}
	public void drawCage(Graphics2D g2)
	{
		for (int i=0;i<list.size();i++)
		{
			/*
			 * list���� �ϳ��� Cage��ü�� �����´�.
			 * �� ��, Cage���� Point�� Dimension�� ���� �ν��Ͻ��� ����Ѵ�. 
			 */
			Point cagePoint = list.get(i).getPoint();
			Dimension cageDimension = list.get(i).getDimension();
			g2.draw(list.get(i).getboundery());
			/*
			 * �� ��躸�� ����,���θ� 5�ٿ��� �츮�� �׸���.
			 * ���� fillRect(x+5,y+5,width-5,height-5)�� �츮 ���θ� �׸���.
			 */
			g2.fillRect((int)cagePoint.getX()+5, (int)cagePoint.getY()+5, (int)cageDimension.getWidth()-5, (int)cageDimension.getHeight()-5);
		}
	}
}

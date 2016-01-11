package my_Zoo;

import javax.swing.JPanel;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
/*
 * Graphics 는 성민이의 인터페이스에 있으니 받아오자 뺐어오자 ㅎㅎ
 */
import java.awt.Point;

public class CageList {
	
	/*
	 * ArrayList<Cage>list
	 * Cage클래스를 담아놓는 ArrayList.
	 * 각 Cage클래스는 경계선을 그리는 상자와 선택된 색깔,자신의 위치좌표가 존재한다.
	 * Access modifier(접근제한자):private
	 * exception:NullPointerException
	 * 		add나 remove과정에 오류가 있었다면 list에 빈 공간이 생긴다.
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
			 * list에서 하나씩 Cage객체를 꺼내온다.
			 * 이 때, Cage안의 Point와 Dimension은 각각 인스턴스에 백업한다. 
			 */
			Point cagePoint = list.get(i).getPoint();
			Dimension cageDimension = list.get(i).getDimension();
			g2.draw(list.get(i).getboundery());
			/*
			 * 이 경계보다 가로,세로를 5줄여서 우리를 그린다.
			 * 따라서 fillRect(x+5,y+5,width-5,height-5)로 우리 내부를 그린다.
			 */
			g2.fillRect((int)cagePoint.getX()+5, (int)cagePoint.getY()+5, (int)cageDimension.getWidth()-5, (int)cageDimension.getHeight()-5);
		}
	}
}

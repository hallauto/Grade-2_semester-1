package moving_Robot;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import java.io.FileReader;
import java.io.PrintWriter;

import java.util.ArrayList;

public class Robot extends JPanel{
	int x1,y1,x2,y2;
	ArrayList<DrawParts> components;
	DrawParts leftArm;
	DrawParts rightArm;
	DrawParts body;
	TimerListener timeListener;
	Timer moveTime,fusionTime;
	
	MouseHandler mouseHandler;
	JButton moveButton,unionButton;
	MoveHandler moveHandler;
	UnionHandler unionHandler;
	FusionTimerListener fusionTimerListener;
	JComboBox comboBox;
	JRadioButton radioRED,radioGREEN,radioBLUE;
	ButtonGroup buttons;
	Robot()
	{
		mouseHandler = new MouseHandler();
		addMouseListener(mouseHandler);
		components = new ArrayList<DrawParts>();
		timeListener = new TimerListener();
		moveTime = new Timer(10,timeListener);
		moveButton = new JButton("Let's move!!");
		moveHandler = new MoveHandler();
		moveButton.addActionListener(moveHandler);
		fusionTimerListener = new FusionTimerListener();
		fusionTime = new Timer(10,fusionTimerListener);
		unionButton = new JButton("Final fusion approved!!");
		unionHandler = new UnionHandler();
		unionButton.addActionListener(unionHandler);
		comboBox = new JComboBox();
		comboBox.addItem("Rectangle");
		comboBox.addItem("Circle");
		comboBox.addItem("Line");
		buttons = new ButtonGroup();
		radioRED = new JRadioButton("Red");
		radioGREEN = new JRadioButton("Green");
		radioBLUE = new JRadioButton("Blue");
		buttons.add(radioRED);
		buttons.add(radioGREEN);
		buttons.add(radioBLUE);
		add(radioRED);
		add(radioGREEN);
		add(radioBLUE);
		add(comboBox);
		add(moveButton);
		add(unionButton);
	}
	public void Save()
	{
		
	}
	public void paintComponent(Graphics G)
	{
		/*
		 * ArrayList인 components에 있는 모든 도형을 전부 draw시킨다.
		 */
		super.paintComponent(G);
		Graphics2D G2 = (Graphics2D)G;
		for (int i=0;i<components.size();i++)
		{
			components.get(i).draw(G2);
		}
		
	}
	public void Findbody()
	{
		body=components.get(0);
		System.out.println("find body작동");
		for (int i=1;i<components.size();i++)
		{
			if (Math.abs(components.get(i-1).x1-200)>Math.abs(components.get(i).x1-200))
			{
				body=components.get(i);
				System.out.println("body 변경");
			}
		}
	}
	public void Findarm()
	{
		leftArm=components.get(0);
		rightArm=components.get(0);
		System.out.println("FindArm작동");
		for (int i=1;i<components.size();i++)
		{
			/*
			 * leftArm(화면 기준 가장 왼쪽에 있는 도형을 찾는다.)
			 * 따라서 가장 x1이 작은 도형이 leftArm이 된다.
			 */
			if (components.get(i-1).x1>components.get(i).x1)
			{
				leftArm=components.get(i);
				System.out.println("leftArm변경");
			}
			/*
			 * rightArm(화면 기준 가장 오른쪽에 있는 도형을 찾는다.)
			 * 따라서 가장 x2가 큰 도형이 rightArm이 된다.
			 */
			if (components.get(i-1).x2<components.get(i).x2)
			{
				rightArm=components.get(i);
				System.out.println("rightArm 변경");
			}
		}
	}
	public class MouseHandler extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			x1 = event.getX();
			y1 = event.getY();
		}
		public void mouseReleased(MouseEvent event)
		{
			if(comboBox.getSelectedItem()=="Line")
			{/*라인일때는 무시하는거야 ㅇㅇ
			  *
			  */
				System.out.println("Line인 경우");
				x2=event.getX();
				y2=event.getY();
			}
		else
		{
			if (event.getX()<x1)
			{
				x2=x1;
				x1=event.getX();
			}
			else
			{
				x2=event.getX();
			}
			if (event.getY()<y1)
			{
				y2=y1;
				y1=event.getY();
			}
			else
			{
				y2=event.getY();
			}
			/*
			 * 선택된 RadioButton객체를 찾아서 그에 맞춰 Color변수를 정하고 
			 * DrawParts 객체를 만들어서 ArrayList인 components에 넣는다.
			 */
		}
			if (radioRED.isSelected())
			{
				DrawParts part = new DrawParts(x1,y1,x2,y2,(String)comboBox.getSelectedItem(),Color.RED);
				components.add(part);
			}
			if (radioGREEN.isSelected())
			{
				DrawParts part = new DrawParts(x1,y1,x2,y2,(String)comboBox.getSelectedItem(),Color.GREEN);
				components.add(part);
			}
			if (radioBLUE.isSelected())
			{
				DrawParts part = new DrawParts(x1,y1,x2,y2,(String)comboBox.getSelectedItem(),Color.BLUE);
				components.add(part);
			}
			repaint();
			if (components.size()>0)
			{
				Findarm();
				Findbody();
			}
		}
	}
	public class MoveHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			moveTime.start();
		}
	}
	public class UnionHandler implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			fusionTime.start();
		}
	}
	public class FusionTimerListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			for (int i=0;i<components.size();i++)
			{
				components.get(i).union(body);
			}
			repaint();
		}
	}
	public class TimerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (leftArm.x1<0)
			{
				System.out.println("왼쪽에서 오른쪽으로 이동");
				/*
				 * 왼쪽에서 오른쪽으로 이동하도록 방향 변경(true)
				 */
				for (int i=0;i<components.size();i++)
				{
					components.get(i).Changedirection(true);
				}
			}
			if (rightArm.x2>600)
			{
				System.out.println("오른쪽에서 왼쪽으로 이동");
				/*
				 * 오른쪽에서 왼쪽으로 이동하도록 방향변경(false)
				 */
				for (int i=0;i<components.size();i++)
				{
					components.get(i).Changedirection(false);
				}
			}
			/*
			 * 이제 모든 파츠를 move함수로 이동시킨다.
			 */
			for (int i=0;i<components.size();i++)
			{
				components.get(i).move();
			}
			repaint();
		}
	}
}

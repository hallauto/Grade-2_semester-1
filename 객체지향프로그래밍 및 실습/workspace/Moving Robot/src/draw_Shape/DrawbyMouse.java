package draw_Shape;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawbyMouse extends JPanel{
	Color setColor;
	Rectangle rectangle;
	Line2D line;
	Ellipse2D ellipse;
	ArrayList<Object> shapes;
	String shpae;
	
	JComboBox comboBox;
	JRadioButton radio1,radio2,radio3;
	ButtonGroup buttons;
	DrawbyMouse()
	{
		addMouseListener(new MouseHandler());
		comboBox = new JComboBox();
		comboBox.addItem("Rectangle");
		comboBox.addItem("Circle");
		comboBox.addItem("Line");
		buttons = new ButtonGroup();
		radio1 = new JRadioButton("Red");
		radio2 = new JRadioButton("Green");
		radio3 = new JRadioButton("Blue");
		buttons.add(radio1);
		buttons.add(radio2);
		buttons.add(radio3);
		add(radio1);
		add(radio2);
		add(radio3);
		add(comboBox);
	}
	int x1,y1,x2,y2;
	public void paintComponent (Graphics G)
	{
		Graphics2D G2 = (Graphics2D)G;
		if (radio1.isSelected())
		{
			G2.setColor(Color.RED);
		}
		else if(radio2.isSelected())
		{
			G2.setColor(Color.GREEN);
		}
		else if(radio3.isSelected())
		{
			G2.setColor(Color.BLUE);
		}
		if (comboBox.getSelectedItem()=="Rectangle")
		{
			G2.fillRect(x1,y1,x2-x1,y2-y1);
		}
		else if(comboBox.getSelectedItem()=="Line")
		{
			line = new Line2D.Double(x1,y1,x2,y2);
			G2.draw(line);
		}
		else if (comboBox.getSelectedItem()=="Circle")
		{
			G2.fillOval(x1,y1,x2-x1,y2-y1);
		}
	}
	public class MouseHandler extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			x1 = event.getX();
			y1 = event.getY();
			repaint();
		}
		public void mouseReleased(MouseEvent event)
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
			repaint();
		}
	}
}


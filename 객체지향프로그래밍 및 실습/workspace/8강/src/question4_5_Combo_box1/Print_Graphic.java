package question4_5_Combo_box1;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JComboBox;
public class Print_Graphic extends JPanel{
	private String select;
	private JComboBox combo;
	private	JCombolistener J;
	
	Print_Graphic()
	{
		J= new JCombolistener();
		setLayout(new BorderLayout());
		combo = new JComboBox();
		combo.addItem("");
		combo.addItem("Rectangle");
		combo.addItem("Line");
		combo.addItem("Circle");
		combo.addActionListener(J);
		add(combo,BorderLayout.BEFORE_FIRST_LINE);
	}
	public void paintComponent(Graphics Frame_G)
	{
		Graphics2D G2=(Graphics2D)Frame_G;
		select=(String)combo.getSelectedItem();
		switch (select)
		{
		case "Rectangle":
		{
			Rectangle square = new Rectangle((int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100);
			G2.draw(square);
			for (int i=0;i<Math.random()*100;i++)
			{
				BasicStroke Basic = new BasicStroke((float)Math.random()*10);
				Color random = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
				square.setRect(Math.random()*250, Math.random()*250, Math.random()*250, Math.random()*250);
				G2.setStroke(Basic);
				G2.setColor(random);
				System.out.println();
				G2.draw(square);
			}
			break;
		}
		case "Line":
		{
			Line2D.Double Line = new Line2D.Double(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
			G2.draw(Line);
			for (int i=0;i<Math.random()*100;i++)
			{
				BasicStroke Basic = new BasicStroke((float)Math.random()*10);
				Color random_color = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
				Line.setLine(Math.random()*200,Math.random()*500,Math.random()*500,Math.random()*500);
				G2.setStroke(Basic);
				G2.setColor(random_color);
				G2.draw(Line);
			}
			break;
		}
		case "Circle":
		{
			Ellipse2D.Double Circle = new Ellipse2D.Double(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
			G2.draw(Circle);
			for (int i=0;i<Math.random()*100;i++)
			{
				BasicStroke Basic = new BasicStroke((float)Math.random()*10);
				Color random_color = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
				Circle.setFrame(Math.random()*100,Math.random()*100 , Math.random()*100, Math.random()*100);
				G2.setStroke(Basic);
				G2.setColor(random_color);
				G2.draw(Circle);
			}
			break;
		}
		default :
		{
			Rectangle square = new Rectangle((int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100,(int)Math.random()*100);
			G2.draw(square);
			for (int i=0;i<20;i++)
			{
				BasicStroke Basic = new BasicStroke((float)Math.random()*10);
				Color random = new Color((int)(Math.random()*100)%256,(int)(Math.random()*100)%256,(int)(Math.random()*100)%256);
				square.setRect(Math.random()*250, Math.random()*250, Math.random()*250, Math.random()*250);
				G2.setStroke(Basic);
				G2.setColor(random);
				G2.draw(square);
			}
			break;
		}
		}
	}
	public class JCombolistener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
		
	}
}

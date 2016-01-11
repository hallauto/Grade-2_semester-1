package question6_JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class MakeCircle extends JPanel{
	int x,y;
	double r;
	JButton button = new JButton("Make Circle");
	ButtonHandler buttonHandler = new ButtonHandler();
	MakeCircle(int x,int y,double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		setLayout(new BorderLayout());
		button.addActionListener(buttonHandler);
		add(button,BorderLayout.SOUTH);
	}
	public void paintComponent(Graphics G)
	{
		super.paintComponent(G);
		Graphics2D G2 = (Graphics2D)G;
		Ellipse2D circle = new Ellipse2D.Double(x,y,r,r);
		G2.draw(circle);
	}
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			x= Integer.parseInt(JOptionPane.showInputDialog("What is X?"));
			y= Integer.parseInt(JOptionPane.showInputDialog("What is Y?"));
			r= Integer.parseInt(JOptionPane.showInputDialog("How many radious?"));
			repaint();
		}
		
	}
}

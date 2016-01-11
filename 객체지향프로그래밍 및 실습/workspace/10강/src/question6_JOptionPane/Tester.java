package question6_JOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tester {
	public static void main(String agrs[])
	{
		int x= Integer.parseInt(JOptionPane.showInputDialog("What is X?"));
		int y= Integer.parseInt(JOptionPane.showInputDialog("What is Y?"));
		double r= Integer.parseInt(JOptionPane.showInputDialog("How many radious?"));
		MakeCircle circle = new MakeCircle(x,y,r);
		JFrame myFrame = new JFrame();
		myFrame.setSize(x*3+(int)r*3, y*3+(int)r*3);
		myFrame.setTitle("Make Circle");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(circle);
		myFrame.setVisible(true);
	}
}

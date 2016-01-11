package question2_Mouse;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		MouseCircle circle = new MouseCircle();
		JFrame myFrame = new JFrame();
		myFrame.setSize(500,500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Circle");
		myFrame.add(circle);
		myFrame.setVisible(true);
	}
}

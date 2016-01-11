package question3_MovingClock;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		JFrame myFrame = new JFrame();
		MovingClock input = new MovingClock();
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("question3");
		myFrame.add(input);
		myFrame.setVisible(true);
	}
}

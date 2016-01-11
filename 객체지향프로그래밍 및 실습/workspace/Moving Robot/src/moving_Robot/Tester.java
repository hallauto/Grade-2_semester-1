package moving_Robot;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		Robot myRobot = new Robot();
		JFrame myFrame = new JFrame();
		myFrame.setTitle("My Robot");
		myFrame.setSize(600, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myRobot);
		myFrame.setVisible(true);
	}
}

package we_are_Frame;

import javax.swing.JFrame;

public class Tester {
	public static void main(String[] agrs)
	{
		Frame1 input = new Frame1();
		JFrame myFrame = new JFrame();
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Frame test");
		myFrame.add(input);
		myFrame.setVisible(true);
	}
}

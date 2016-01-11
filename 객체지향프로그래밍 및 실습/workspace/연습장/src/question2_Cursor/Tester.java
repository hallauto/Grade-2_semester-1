package question2_Cursor;

import javax.swing.JFrame;

public class Tester {
	public static void main(String[] agrs)
	{
		Cursor inputPanel = new Cursor();
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Cursor");
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(inputPanel);
		myFrame.setVisible(true);
	}
}

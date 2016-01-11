package question4_ButtonViewer;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		ButtonViewer button = new ButtonViewer();
		JFrame myFrame = new JFrame();
		myFrame.setSize(200,100);
		myFrame.setTitle("ButtonViewer");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(button);
		myFrame.setVisible(true);
	}
}

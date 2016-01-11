package question5_Two_ButtonViewer;

import javax.swing.JFrame;

import question4_ButtonViewer.ButtonViewer;

public class Tester {
	public static void main(String agrs[])
	{
		TwoButtonViewer button = new TwoButtonViewer();
		JFrame myFrame = new JFrame();
		myFrame.setSize(200,200);
		myFrame.setTitle("ButtonViewer");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(button);
		myFrame.setVisible(true);
	}
}

package question6_Change_Rectagle;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		int widthFrame=500,heightFrame=500;
		JFrame myFrame = new JFrame();
		Radio_Rectangle inputPanel = new Radio_Rectangle(widthFrame,heightFrame);
		myFrame.setSize(widthFrame, heightFrame);
		myFrame.setTitle("Radio Rectangle");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(inputPanel);
		myFrame.setVisible(true);
	}
}

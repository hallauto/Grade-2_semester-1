package question1_ScreenSaver;

import javax.swing.JFrame;

public class Tester {
	   public static void main(String[] args)
	{
		int frameX=500,frameY=500;
		JFrame myFrame = new JFrame();
		ScreenSaver saver = new ScreenSaver(frameX,frameY);
		myFrame.setTitle("ScreenSaver");
		myFrame.setSize(frameX,frameY);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(saver);
		myFrame.setVisible(true);
	}
}

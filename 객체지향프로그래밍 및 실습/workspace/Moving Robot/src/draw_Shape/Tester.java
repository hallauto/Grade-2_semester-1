package draw_Shape;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrsp[])
	{
		DrawbyMouse panel = new DrawbyMouse();
		JFrame myFrame = new JFrame();
		myFrame.setSize(600,600);
		myFrame.setTitle("Draw by Mouse");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(panel);
		myFrame.setVisible(true);
	}
}

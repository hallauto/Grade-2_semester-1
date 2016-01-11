package question3_Circle;

import javax.swing.JFrame;
public class Tester {
	public static void main(String agrs[])
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Draw Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle_Graphics Circle = new Circle_Graphics(10);
		frame.add(Circle);
		frame.setVisible(true);
	}
}

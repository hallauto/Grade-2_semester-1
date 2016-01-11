package question2_Random_Rectangle;

import javax.swing.JFrame;
public class Tester {
	public static void main(String agrs[])
	{
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Random Rectangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rectangle_Graphic Square = new Rectangle_Graphic();
		frame.add(Square);
		frame.setVisible(true);
	}
}

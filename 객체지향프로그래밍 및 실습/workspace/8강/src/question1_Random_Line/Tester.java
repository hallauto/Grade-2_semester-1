package question1_Random_Line;

import javax.swing.JFrame;
public class Tester {
	public static void main(String agrs[])
	{
		JFrame Myframe = new JFrame();
		Myframe.setSize(500, 500);
		Myframe.setTitle("Random Line");
		Myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Line_Graphic Line = new Line_Graphic();
		Myframe.add(Line);
		Myframe.setVisible(true);
	}
	
}

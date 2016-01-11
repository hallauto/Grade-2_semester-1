package question2_calculate;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		JFrame My_Frame = new JFrame();
		TextFieldFrame Panel = new TextFieldFrame();
		My_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		My_Frame.setSize(350,100);
		My_Frame.add(Panel);
		My_Frame.setVisible(true);
	}
}

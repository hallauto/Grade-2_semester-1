package question4_5_Combo_box1;

import javax.swing.JFrame;

public class Tester {
	public static void main(String args[])
	{
		JFrame My_Frame = new JFrame();
		My_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		My_Frame.setTitle("JAVA ComboBox");
		My_Frame.setSize(500, 500);
		Print_Graphic Combo = new Print_Graphic();
		My_Frame.add(Combo);
		My_Frame.setVisible(true);
	}
}

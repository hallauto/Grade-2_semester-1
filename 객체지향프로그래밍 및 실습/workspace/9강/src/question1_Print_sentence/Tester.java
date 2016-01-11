package question1_Print_sentence;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tester {
	public static void main(String agrs[])
	{
		JFrame Myframe = new JFrame();
		JtextFrame input = new JtextFrame(JOptionPane.showInputDialog("Enter your name"));
		Myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Myframe.setSize(500, 500);
		Myframe.setTitle("input name");
		Myframe.add(input);
		Myframe.setVisible(true);
	}

}

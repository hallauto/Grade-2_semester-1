package question3_Mile_per_Gallon;

import javax.swing.JFrame;

public class Tester {
	public static void main(String agrs[])
	{
		Calculate calculater = new Calculate(0);
		JFrame myFrame = new JFrame();
		myFrame.setSize(350,100);
		myFrame.setTitle("Mile per Gallon Calculater");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(calculater);
		myFrame.setVisible(true);
	}
}

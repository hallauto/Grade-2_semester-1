package question5_JOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tester {
	public static void main(String agrs[])
	{
		int count= Integer.parseInt(JOptionPane.showInputDialog("How many rectangle is need?"));
		int widthFrame = 500, heightFrame=500;
		Paint_Rectagle inputPannel = new Paint_Rectagle(widthFrame,heightFrame,count);
		String title = new String("JOptionPane");
		JFrame myFrame= new JFrame();
		myFrame.setSize(widthFrame, heightFrame);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle(title);
		myFrame.add(inputPannel);
		myFrame.setVisible(true);
	}
}

package question4_Text;

import javax.swing.JFrame;
import java.util.Scanner;

public class Tester {
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Message");
		String param = input.nextLine();
		RandomText com = new RandomText(param);
		JFrame myFrame = new JFrame();
		myFrame.setSize(500, 500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Question 4");
		myFrame.add(com);
		myFrame.setVisible(true);
	}
}

package question4_Item_cost;

import javax.swing.JFrame;

public class Tester {
	public static void main(String args[])
	{
		Item inputComponent = new Item();
		JFrame myFrame = new JFrame();
		myFrame.setSize(350,100);
		myFrame.setTitle("Item Cost");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(inputComponent);
		myFrame.setVisible(true);
	}
}

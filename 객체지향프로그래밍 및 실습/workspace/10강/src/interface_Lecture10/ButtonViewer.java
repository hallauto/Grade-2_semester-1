package interface_Lecture10;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewer extends JPanel{
	int count;
	JLabel outputText;
	JButton button;
	ButtonHandler handler1;
	protected ButtonViewer()
	{
		button = new JButton("Click me!!");
		handler1 = new ButtonHandler();
		outputText = new JLabel("I was clicked "+count+" times!");
		button.addActionListener(handler1);
		add(button);
		add(outputText);
	}
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			count++;
			outputText.setText("I was clicked "+count+" times!");
		}
	}
}

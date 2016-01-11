package question5_Two_ButtonViewer;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interface_Lecture10.ButtonViewer;

public class TwoButtonViewer extends ButtonViewer{
	int count2;
	JButton twoButton;
	JLabel twoLabel;
	TwoButtonHandler twoButtonHandler;
	TwoButtonViewer() {
		super();
		twoButton = new JButton("Click me Too!!");
		twoButtonHandler = new TwoButtonHandler();
		twoButton.addActionListener(twoButtonHandler);
		twoLabel = new JLabel("I was clicked "+count2+" times!");
		add(twoButton);
		add(twoLabel);
	}

	private class TwoButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			count2++;
			twoLabel.setText("I was clicked "+count2+" times!");
		}
	}
}

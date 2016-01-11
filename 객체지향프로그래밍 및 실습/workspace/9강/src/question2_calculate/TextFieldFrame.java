package question2_calculate;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TextFieldFrame extends JPanel{
	private JLabel Textlabel;
	private JLabel Answerlabel;
	private JTextField textField1;
	private JButton plainJButton;
	
	public TextFieldFrame()
	{
		setLayout(new BorderLayout());
		plainJButton = new JButton("Change");
		Textlabel = new JLabel("Enter the reading in CelSius");
		Answerlabel = new JLabel("will show that F");
		add(Textlabel,BorderLayout.NORTH);
		add(plainJButton,BorderLayout.EAST );
		add(Answerlabel,BorderLayout.SOUTH);
		textField1 = new JTextField(5);
		add(textField1,BorderLayout.CENTER);
		TextFieldHandler handler = new TextFieldHandler();
		plainJButton.addActionListener(handler);
		add(Answerlabel,BorderLayout.SOUTH);

	}
	private class  TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double F;
			F=(Double.parseDouble(textField1.getText())*9/5+32);
			Answerlabel.setText(Double.toString(F));
		}
	}
}

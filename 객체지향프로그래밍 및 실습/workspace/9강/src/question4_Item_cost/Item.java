package question4_Item_cost;

import javax.swing.event.AncestorListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Item extends JPanel{
	JLabel introduceLabel1,introduceLabel2,outputLabel;
	JButton changeButton;
	ButtonHendler buttonHendler;
	JTextField inputTextField,taxTextField;
	int inputPrice,taxCost;
	Item()
	{
		setLayout(new GridLayout(3,2));
		/*
		 * ������
		 * parameter:����
		 * precondition:����
		 * postcondition:�ν��Ͻ����� �ּ��� ������ ���� Component�� ����־���Ѵ�.
		 * (1)�⺻������ ���� JTextField(inputTextField)
		 * (2)�������� ���� JTextField(taxTextField)
		 * (3)����� ����� JLabel(outputLabel)
		 * (4)��ȯ�� ����� JButton(changeButton)�� ActionListner�� ���� ButtonHendler�� add�Ǿ�� �Ѵ�.
		 */
		introduceLabel1 = new JLabel("input cost");
		introduceLabel2 = new JLabel("input tax");
		outputLabel = new JLabel("");
		changeButton = new JButton("Change");
		inputTextField = new JTextField(4);
		taxTextField = new JTextField(4);
		buttonHendler = new ButtonHendler();
		changeButton.addActionListener(buttonHendler);
		add(inputTextField);
		add(introduceLabel1);
		add(taxTextField);
		add(introduceLabel2);
		add(outputLabel);
		add(changeButton);
	}
	private class ButtonHendler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			inputPrice=Integer.parseInt(inputTextField.getText());
			taxCost=Integer.parseInt(taxTextField.getText());
			outputLabel.setText("whole price is $"+ (inputPrice*taxCost/100+inputPrice));
		}
	}
}

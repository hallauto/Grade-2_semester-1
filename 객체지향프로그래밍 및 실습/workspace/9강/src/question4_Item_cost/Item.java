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
		 * 생성자
		 * parameter:없음
		 * precondition:없음
		 * postcondition:인스턴스에는 최소한 다음과 같은 Component가 들어있어야한다.
		 * (1)기본가격을 적을 JTextField(inputTextField)
		 * (2)세금율을 적을 JTextField(taxTextField)
		 * (3)결과를 출력할 JLabel(outputLabel)
		 * (4)변환을 명령할 JButton(changeButton)은 ActionListner에 따라서 ButtonHendler가 add되어야 한다.
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

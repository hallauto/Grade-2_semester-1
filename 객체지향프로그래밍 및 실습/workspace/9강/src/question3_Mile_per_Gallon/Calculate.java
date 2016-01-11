package question3_Mile_per_Gallon;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate extends JPanel{
	double gas;
	double mile;
	double MPG;

	JLabel topText;
	/*
	 * ����� ���α׷����� �ؽ�Ʈ�ʵ� ���� ��Ÿ�� ����.
	 * postcondition:��� ��쿡�� �����Ǿ�� �ȵȴ�.
	 */
	JLabel bottomText;
	/*
	 * ����� ���α׷����� �ؽ�Ʈ�ʵ� �Ʒ��� ��Ÿ�� ����.
	 * �̰����� MPG���� ����Ѵ�.
	 * postcondition:�������� MPG���� ������ MPG���� ����ϰ�, �׿��� ��쿡�� default ������ ����Ѵ�.
	 */
	JTextField inputField;
	/*
	 * �Է��� �� �ؽ�Ʈ�ʵ�� ���� �ν��Ͻ��� �����.
	 */
	JButton changeButton;
	/*
	 * ���� changeButton�� ��ȯ�� ������ ��ư�� �����.
	 */
	ButtonListener buttonListener;
	Calculate(double gas)
	{
		/*
		 * ������
		 * gas������ �Է°��� �ִ´�.
		 * precondition:gas>=0;
		 * postcondition:��� ������ �ν��Ͻ��� ���������� ��������� �Ѵ�.
		 * throw:OutOfMemory
		 */
		setLayout(new BorderLayout());
		if (gas>=0)
		{
			this.gas=gas;
			mile=100;
			topText = new JLabel("Gas per MPG Calculater");
			bottomText = new JLabel("will show MPG"); //default��
			inputField = new JTextField(5);
			changeButton = new JButton("Change");
			buttonListener = new ButtonListener();
			changeButton.addActionListener(buttonListener);
			add(topText,BorderLayout.NORTH);
			add(bottomText,BorderLayout.SOUTH);
			add(inputField,BorderLayout.CENTER);
			add(changeButton,BorderLayout.EAST);
		}
		else
		{
			this.gas=0;
			mile=100;
			topText = new JLabel("Gas per MPG Calculater");
			bottomText = new JLabel("will show MPG"); //default��
			inputField = new JTextField(5);
			changeButton = new JButton("Change");
			buttonListener = new ButtonListener();
			changeButton.addActionListener(buttonListener);
			add(topText,BorderLayout.NORTH);
			add(bottomText,BorderLayout.SOUTH);
			add(inputField,BorderLayout.CENTER);
			add(changeButton,BorderLayout.EAST);
		}
	}
	public void change()
	{
		MPG=mile/gas;
	}
	private class ButtonListener implements ActionListener
	{
		/*
		 * JButton �ν��Ͻ��� �߰��� Action_Listener
		 * postcondition:actionPerformed �޼ҵ尡 �����۵��ؾ��Ѵ�.
		 */
		public void actionPerformed(ActionEvent E)
		{
			/*
			 * ActionListener�� �ʼ� �Լ� ����
			 * �� �޼ҵ忡�� JTextField���� �Էµ� ���� gas�� ����, �޼ҵ� change�� �۵����Ѽ� ��ȯ�� �̵��Ÿ� ���� MPG�� �ִ´�.
			 * precondition:gas>=0
			 * postcondition:MPG>=0�̰� ��ȯ�� MPG���� String���� �ٲٰ� �������Ͽ� JLabel bottomText�� setText�޼ҵ带 �۵���Ų��.
			 */
			gas=Double.parseDouble(inputField.getText());
			change();
			bottomText.setText(Double.toString(MPG));
		}
	}
}

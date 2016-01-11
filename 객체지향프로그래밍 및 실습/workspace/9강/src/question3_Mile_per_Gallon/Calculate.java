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
	 * 실행된 프로그램에서 텍스트필드 위에 나타날 글자.
	 * postcondition:어떠한 경우에도 변형되어서는 안된다.
	 */
	JLabel bottomText;
	/*
	 * 실행된 프로그램에서 텍스트필드 아래에 나타날 글자.
	 * 이곳에서 MPG값을 출력한다.
	 * postcondition:정상적인 MPG값이 나오면 MPG값을 출력하고, 그외의 경우에는 default 문구를 출력한다.
	 */
	JTextField inputField;
	/*
	 * 입력을 할 텍스트필드는 위의 인스턴스가 만든다.
	 */
	JButton changeButton;
	/*
	 * 위의 changeButton이 변환을 지시할 버튼을 만든다.
	 */
	ButtonListener buttonListener;
	Calculate(double gas)
	{
		/*
		 * 생성자
		 * gas변수에 입력값을 넣는다.
		 * precondition:gas>=0;
		 * postcondition:모든 변수와 인스턴스가 정상적으로 만들어져야 한다.
		 * throw:OutOfMemory
		 */
		setLayout(new BorderLayout());
		if (gas>=0)
		{
			this.gas=gas;
			mile=100;
			topText = new JLabel("Gas per MPG Calculater");
			bottomText = new JLabel("will show MPG"); //default값
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
			bottomText = new JLabel("will show MPG"); //default값
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
		 * JButton 인스턴스에 추가될 Action_Listener
		 * postcondition:actionPerformed 메소드가 정상작동해야한다.
		 */
		public void actionPerformed(ActionEvent E)
		{
			/*
			 * ActionListener의 필수 함수 구현
			 * 이 메소드에서 JTextField에서 입력된 값을 gas로 전송, 메소드 change를 작동시켜서 변환된 이동거리 값을 MPG에 넣는다.
			 * precondition:gas>=0
			 * postcondition:MPG>=0이고 변환된 MPG값을 String으로 바꾸고 변수로하여 JLabel bottomText의 setText메소드를 작동시킨다.
			 */
			gas=Double.parseDouble(inputField.getText());
			change();
			bottomText.setText(Double.toString(MPG));
		}
	}
}

package question6_Change_Rectagle;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Radio_Rectangle extends JPanel{
/*
 * 라디오 버튼에 맞춰 색상이 바뀌는 사각형을 만드는 클래스
 * 사각형을 만들기위해 Rectangle필요(크기와 위치는 정수를 이용해 고정)
 * 라디오 버튼과 그에 따라 생성되는 Color 인스턴스 필요
 * JPanel과 BorderLayout을 이용해 라디오버튼을 NORTH에 위치 시킬 것
 */
	int widthFrame,heightFrame;
	Color selectColor;
	BasicStroke stroke;
	Rectangle inputRectangle;
	JButton changeButton;
	JRadioButton redButton;
	JRadioButton blueButton;
	JRadioButton greenButton;
	ButtonGroup radioGroup;
	ButtonHandler buttonHandler;
	Radio_Rectangle(int widthFrame,int heightFrame)
	{
		setLayout(new FlowLayout());
		this.widthFrame=widthFrame;
		this.heightFrame=heightFrame;
		changeButton = new JButton("Change Color");
		selectColor = new Color(255,0,0);
		redButton = new JRadioButton("Red");
		blueButton = new JRadioButton("Blue");
		greenButton = new JRadioButton("Green");
		radioGroup = new ButtonGroup();
		buttonHandler = new ButtonHandler(Color.RED);
		radioGroup.add(blueButton);
		radioGroup.add(redButton);
		radioGroup.add(greenButton);
		add(redButton);
		add(blueButton);
		add(greenButton);
		changeButton.addActionListener(buttonHandler);
		add(changeButton,BorderLayout.SOUTH);
		repaint();
	}
	public void paintComponent(Graphics G)
	{
		super.paintComponent(G);
		G.setColor(selectColor);
		G.fillRect(widthFrame/5*2, heightFrame/5*2, widthFrame/5, heightFrame/5);
	}
	private class ButtonHandler implements ActionListener
	{
		private Color inputColor;
		public ButtonHandler(Color inputColor)
		{
			this.inputColor = inputColor;
		}
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println(radioGroup.getSelection());
			System.out.println(redButton);
			if (redButton.isSelected())
			{
				selectColor=Color.RED;
			}
			else if (greenButton.isSelected())
			{
				selectColor=Color.GREEN;
			}
			else if (blueButton.isSelected())
			{
				selectColor=Color.blue;
			}
			repaint();
		}
	}
}

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
 * ���� ��ư�� ���� ������ �ٲ�� �簢���� ����� Ŭ����
 * �簢���� ��������� Rectangle�ʿ�(ũ��� ��ġ�� ������ �̿��� ����)
 * ���� ��ư�� �׿� ���� �����Ǵ� Color �ν��Ͻ� �ʿ�
 * JPanel�� BorderLayout�� �̿��� ������ư�� NORTH�� ��ġ ��ų ��
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

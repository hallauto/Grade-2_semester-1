package zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Controler extends JPanel {
	JComboBox<String> animalComboBox;
	JButton animalDrawButton;
	JLabel animalLabel;
	JButton cageDrawButton;
	JLabel cageLabel;
	JButton clearButton;
	ActionListener listener;
	int mode;
	Sound sound;

	Controler() {
		mode = 0;
		cageLabel = new JLabel("Cage");
		cageDrawButton = new JButton("Select");
		animalLabel = new JLabel("Animal");
		animalDrawButton = new JButton("Select");
		clearButton = new JButton("Clear");
		animalComboBox = new JComboBox<String>();
		{
			String[] animalName = { "��", "����", "���", "�⸰", "�ڳ���", "������" };
			for (int i = 0; i < animalName.length; i++)
				animalComboBox.addItem(animalName[i]);
		}
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		{
			add(cageLabel);
			add(cageDrawButton);
			animalDrawButton.setSelected(true);
			add(animalLabel);
			add(animalComboBox);
			add(animalDrawButton);
			add(Box.createVerticalStrut(30));
			add(clearButton);
			add(Box.createVerticalStrut(30));
		}
		listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(cageDrawButton)) {
					mode = 1;	// �츮 �׸���
					animalDrawButton.setEnabled(true);
					animalComboBox.setEnabled(false);
					cageDrawButton.setEnabled(false);
				} else if (e.getSource().equals(animalDrawButton)) {
					mode = 2;	// ���� �׸���
					animalDrawButton.setEnabled(false);
					animalComboBox.setEnabled(true);
					cageDrawButton.setEnabled(true);
				}
			}
		};
		{
			cageDrawButton.addActionListener(listener);
			animalDrawButton.addActionListener(listener);
		}
		sound = new Sound(this);
	}
}

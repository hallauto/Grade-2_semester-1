package zoo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Controler extends JPanel {
	JComboBox<String> animalComboBox;
	JButton animalDrawButton;
	JLabel animalLabel;
	JComboBox<String> backgroundBox;
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
			String[] animalName = { "양", "돼지", "펭귄", "기린", "코끼리", "원숭이" };
			for (int i = 0; i < animalName.length; i++)
				animalComboBox.addItem(animalName[i]);
		}
		backgroundBox = new JComboBox<String>();
		{
			String[] background = { "남극", "윈도우 초원", "정글", "진흙" };
			for (int i = 0; i < background.length; i++)
				backgroundBox.addItem(background[i]);
			backgroundBox.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Monitor.monitor.image = Toolkit.getDefaultToolkit().getImage(
							backgroundBox.getSelectedItem() + ".jpg");
				}
			});
		}
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		{
			add(cageLabel);
			add(cageDrawButton);
			animalDrawButton.setSelected(true);
			add(animalLabel);
			add(animalDrawButton);
			add(animalComboBox);
			add(Box.createVerticalStrut(30));
			add(clearButton);
			add(Box.createVerticalStrut(30));
			add(backgroundBox);
			add(Box.createVerticalStrut(30));
		}
		listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(cageDrawButton)) {
					mode = 1;	// 우리 그리기
					animalDrawButton.setEnabled(true);
					animalComboBox.setEnabled(false);
					cageDrawButton.setEnabled(false);
				} else if (e.getSource().equals(animalDrawButton)) {
					mode = 2;	// 동물 그리기
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

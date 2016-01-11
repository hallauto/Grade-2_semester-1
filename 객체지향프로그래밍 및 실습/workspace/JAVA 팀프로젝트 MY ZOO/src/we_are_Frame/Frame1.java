package we_are_Frame;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JPanel{
	Frame1()
	{
		JButton cageDrawButton = new JButton("Draw");
		JButton animalDrawButton = new JButton("Draw");
		JButton clearButton = new JButton("Clear");
		JLabel animalLabel = new JLabel("Animal");
		JLabel cageLabel = new JLabel("Cage");
		String[] animalName = {"¾ç","µÅÁö","±â¸°","ÄÚ³¢¸®","¿ø¼þÀÌ","Æë±Ï"};
		JComboBox animalComboBox= new JComboBox();
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		add(cageLabel);
		add(cageDrawButton);
		add(animalLabel);
		add(animalDrawButton);
		Component com = Box.createVerticalStrut(30);
		add(com);
		add(clearButton);
		
	}
	
}

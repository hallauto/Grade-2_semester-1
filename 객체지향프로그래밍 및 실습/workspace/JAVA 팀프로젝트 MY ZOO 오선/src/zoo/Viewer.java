package zoo;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Viewer extends JPanel {
	Controler controler;
	JFrame frm;
	
	public Viewer() {
		frm = new JFrame("zoo");
		frm.setBounds(300, 100, 600, 400);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controler = new Controler();
		frm.add(controler, BorderLayout.WEST);
		frm.setVisible(true);
	}
	
}

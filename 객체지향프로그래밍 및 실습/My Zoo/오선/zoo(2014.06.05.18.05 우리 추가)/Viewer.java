package zoo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Viewer extends JPanel{
	JFrame frm;
	
	public Viewer(){
		frm = new JFrame("zoo");
		frm.setBounds(300, 100, 600, 400);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
	
}

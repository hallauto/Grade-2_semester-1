package zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Tester {
	private Viewer	V;
	private Panel	P;
	private Timer	T;
	
	public Tester(){
		P = new Panel();
		
		V = new Viewer();
		V.frm.add(P);
		
		T = new Timer(30, new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				for(MyAnimal next : P.animals)
					next.run();
				
				P.repaint();
			}
		});
		
		T.start();
	}
	
	
}

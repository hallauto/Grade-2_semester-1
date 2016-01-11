package zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Timer;

public class Manager {
	private class getMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (P.mouse != null) {
				if (V.frame1.mode == 1) {
					if (P.cages.isEmpty())
						P.cages.add(new Cage(P.mouse));
					else
						for (Cage next1 : P.cages) {
							if (!(next1.isItInside(P.mouse)
									|| next1.isItInside(P.mouse.x + 300, P.mouse.y)
									|| next1.isItInside(P.mouse.x, P.mouse.y + 180) || next1
										.isItInside(P.mouse.x + 300, P.mouse.y + 180)))
								P.cages.add(new Cage(P.mouse));
						}
				} else {
					for (Cage next2 : P.cages)
						if (next2.isItInside(P.mouse)) {
							P.animals.add(new Animal(next2, V.frame1.animalComboBox
									.getSelectedIndex()));
							P.animals.get(P.animals.size() - 1).start();
							return;
						}
				}
			}
		}
	}
	
	private Monitor P;		// 동물들이 등장하는 패널
	static Timer T;		// 이벤트 진행을 위한 타이머
	private Viewer V;	// 프로그램이 실행되는 JFrame을 생성
	
	public Manager() {
		P = new Monitor();
		V = new Viewer();
		V.frame1.clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				P.clear();
			}
		});
		P.addMouseListener(new getMouseListener());
		V.frm.add(P);
		T = new Timer(30, new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				P.repaint();
			}
		});
		// P.T = T;
		T.start();
	}
}

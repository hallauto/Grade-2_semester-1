package question5_Time;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CurrentTime {
	Date now;
	TimerListener TimerListener = new TimerListener();
	Timer time = new Timer(1000,TimerListener);
	
	private class TimerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Date now = new Date();
			System.out.println(now);
		}
		
	}
}

package thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.Timer;

public class Tester {
	public static void main(String[] agrs)
	{
		Print hello1 = new Print();
		Print hello2 = new Print();
		Print hello3 = new Print();
		Print hello4 = new Print();
		
		ExecutorService thread = Executors.newCachedThreadPool();
		thread.execute(hello1);
		thread.execute(hello2);
		thread.execute(hello3);
		
		Thread thread2 = new Thread(hello4);
		thread2.start();
		
		thread.shutdown();
	}
}

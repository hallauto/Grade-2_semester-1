package question4_Text;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class RandomText extends JPanel{
	Timer time;
	TimerListener timeListener;
	String text;
	JLabel textLabel;
	Font font;
	Color color;
	Random r1;
	RandomText(String input)
	{
		removeAll();
		text=input;
		timeListener = new TimerListener();
		time = new Timer(1000,timeListener);
		time.start();
	}
	public void paintComponent(Graphics G)
	{
		super.paintComponent(G);
		Graphics2D G2 = (Graphics2D)G;
		G2.setColor(Color.BLACK);
		G2.fillRect(0, 0, 500, 500);
		for (int i=0;i<(int)(Math.random()*10)%25;i++)
		{
			font = new Font("my",5,(int)(Math.random()*40)+1);
			color = new Color((int)(Math.random()*350)%256,(int)(Math.random()*350)%256,(int)(Math.random()*350)%256);
			G2.setColor(color);
			G2.setFont(font);
			G2.drawString(text,(int)(Math.random()*500)%500, (int)(Math.random()*500)%500);
		}
	}
	public class TimerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			repaint();
		}
	}
}

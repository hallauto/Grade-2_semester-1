package question1_ScreenSaver;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;

public class ScreenSaver extends JPanel{
	Timer time;
	Font randomFont;
	Random randomNumber;
	int frameX,frameY,numberString;
	ScreenSaver(int frameX,int frameY)
	{
		this.frameX=frameX;
		this.frameY=frameY;
		randomNumber = new Random();
		numberString=0;
		TimerListener timerListener = new TimerListener();
		time = new Timer(100,timerListener);
		time.start();
	}
	public void paintComponent (Graphics G)
	{
		if (++numberString>=100)
		{
			numberString=100;
			super.paintComponent(G);
		}
		Graphics2D g2D = (Graphics2D)G;
		randomFont = new Font("my", randomNumber.nextInt(), randomNumber.nextInt(frameX/4));
		g2D.setFont(randomFont);
		g2D.drawString("Screen Saver", randomNumber.nextInt(frameX), randomNumber.nextInt(frameY));
	}
	private class TimerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			repaint();
		}
	}
}

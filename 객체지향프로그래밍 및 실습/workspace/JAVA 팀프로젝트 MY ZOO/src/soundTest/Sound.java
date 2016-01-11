package soundTest;

import javax.swing.*;

import java.io.*;
import java.net.URL;

import javax.sound.sampled.*;

public class Sound extends JFrame{
	
	public Sound()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Test Sound Clip");
		this.setSize(300, 200);
		this.setVisible(true);
		
		try{
			URL url = this.getClass().getClassLoader().getResource("¹æ¿ï»õ.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		}
		catch(UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (LineUnavailableException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		new Sound();
	}
}

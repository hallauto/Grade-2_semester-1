package sound_in_Deitel;

import java.applet.AudioClip;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Sound extends JApplet{

	private AudioClip sound1, sound2,currentSound;
	private JButton playJButton,loopJButton,stopJButton;
	private JComboBox soundJComboBox;
	
	public void init()
	{
		setLayout(new FlowLayout());
		
		String choices[]={"价酒瘤	","规匡货"};
		soundJComboBox = new JComboBox(choices);
		
		soundJComboBox.addItemListener
		(
				new ItemListener()
				{
					public void itemStateChanged(ItemEvent e)
					{
						currentSound.stop();
						currentSound=soundJComboBox.getSelectedIndex()==0?sound1:sound2;
					}
				}
		);
	
		add(soundJComboBox);
	
		ButtonHandler handler = new ButtonHandler();
	
		playJButton = new JButton("play");
		playJButton.addActionListener(handler);
		add(playJButton);
		
		loopJButton = new JButton("loop");
		loopJButton.addActionListener(handler);
		add(loopJButton);
		
		stopJButton = new JButton("stop");
		stopJButton.addActionListener(handler);
		add(stopJButton);
		
		sound1 = getAudioClip(getDocumentBase(),"价酒瘤.wav");
		sound2 = getAudioClip(getDocumentBase(),"规匡货.wav");
		currentSound= sound1;
	}
	public void stop()
	{
		currentSound.stop();
	}
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == playJButton)
			{
				currentSound.play();
			}
			else if (e.getSource() == stopJButton)
			{
				currentSound.stop();
			}
			else if (e.getSource() == loopJButton)
			{
				currentSound.loop();
			}
		}
	}
}
package question1_Print_sentence;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;

public class JtextFrame extends JComponent{
	private String text = new String();
	JtextFrame(String text_input)
	{
		text="Good Day!"+text_input;
	}
	JtextFrame()
	{
		text="Goodday!Jhon";
	}
	public void paintComponent(Graphics Frame_G)
	{
		Graphics2D G2 = (Graphics2D)Frame_G;
		G2.setFont(getFont().deriveFont((float)30));
		G2.drawString(text, 50, 50);
	}
}

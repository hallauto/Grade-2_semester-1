package question5_JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.Random;

public class Paint_Rectagle extends JPanel{
	Graphics2D G2;
	Random random;
	Color randomColor;
	BasicStroke randomStroke;
	Rectangle inputRectangle;
	int widthFrame;
	int heightFrame;
	int count;
	Paint_Rectagle(int widthFrame,int heightFrame,int count)
	{
		/*
		 * Rectangle의 위치에 큰 오류가 없도록 myFrame의 크기를 변수로 받아옴.
		 */
		this.widthFrame=widthFrame;
		this.heightFrame=heightFrame;
		this.count=count;
	}
	public void paintComponent(Graphics Frame_G)
	{
		random = new Random();
		G2 = (Graphics2D)Frame_G;
		for (int i = 0;i<count;i++)
		{
			randomColor = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
			randomStroke = new BasicStroke(random.nextFloat()*10);
			inputRectangle = new Rectangle(random.nextInt(widthFrame),random.nextInt(heightFrame),random.nextInt(widthFrame),random.nextInt(heightFrame));
			G2.setColor(randomColor);
			G2.setStroke(randomStroke);
			G2.draw(inputRectangle);
		}
	}
}

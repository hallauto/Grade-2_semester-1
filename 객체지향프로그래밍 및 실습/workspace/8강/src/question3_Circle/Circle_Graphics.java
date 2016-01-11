package question3_Circle;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
public class Circle_Graphics extends JComponent {
	private double radious;
	private double diameter;
	private double circumference;
	private double area;
	Circle_Graphics(double radious_input)
	{
		radious=radious_input;
		diameter=radious*2;
		circumference=radious*2*Math.PI;
		area=radious*radious*Math.PI;
	}
	public void paintComponent(Graphics Frame_G)
	{
		Graphics2D G2=(Graphics2D) Frame_G;
		Ellipse2D.Double Ellipse = new Ellipse2D.Double(10,10,diameter,diameter);
		G2.draw(Ellipse);
		G2.drawString("Area = "+area, 10+(int)diameter+10, 10+(int)diameter+10);
		G2.drawString("diameter = "+diameter, 10+(int)diameter+10, 10+(int)diameter+30);
		G2.drawString("circumference = "+circumference,10+(int)diameter+10,10+(int)diameter+50);
	}
}

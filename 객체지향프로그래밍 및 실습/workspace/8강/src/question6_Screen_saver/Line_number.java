package question6_Screen_saver;

import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Line_number {

	double [][] Line_Array = new double[500][4];
	  int [][] Color_Array = new int[500][3];
	  float [] Stroke_Array = new float[500];
	  short number = 0;
	  Line_number()
	  {
		
		  for(int i=0;i<500;i++)
		  {

			  for (int j=0;j<4;j++)
			  {
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
			  }
			  for (int j=0;j<3;j++)
			  {
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
			  }
			  Stroke_Array [i] = (int)(Math.random()*20);
		  }
	  }
	public void other_random()
	{
		  for(int i=0;i<500;i++)
		  {

			  for (int j=0;j<4;j++)
			  {
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
				  Line_Array[i][j]=(Math.random()*500);
			  }
			  for (int j=0;j<3;j++)
			  {
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
				  Color_Array[i][j]=(int)(Math.random()*500)%256;
			  }
			  Stroke_Array [i] = (int)(Math.random()*20);
		  }
	}
}
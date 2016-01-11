package zoo;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

public abstract class Animal extends Thread {
	public Cage					fence;
	public Point					location;
	public Dimension		bound;
	private int					dx;
	private int					dy;
	protected Random	R;
	
	/** @param location */
	public Animal() {
		R = new Random();
	}
	
	public void run() {
		if(R.nextInt(100) > 91){
			if(R.nextBoolean()){
				dx = R.nextInt(10) - 5;
				dy = R.nextInt(10) - 5;
			}else{
				dx = 0;
				dy = 0;
			}
		}
		
		move(dx,dy);
	}
	
	public void move(int dx, int dy) {
		if(fence.isItInside(new Point(location.x+dx, location.y+dy), bound))
			location.translate(dx, dy);
	}
	
	public abstract void draw(Graphics2D graphics2d);
	
}
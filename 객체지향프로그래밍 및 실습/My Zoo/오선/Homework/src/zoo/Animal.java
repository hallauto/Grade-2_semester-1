package zoo;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

public abstract class Animal extends Thread {
	public Point location;
	private int dx;
	private int dy;
	private Random R;
	
	/** @param location */
	public Animal(Point location) {
		this.location = location;
		
		R = new Random();
	}
	
	public abstract void draw(Graphics2D graphics2d);
	
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
		location.translate(dx, dy);
	}
}
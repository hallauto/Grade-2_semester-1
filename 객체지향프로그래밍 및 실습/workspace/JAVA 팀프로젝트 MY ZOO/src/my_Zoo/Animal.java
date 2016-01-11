package my_Zoo;

import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Animal extends Thread {
	Point location;
	
	/** @param location */
	public Animal(Point location) {
		super();
		this.location = location;
	}
	
	public abstract void draw(Graphics2D graphics2d);
	
	public void move(int dx, int dy) {
		location.translate(dx, dy);
	}
}

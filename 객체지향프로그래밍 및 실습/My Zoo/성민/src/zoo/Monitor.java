package zoo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Monitor extends JPanel {
	public ArrayList<Animal> animals;
	public List<Cage> cages;
	public Point mouse;
	ImageIcon icon;
	
	// public Sound sound;
	public Monitor() {
		super();
		super.setBackground(Color.white);
		cages = Collections.synchronizedList(new ArrayList<Cage>());
		animals = new ArrayList<Animal>();
		icon = new ImageIcon("남극.jpg");
		// select = new JComboBox<String>();
		// select.addItem("0. 우리");
		// select.addItem("1. 돼지");
		// select.addItem("2. 펭귄");
		// select.addItem("3. 기린");
		// select.addItem("4. 코끼리");
		// this.add(select);
		// sound = new Sound(this);
	}
	
	public void clear() {
		animals.clear();
		cages.clear();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		mouse = super.getMousePosition();
		g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
		for (Cage c : cages)
			g.drawRect(c.getCagePoint().x, c.getCagePoint().y, c.getCageDimension().width,
					c.getCageDimension().height);
		for (Animal ma : animals) {
			ma.draw((Graphics2D) g);
			// g.drawRect(ma.findLeftPivot().x,
			// ma.findLeftPivot().y, ma.bound.width,
			// ma.bound.height);
		}
	}
}

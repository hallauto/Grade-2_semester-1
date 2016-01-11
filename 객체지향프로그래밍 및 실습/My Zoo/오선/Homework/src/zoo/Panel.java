package zoo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Panel extends JPanel{
	public ArrayList<MyAnimal>		animals;
	public JComboBox<String>		animalSelect;
	public Point										mouse;
	
	public Panel(){
		super();
		super.addMouseListener(new getMouseListener());
		super.setBackground(Color.white);
		
		animals = new ArrayList<MyAnimal>();
		
		animalSelect	= new JComboBox<String>();
		animalSelect.addItem("1. 돼지");
		animalSelect.addItem("2. 펭귄");
		
		this.add(animalSelect);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		mouse = super.getMousePosition();
		if(mouse != null){
			g.drawLine(0, mouse.y, 1000, mouse.y);
			g.drawLine(mouse.x, 0, mouse.x, 1000);
		}
		
		for(MyAnimal ma : animals)
			ma.draw((Graphics2D) g);
		
	}
	private class getMouseListener extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			if(mouse != null){
				animals.add(new MyAnimal(mouse, animalSelect.getSelectedIndex()));
			}
			
		}
		
	}
}

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
	public ArrayList<Cage>				cages;
	public ArrayList<Animal>		animals;
	public JComboBox<String>		select;
	public Point										mouse;
	public Sound 				sound;
	
	public Panel(){
		super();
		super.addMouseListener(new getMouseListener());
		super.setBackground(Color.white);
		
		cages		= new ArrayList<Cage>();
		animals = new ArrayList<Animal>();
		
		
		select	= new JComboBox<String>();
		select.addItem("0. 우리");
		select.addItem("1. 돼지");
		select.addItem("2. 펭귄");
		select.addItem("3. 기린");
		select.addItem("4. 코끼리");
		
		sound = new Sound(this);
		
		this.add(select);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		mouse = super.getMousePosition();
		
		for(Cage c : cages)
			g.drawRect(c.getCagePoint().x, c.getCagePoint().y, c.getCageDimension().width, c.getCageDimension().height);
		for(Animal ma : animals){
			ma.draw((Graphics2D) g);
//			g.drawRect(ma.findLeftPivot().x, ma.findLeftPivot().y, ma.bound.width, ma.bound.height);
		}
		
	}
	private class getMouseListener extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			if(mouse != null){
				if(select.getSelectedIndex() == 0){
					if(cages.isEmpty())
						cages.add(new Cage(mouse));
					else
						for(Cage next1 : cages)
							if(next1.isItInside(mouse) == false)
								cages.add(new Cage(mouse));
				}else{
					for(Cage next2 : cages)
						if(next2.isItInside(mouse))
							animals.add(new Animal(next2, select.getSelectedIndex()));
					
				}
					
			}
			
		}
		
	}
}

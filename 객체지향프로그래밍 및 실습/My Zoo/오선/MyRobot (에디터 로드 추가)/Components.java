package MyRobot;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;


//the class Components has all components in JPanel and listeners.
//there is a button listener, one is move and stop function and the other is clear function.
@SuppressWarnings("serial")
public class Components extends JPanel{
	public MakeFigure						mf;
	public Figure									f;
	public JButton								color;
	public JButton								move;
	public JButton								save;
	public JButton								load;
	public JCheckBox						transparent;
	public JComboBox<String>	box;
	public JSlider								red;
	public JSlider								blue;
	public JSlider								green;
	public JSlider								stroke;
	
	public Components(MakeFigure mf){
		super(new BorderLayout());
		
		this.mf							= mf;
		this.f								= mf.f;
		
		JPanel subPanel =		new JPanel(new BorderLayout());
		
		red									= new JSlider(0, 255, 0);
		blue								= new JSlider(0, 255, 0);
		green								= new JSlider(0, 255, 0);
		
		red.setToolTipText("Red");
		blue.setToolTipText("Blue");
		green.setToolTipText("Green");
		
		red.setMajorTickSpacing(50);
		blue.setMajorTickSpacing(50);
		green.setMajorTickSpacing(50);
		
		red.setPaintLabels(true);
		blue.setPaintLabels(true);
		green.setPaintLabels(true);
		
		red.setPaintTicks(true);
		blue.setPaintTicks(true);
		green.setPaintTicks(true);
		
		color								= new JButton(" ");
		
		color.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
		color.setToolTipText("Color");
		color.setEnabled(false);
		
		transparent					= new JCheckBox("Transparent");
		
		box									= new JComboBox<String>();
		
		box.addItem("Rectangle");
		box.addItem("Ellipse");
		box.addItem("Line");
		
		box.setToolTipText("Figure");
		
		stroke							= new JSlider(new DefaultBoundedRangeModel(1, 0, 1, 31));
		
		stroke.setMajorTickSpacing(10);
		stroke.setToolTipText("Stroke");
		stroke.setPaintLabels(true);
		stroke.setPaintTicks(true);
		
		JButton clear				= new JButton("Clear");
		save								= new JButton("Save");
		load								= new JButton("Load");
		move								= new JButton("Move");
		
		clear.addActionListener(new getButtonListener1());
		save.addActionListener(new getButtonListener3());
		load.addActionListener(new getButtonListener4());
		move.addActionListener(new getButtonListener2());
		
		JPanel flowPanel1		= new JPanel();
		
		flowPanel1.setSize(500, 10);
		flowPanel1.add(red);
		flowPanel1.add(green);
		flowPanel1.add(blue);
		
		JPanel flowPanel2		= new JPanel();
		
		flowPanel2.add(color);
		flowPanel2.add(box);
		flowPanel2.add(stroke);
		flowPanel2.add(transparent);
		flowPanel2.add(clear);
		flowPanel2.add(save);
		flowPanel2.add(load);
		
		this.add(flowPanel1, BorderLayout.NORTH);
		
		subPanel.add(flowPanel2, BorderLayout.NORTH);
		subPanel.add(new DrawFigure());
		
		this.add(subPanel, BorderLayout.CENTER);
		this.add(move, BorderLayout.SOUTH);
		
	}
	
//	clear
	public class getButtonListener1 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			f.figure.clear();
			f.color.clear();
			f.transparent.clear();
			f.stroke.clear();
			f.i=0;
		}
	}
//	move and stop
	public class getButtonListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(mf.move){
				mf.move = false;
				move.setText("Move");
			}
			else{
				mf.move = true;
				move.setText("Stop");
			}
				
		}
	}
	
	public class getButtonListener3 implements ActionListener{
		private int clickNum;
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			File										exist;
			FileOutputStream			fos;
			ObjectOutputStream	oos;
			
			try{
				exist = new File("draw.dat"+clickNum);
				if(exist.exists())
					throw new IllegalArgumentException("There's exists same name file!");
				fos = new FileOutputStream("draw.dat"+clickNum);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(f.figure);
				oos.writeObject(f.color);
				oos.writeObject(f.transparent);
//				oos.writeObject(f.stroke);
				
				oos.close();
				fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				clickNum++;
			}
			
		}
		
	}
	
	public class getButtonListener4 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			FileInputStream			fis;
			ObjectInputStream	ois;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Input data number: ");
			
			try{
				fis = new FileInputStream("draw.dat"+sc.nextInt());
				ois = new ObjectInputStream(fis);
				
				f.figure = (ArrayList<Shape>) ois.readObject();
				f.color = (ArrayList<Color>) ois.readObject();
				f.transparent = (ArrayList<Boolean>) ois.readObject();
//				f.stroke = (ArrayList<BasicStroke>) ois.readObject();
				f.i = f.figure.size();
				
				ois.close();
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
//	Inner Class DrawFigure is a JComponent that paints all figures
	public class DrawFigure extends JComponent{
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 640, 480);
			color.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
			f.draw((Graphics2D) g);
		}
	}
	
}
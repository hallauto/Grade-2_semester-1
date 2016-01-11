import javax.swing.JOptionPane;
public class Week1A {
	public static void main(String []args)
	{
		String name=JOptionPane.showInputDialog("what is your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, name);
		System.exit(0);
	}
}

package hang_man;
import java.util.ArrayList;
public class Letter {
	private char letter;
	private ArrayList<Integer> location = new ArrayList<Integer>(); 
	Letter(char letter_input)
	{
		letter=letter_input;
	}
	Letter(char letter_input,int location_input)
	{
		letter=letter_input;
		location.add(Integer.valueOf(location_input));
	}
	public void insult_location(int location_input)
	{
		location.add(Integer.valueOf(location_input));
	}
	public char get_letter()
	{
		return letter;
	}
	public ArrayList<Integer> get_location()
	{
		return location;
	}
}

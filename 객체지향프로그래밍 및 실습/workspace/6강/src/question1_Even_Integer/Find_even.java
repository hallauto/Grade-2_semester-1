package question1_Even_Integer;
import java.util.Scanner;
public class Find_even {
	private int target;
	Find_even(int target_input)
	{
		target=target_input;
	}
	public boolean answer()
	{
		if ((target%2)==0)
			return true;
		else
		{
			return false;
		}
	}
}

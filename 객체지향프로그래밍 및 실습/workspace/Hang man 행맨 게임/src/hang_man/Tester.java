package hang_man;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
	public static void main(String agrs[])
	{
		Scanner input= new Scanner(System.in);
		ArrayList<Question> Questions = new ArrayList<Question>();
		Start_and_Setup start = new Start_and_Setup(Questions);
		while(true)
		{
			start.Start_interface();
		}
	}
}

package question3_Boy_and_Girs;

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
	public static void main(String agrs[])
	{
		try
		{
			FileReader baby = new FileReader("babynames.txt");
			PrintWriter printBoy = new PrintWriter("boynames.txt");
			PrintWriter printGirl = new PrintWriter("girlsnames.txt");
			Scanner input = new Scanner(baby);
			while (input.hasNext())
			{
				String number = input.next();
				String boyNames = new String (number+" "+ input.next()+ " " + input.next()+ " " + input.next());
				printBoy.println(boyNames);
				String girlNames = new String (number+" "+input.next()+ " " + input.next()+ " " + input.next());
				printGirl.println(girlNames);
			}
			input.close();
			printBoy.close();
			printGirl.close();
		}
		catch(FileNotFoundException exceptionF)
		{
			System.out.println("파일을 못찾았습니다.");
		}
	}
}

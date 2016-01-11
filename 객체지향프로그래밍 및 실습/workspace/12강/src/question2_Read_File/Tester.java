package question2_Read_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {
	public static void main(String agrs[])
	{
		int number=0;
		try
		{
			FileReader fileRead = new FileReader("Question 1.txt");
			Scanner input = new Scanner(fileRead);
			while (input.hasNextLine())
			{
				String line = new String(input.nextLine());
				number+=line.length();
			}
			input.close();
		}
		catch (FileNotFoundException excption)
		{
			System.out.println("파일을 못 찾았습니다.");
		}
		System.out.println("character갯수:"+number);
	}

}

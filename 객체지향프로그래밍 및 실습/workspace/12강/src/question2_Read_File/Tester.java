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
			System.out.println("������ �� ã�ҽ��ϴ�.");
		}
		System.out.println("character����:"+number);
	}

}

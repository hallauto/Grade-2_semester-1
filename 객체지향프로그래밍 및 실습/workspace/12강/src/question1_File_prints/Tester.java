package question1_File_prints;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tester{
	public static void main(String agrs[]) throws FileNotFoundException
	{
		PrintWriter out = new PrintWriter("Question 1.txt");
		out.println("start");
		out.close();
	}
}

package question6_mydate;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		int year,month,day;
		Scanner input=new Scanner(System.in);
		System.out.println("���� �Է�");
		year=input.nextInt();
		System.out.println("�� �Է�");
		month=input.nextInt();
		System.out.println("�� �Է�");
		day=input.nextInt();
		Mydate my= new Mydate(year,month,day);
		my.Display();
		System.out.println("���� �Է�");
		year=input.nextInt();
		System.out.println("�� �Է�");
		month=input.nextInt();
		System.out.println("�� �Է�");
		day=input.nextInt();
		my.setday(day);
		my.setmonth(month);
		my.setyear(year);
		my.Display();
	}
}

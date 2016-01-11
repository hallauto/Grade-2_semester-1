package question6_mydate;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		int year,month,day;
		Scanner input=new Scanner(System.in);
		System.out.println("연도 입력");
		year=input.nextInt();
		System.out.println("월 입력");
		month=input.nextInt();
		System.out.println("일 입력");
		day=input.nextInt();
		Mydate my= new Mydate(year,month,day);
		my.Display();
		System.out.println("연도 입력");
		year=input.nextInt();
		System.out.println("월 입력");
		month=input.nextInt();
		System.out.println("일 입력");
		day=input.nextInt();
		my.setday(day);
		my.setmonth(month);
		my.setyear(year);
		my.Display();
	}
}

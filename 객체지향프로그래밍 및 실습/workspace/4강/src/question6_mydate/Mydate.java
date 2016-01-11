package question6_mydate;

public class Mydate {
	private int year,month,day;
	public void setyear(int input_year)
	{
		year=input_year;
	}
	public void setmonth(int input_month)
	{
		month=input_month;
	}
	public void setday(int input_day)
	{
		day=input_day;
	}
	public void Display()
	{
		System.out.print(year);
		System.out.print('/');
		System.out.print(month);
		System.out.print('/');
		System.out.println(day);
	}
	public void getyear(int get_year)
	{
		get_year=year;
	}
	public void getmonth(int get_month)
	{
		get_month=month;
	}
	public void getday(int get_day)
	{
		get_day=day;
	}
	Mydate(int first_year,int first_month,int first_day)
	{
		year=first_year;
		month=first_month;
		day=first_day;
	}
}

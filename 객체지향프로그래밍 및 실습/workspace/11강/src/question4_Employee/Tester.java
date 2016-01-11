package question4_Employee;

public class Tester {
	public static void main(String agrs[])
	{
		Employee E1 = new Employee ("Kim",500);
		Manager M1 = new Manager("Oh",1000,"Script");
		Executive EX1 = new Executive("Shin",1500,"Script");
		System.out.println(E1.toString());
		System.out.println(M1.toString());
		System.out.println(EX1.toString());
	}
}

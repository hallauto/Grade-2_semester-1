package question4_Employee;

public class Tester {
	public static void main(String agrs[])
	{
		Employee first=new Employee("김찬규",10000000);
		System.out.println("사원 이름:"+first.getName());
		System.out.println("사원 월급:"+first.getSalary());
		first.increment(75);
		System.out.println("사원 월급:"+first.getSalary());
	}
}

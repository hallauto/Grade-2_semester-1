package question4_Employee;

public class Tester {
	public static void main(String agrs[])
	{
		Employee first=new Employee("������",10000000);
		System.out.println("��� �̸�:"+first.getName());
		System.out.println("��� ����:"+first.getSalary());
		first.increment(75);
		System.out.println("��� ����:"+first.getSalary());
	}
}

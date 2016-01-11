package question3_Human;

public class Instructer extends Person{
	int salary;
	Instructer(int birth, String name) {
		super(birth, name);
	}
	Instructer(int birth, String name, int Salary)
	{
		super(birth,name);
		salary=Salary;
	}
	public String toString()
	{
		return "Birth:"+birth+"\nName:"+name+"\nSalary:"+salary;
	}
}

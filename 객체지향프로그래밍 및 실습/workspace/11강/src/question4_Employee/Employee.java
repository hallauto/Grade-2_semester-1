package question4_Employee;

public class Employee {
	public String name;
	public int salary;
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "\nname:"+name+"\nsalary:"+salary;
	}
}

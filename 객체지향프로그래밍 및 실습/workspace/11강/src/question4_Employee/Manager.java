package question4_Employee;

public class Manager extends Employee{
	public String Department;
	Manager(String name,int salary,String Department)
	{
		super(name,salary);
		this.Department=Department;
	}
	public String toString()
	{
		return "\nname:"+name+"\nsalary:"+salary+"\nDepartment:"+Department;
	}
}

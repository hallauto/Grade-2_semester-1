package question4_Employee;

public class Employee {
	private String employeename;
	private double salary;
	public Employee(String employeename_input,double salary_input) 
	{
		/*������
		 * default ������ ����
		 */
		employeename=employeename_input;
		salary=salary_input;
	}
	public String getName()
	{
		return employeename;
	}
	public double getSalary()
	{
		return salary;
	}
	public void increment(double percent)
	{
		salary=salary*(percent/100.0+1.0);
	}
}

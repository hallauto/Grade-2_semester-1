package question4_student;

public class Student {

	private String name;
	private String ID;
	private String Phone;
	public String getname()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public String getPhone()
	{
		return Phone;
	}
	Student(String input_n,String input_i,String input_p)
	{
		name=input_n;
		ID=input_i;
		Phone=input_p;
	}
}

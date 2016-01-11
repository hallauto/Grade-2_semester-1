package question3_Human;

public class Student extends Person{
	String major;
	Student(int birth, String name) {
		super(birth, name);
	}
	Student(int birth, String name, String Major)
	{
		super(birth,name);
		major=Major;
	}
	public String toString()
	{
		return "Birth:"+birth+"\nName:"+name+"\nMajor:"+major;
	}
}

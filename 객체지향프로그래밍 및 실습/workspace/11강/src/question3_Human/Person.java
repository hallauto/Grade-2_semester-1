package question3_Human;

public class Person {
	int birth;
	String name;
	Person(int birth,String name)
	{
		this.birth = birth;
		this.name=name;
	}
	public String toString()
	{
		return "Birth:"+birth+"\nName:"+name;
	}
}

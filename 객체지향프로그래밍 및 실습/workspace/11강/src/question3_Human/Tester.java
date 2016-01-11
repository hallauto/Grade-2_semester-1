package question3_Human;

public class Tester {
	public static void main(String agrs[])
	{
		Person p1 = new Person(25,"bare");
		Student s1 = new Student(21,"chan","Computer");
		Instructer i1 = new Instructer(30,"you",500);
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(i1.toString());
	}
}

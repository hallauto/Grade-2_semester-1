package question2_Person;

import interface_Lecture10.DataSet;

public class Tester {
	public static void main(String agrs[])
	{
		DataSet set = new DataSet();
		Person kim = new Person("kim",170);
		Person shin = new Person("shin",174);
		Person oh = new Person("oh",161);
		set.add(kim);
		set.add(shin);
		set.add(oh);
		System.out.println("Average="+set.getAverage());
		System.out.println("Tallest People="+((Person)(set.getMaximum())).getName());
	}
}

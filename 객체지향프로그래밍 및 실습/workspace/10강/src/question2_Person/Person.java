package question2_Person;

import interface_Lecture10.Measurable;

public class Person implements Measurable{
	private String name;
	double height;
	Person(String name,double height)
	{
		this.name = name;
		this.height = height;
	}
	public double getMeasure() {
		return height;
	}
	public String getName()
	{
		return name;
	}
}

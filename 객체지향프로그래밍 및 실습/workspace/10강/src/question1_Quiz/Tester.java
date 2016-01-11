package question1_Quiz;

import interface_Lecture10.DataSet;

public class Tester {
	public static void main(String agrs[])
	{
		Quizz quiz1 = new Quizz(80);
		Quizz quiz2 = new Quizz(75);
		Quizz quiz3 = new Quizz(100);
		DataSet set = new DataSet();
		set.add(quiz1);
		set.add(quiz2);
		set.add(quiz3);
		System.out.println("Average="+set.getAverage());
		System.out.println("Maximum="+set.getMaximum().getMeasure());
	}
}

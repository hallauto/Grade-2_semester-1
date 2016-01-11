package question1_Quiz;

import interface_Lecture10.Measurable;

public class Quizz implements Measurable{
	private double score;
	private char grade;
	Quizz()
	{
		score = 0;
		grade = 'F';
	}
	Quizz(double score)
	{
		this.score=score;
		if (score>80)
		{
			grade='A';
		}
	}
	public double getMeasure() {
		return score;
	}
}

package question3_two_floating;

public class Compare {
	private double number1;
	private double number2;
	private boolean difference;
	Compare(double number1_input,double number2_input)
	{
		number1=Math.round(100*number1_input);
		number2=Math.round(100*number2_input);
	}
	public double get_number1()
	{
		return number1;
	}
	public double get_number2()
	{
		return number2;
	}
	public boolean get_difference()
	{
		if (number1==number2)
		{
			difference=false;
		}
		else
		{
			difference=true;
		}
		return difference;
	}
}

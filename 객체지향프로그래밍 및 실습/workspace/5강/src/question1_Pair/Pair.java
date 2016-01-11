package question1_Pair;

public class Pair 
{
	private double first,second;
	/*생성자(Constructor)
	 *인자(Parameter): double first,double value
	 */
	public Pair(double first_input,double second_input)
	{
		first=first_input;
		second=second_input;
	}
	public double getsum()
	{
		/*
		 * 더하기 계산
		 * 반환:double
		 */
		return first+second;
	}
	public double getdifference()
	{
		/*
		 * 빼기 계산
		 * 반환:double
		 */
		return first-second;
	}
	public double getaverage()
	{
		/*
		 * 평균 계산
		 * 반환:double
		 */
		return (first+second)/2;
	}
	public double getmultiplication()
	{
		/*
		 * 곱하기 계산
		 * 반환:double
		 */
		return first*second;
	}
}

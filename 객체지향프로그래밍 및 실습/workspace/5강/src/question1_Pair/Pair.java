package question1_Pair;

public class Pair 
{
	private double first,second;
	/*������(Constructor)
	 *����(Parameter): double first,double value
	 */
	public Pair(double first_input,double second_input)
	{
		first=first_input;
		second=second_input;
	}
	public double getsum()
	{
		/*
		 * ���ϱ� ���
		 * ��ȯ:double
		 */
		return first+second;
	}
	public double getdifference()
	{
		/*
		 * ���� ���
		 * ��ȯ:double
		 */
		return first-second;
	}
	public double getaverage()
	{
		/*
		 * ��� ���
		 * ��ȯ:double
		 */
		return (first+second)/2;
	}
	public double getmultiplication()
	{
		/*
		 * ���ϱ� ���
		 * ��ȯ:double
		 */
		return first*second;
	}
}

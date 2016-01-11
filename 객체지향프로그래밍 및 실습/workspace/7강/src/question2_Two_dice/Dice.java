package question2_Two_dice;

public class Dice {
	private int number;
	Dice()
	{
		number=((int)(Math.random()*100))%6+1;
	}
	public int get_number()
	{
		return number;
	}
	public void re_dice()
	{
		number=((int)(Math.random()*100))%6+1;
	}
}

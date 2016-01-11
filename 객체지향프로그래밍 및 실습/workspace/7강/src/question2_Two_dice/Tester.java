package question2_Two_dice;
import java.util.ArrayList;
public class Tester {
	public static void main(String args[])
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int diceplus = 0;
		int [] occurunce = new int [11];
		ArrayList<Integer> result_array = new ArrayList<Integer>();
		for (int i=0;i<100;i++)
		{
			dice1.re_dice();
			dice2.re_dice();
			diceplus=dice1.get_number()+dice2.get_number();
			occurunce[diceplus-2]++;
		}
		for (int i=0;i<11;i++)
		{
			System.out.println((i+2)+"°¡ ³ª¿Â È½¼ö:"+occurunce[i]);
		}
	}
}

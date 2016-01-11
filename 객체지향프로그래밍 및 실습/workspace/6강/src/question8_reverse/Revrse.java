package question8_reverse;

public class Revrse {
	String original,revrsed;
	int target,answer,length;
	Revrse(int target_input)
	{
		target=target_input;
		original=Integer.toString(target);
		length=original.length();
		revrsed=original.substring(length-1);
		length=length-2;
		while (length>=0)
		{
			revrsed=revrsed+original.substring(length,length+1);
			--length;
		}
	}
	public int collect()
	{
		answer=Integer.parseInt(revrsed);
		return answer;
	}
}

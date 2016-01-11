package hang_man;
import java.util.ArrayList;
public class Question {
	private String answer,ANSWER;
	private ArrayList<Letter> letters = new ArrayList<Letter>();
	private char letter_input=0,letter_compare=0;
	Question(String answer_input)
	{
		answer=answer_input;
		char [] insult = new char [answer.length()]; 
		for (int i=0;i<answer.length();i++)
		{
				insult[i]='_';
		}
		ANSWER=String.valueOf(insult);
		for (int i=0;i<answer.length();i++)
		{
			letter_input=answer.charAt(i);
			if (i==0)
			{
				Letter new_input=new Letter(letter_input,0);
				letters.add(new_input);
			}
			for (int j=0;j<letters.size();j++)
			{
				letter_compare=letters.get(j).get_letter();
				if (letter_input==letter_compare)
				{
					letters.get(j).insult_location(i);
					break;
				}
				if (j==letters.size()-1)
				{
					Letter new_input=new Letter(letter_input,i);
					letters.add(new_input);
				}
			}
		}
	}
	public String insult_answer(String input)
	{
		if (input.equals(answer))
		{
			ANSWER=answer;
			return ANSWER;
		}
		else
		{
			System.out.println("¶¯");
			return ANSWER;
		}
	}
	public String insult_answer(char input)
	{
		char [] return_char = new char[answer.length()];
		boolean collect = false;
		if (ANSWER!=null)
		{
			for (int q=0;q<answer.length();q++)
			{
				return_char[q]=ANSWER.charAt(q);
			}
		}
		for (int i=0;i<letters.size();i++)
		{
			if (input==letters.get(i).get_letter())
			{
				for (int j=0;j<letters.get(i).get_location().size();j++)
				{
					return_char[letters.get(i).get_location().get(j)]=input;
				}
				collect=true;
			}
		}
		if (collect)
		{
			ANSWER= String.valueOf(return_char);
			return ANSWER;
		}
		System.out.println("¶¯");
		return String.valueOf(return_char);
	}
	public String get_ANSWER()
	{

		return ANSWER;
	}
	public int get_how_many_letter()
	{
		return letters.size();
	}
	public String get_answer()
	{
		return answer;
	}
}

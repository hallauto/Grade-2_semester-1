package question6_Capitalize;

import java.util.StringTokenizer;

public class Capitalize_String {
	private String object;
	public Capitalize_String() 
	{
		/*
		 * »ý¼ºÀÚ
		 */
	}
	public void getString(String input)
	{
		object=input;
	}
	public String capitalize()
	{
		String token="",tokenfirst="",answer="";
		StringTokenizer Token = new StringTokenizer(object);
		while (Token.hasMoreTokens())
		{
			token=Token.nextToken();
			tokenfirst=token.substring(0,1);
			tokenfirst=tokenfirst.toUpperCase();
			answer+=" "+tokenfirst+token.substring(1);
		}
		return answer;
	}
}

package question5_Numercial_adress;

public class Find_number {
	int address_number=0;
	Find_number(String address_input)
	{
		String address = new String (address_input);
		String address_n= new String ();
		for (int i=0;i<address.length();i++)
		{
			switch (address.substring(i, i+1))
			{
			case "1":
			{
				
			}
			case "2":
			{
				
			}
			case "3":
			{
				
			}
			case "4":
			{
				
			}
			case "5":
			{
				
			}
			case "6":
			{
				
			}
			case "7":
			{
				
			}
			case "8":
			{
				
			}
			case "9":
			{
				
			}
			case "0":
			{
				address_n=address_n+address.substring(i, i+1);
				break;
			}
			default:
			{
				break;
			}
			}
			address_number=Integer.parseInt(address_n);
		}
	}
}

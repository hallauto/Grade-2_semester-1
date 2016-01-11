package question6_patient;

public class Patient {
	private String ID,name,number;
	Patient()
	{
		ID="0000";
		name="default";
		number="00000000";
	}
	Patient(String ID_input,String name_input,String number_input)
	{
		ID=ID_input;
		name=name_input;
		number=number_input;
	}
	public String toString()
	{
		return "ID:"+ID+"\nname:"+name+"\nnumber:"+number;
	}
}

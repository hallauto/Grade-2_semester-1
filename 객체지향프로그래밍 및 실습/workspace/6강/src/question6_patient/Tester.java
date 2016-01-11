package question6_patient;

public class Tester {
	public static void main(String args[])
	{
		Patient p1= new Patient();
		Patient p2 = new Patient("0001","±è","01011111111");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}

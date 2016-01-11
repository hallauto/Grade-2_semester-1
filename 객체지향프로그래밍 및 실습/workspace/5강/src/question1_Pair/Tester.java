package question1_Pair;
public class Tester {
	public static void main(String args[])
	{
		Pair pair1=new Pair(50,100);
		System.out.println("50+100="+pair1.getsum());
		System.out.println("50-100="+pair1.getdifference());
		System.out.println("50°ú 100ÀÇ Æò±Õ:"+pair1.getaverage());
		System.out.println("50*100="+pair1.getmultiplication());
	}
}

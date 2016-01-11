package hang_man;

public class Hang_man {
	private int chance;
	public void print(int chance_input)
	{
		switch(chance_input)
		{
		case 9:
		{
			return;
		}
		case 8:
		{
			System.out.println("");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("");
			break;
		}
		case 7:
		{
			System.out.println("");
			System.out.println("|-----     ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("");
			break;
		}
		case 6:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("");
			break;
		}
		case 5:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("");
			break;
		}
		case 4:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("|     |    ");
			System.out.println("");
			break;
		}
		case 3:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("|     |    ");
			System.out.println("|    / \\   ");
			System.out.println("");
			break;
		}
		case 2:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("|     |    ");
			System.out.println("|    / \\   ");
			System.out.println("|     |    ");
			System.out.println("");
			break;
		}
		case 1:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("|     |    ");
			System.out.println("|    / \\   ");
			System.out.println("|     |    ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|__________");
			System.out.println("");
			break;
		}
		case 0:
		{
			System.out.println("");
			System.out.println("|-----o    ");
			System.out.println("|     |    ");
			System.out.println("|     |    ");
			System.out.println("|     O    ");
			System.out.println("|     |    ");
			System.out.println("|    / \\   ");
			System.out.println("|     |    ");
			System.out.println("|    / \\   ");
			System.out.println("|          ");
			System.out.println("|__________");
			System.out.println("");
			break;
		}
		default:
		{
			System.out.println("잘못된 값이 들어갔습니다.");
			break;
		}
		}
	}
}

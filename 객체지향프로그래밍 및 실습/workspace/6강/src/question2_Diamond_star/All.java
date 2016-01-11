package question2_Diamond_star;

public class All {
	public static void main(String args[])
	{
		int row = 0, coulnm=0;
		for (row=0;row<9;++row)
		{
			switch (row)
			{
			case 0:
			case 8:
			{
				for (coulnm=0;coulnm<9;coulnm++)
				{
					if (coulnm==4)
					{
						System.out.print('*');
					}
					else
					{
						System.out.print(' ');
					}
				}
				System.out.print('\n');
				break;
			}
			case 1:
			case 7:
			{
				for (coulnm=0;coulnm<9;coulnm++)
				{
					if ((2<coulnm)&&(coulnm<6))
					{
						System.out.print('*');
					}
					else
					{
						System.out.print(' ');
					}
				}
				System.out.print('\n');
				break;
			}
			case 2:
			case 6:
			{
				for (coulnm=0;coulnm<9;coulnm++)
				{
					if ((1<coulnm)&&(coulnm<7))
					{
						System.out.print('*');
					}
					else
					{
						System.out.print(' ');
					}
				}
				System.out.print('\n');
				break;
			}
			case 3:
			case 5:
			{
				for (coulnm=0;coulnm<9;coulnm++)
				{
					if ((0<coulnm)&&(coulnm<8))
					{
						System.out.print('*');
					}
					else
					{
						System.out.print(' ');
					}
				}
				System.out.print('\n');
				break;
			}
			case 4:
			{
				for (coulnm=0;coulnm<9;coulnm++)
				{
					System.out.print('*');
				}
				System.out.print('\n');
				break;
			}
			}
		}
	}
}

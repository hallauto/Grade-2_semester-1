package question7_Invoice;
import java.util.Scanner;
public class Invoice {
	private String part_number,part_discription;
	private int quantity;
	private double price;
	Scanner input = new Scanner(System.in);
	public void set_part_number()
	{
		System.out.println("번호 입력:");
		part_number=input.nextLine();
	}
	public void set_part_dicription()
	{
		System.out.println("설명 입력:");
		part_discription=input.nextLine();
	}
	public void set_quantity()
	{
		System.out.println("수량 입력:");
		quantity=input.nextInt();
		if (quantity<0)
		{
			quantity=0;
		}
	}
	public void set_price()
	{
		System.out.println("가격 입력:");
		price=input.nextDouble();
		if (price<0)
		{
			price=0;
		}
	}
	public void get_part_number()
	{
		System.out.println("번호:"+part_number);
	}
	public void get_part_dicription()
	{
		System.out.println("설명:"+part_discription);
	}
	public void get_quantity()
	{
		System.out.println("수량:"+quantity);
	}
	public void get_price()
	{
		System.out.println("가격"+price);
	}
	public double getInvoiceAmount()
	{
		double total=0;
		total=(double)quantity*price;
		if (total<0)
		{
			return 0;
		}
		else
		{
			return total;
		}
	}
	Invoice(String part_number_input,String part_discription_input,int quantity_input,double price_input)
	{
		part_number=part_number_input;
		part_discription=part_discription_input;
		quantity=quantity_input;
		price=price_input;
		if (quantity<0)
		{
			quantity=0;
		}
		if (price<0)
		{
			price=0;
		}
	}
}

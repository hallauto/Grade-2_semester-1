package question7_Invoice;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		String part_number_input,part_discription_input;
		int quantity_input;
		double price_input;
		Scanner input = new Scanner(System.in);
		System.out.println("번호 입력:");
		part_number_input=input.nextLine();
		System.out.println("설명 입력:");
		part_discription_input=input.nextLine();
		System.out.println("수량 입력:");
		quantity_input=input.nextInt();
		System.out.println("가격 입력:");
		price_input=input.nextDouble();
		Invoice first= new Invoice(part_number_input,part_discription_input,quantity_input,price_input);
		first.get_part_number();
		first.get_part_dicription();
		first.get_quantity();
		first.get_price();
		System.out.println("청구:"+first.getInvoiceAmount());
		first.set_part_number();
		first.set_part_dicription();
		first.set_quantity();
		first.set_price();
		first.get_part_number();
		first.get_part_dicription();
		first.get_quantity();
		first.get_price();
		System.out.println("청구:"+first.getInvoiceAmount());
	}
}
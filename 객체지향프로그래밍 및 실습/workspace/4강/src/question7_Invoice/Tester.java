package question7_Invoice;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		String part_number_input,part_discription_input;
		int quantity_input;
		double price_input;
		Scanner input = new Scanner(System.in);
		System.out.println("��ȣ �Է�:");
		part_number_input=input.nextLine();
		System.out.println("���� �Է�:");
		part_discription_input=input.nextLine();
		System.out.println("���� �Է�:");
		quantity_input=input.nextInt();
		System.out.println("���� �Է�:");
		price_input=input.nextDouble();
		Invoice first= new Invoice(part_number_input,part_discription_input,quantity_input,price_input);
		first.get_part_number();
		first.get_part_dicription();
		first.get_quantity();
		first.get_price();
		System.out.println("û��:"+first.getInvoiceAmount());
		first.set_part_number();
		first.set_part_dicription();
		first.set_quantity();
		first.set_price();
		first.get_part_number();
		first.get_part_dicription();
		first.get_quantity();
		first.get_price();
		System.out.println("û��:"+first.getInvoiceAmount());
	}
}
package question5_employee;
public class Tester {
	public static void main(String args[])
	{
		String name,ID,Phone;
		Employee first = new Employee("±Ë","001","010000000");
		Employee second = new Employee("¿Ã","002","000000000");
		Employee third = new Employee("√÷","003","010101101");
		first.get_detaile();
		second.get_detaile();
		third.get_detaile();
		first.change_number();
		second.change_number();
		third.change_number();
		first.get_detaile();
		second.get_detaile();
		third.get_detaile();
	}
}

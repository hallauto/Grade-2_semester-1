package example3_Lotation;

public class Location {
	private double x_location;
	private double y_location;
	
	Location(double x_input,double y_input)
	{
		x_location=x_input;
		y_location=y_input;
	}
	Location()
	{
		x_location=0.0;
		y_location=0.0;
	}
	public double getxLocate()
	{
		return x_location;
	}
	public double getyLocate()
	{
		return y_location;
	}
	public void getLocate(double getx,double gety)
	{
		getx=x_location;
		gety=y_location;
	}
	public void move_amount(double x_amount,double y_amount)
	{
		x_location+=x_amount;
		y_location+=y_amount;
	}
	public void move_locate(double x_locate,double y_locate)
	{
		x_location=x_locate;
		y_location=y_locate;
	}
	public void restart()
	{
		x_location=0.0;
		y_location=0.0;
	}
}

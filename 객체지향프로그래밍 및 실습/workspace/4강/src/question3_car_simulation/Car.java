package question3_car_simulation;
public class Car {

	private double fuellevel;
	
	public void drive(double distance)
	{
		fuellevel-=distance/20;
	}
	public double getGasInTank()
	{
		return fuellevel;
	}
	public void addGas(double Gas)
	{
		fuellevel+=Gas;
	}
	Car(double input)
	{
		fuellevel=input;
	}
}

package question2_Cone;

public class IcecreamCone {
	private double height,radius;
	public IcecreamCone(double height_input,double radius_input)
	{
		/*
		 * ������
		 * default ������ ����
		 * height=���� radius=������
		 */
		height=height_input;
		radius=radius_input;
		
	}
	public double getSurfaceArea()
	{	/*
		 *�ѳ��� ���
		 *��ȯ:double
	 	 */
		return radius*3.14*(radius+Math.sqrt(radius*radius+height*height));
	}
	public double getVolume()
	{
		/*
		 * ���� ���
		 * ��ȯ:double
		 */
		return 3.14*radius*radius*height/3;
	}
}

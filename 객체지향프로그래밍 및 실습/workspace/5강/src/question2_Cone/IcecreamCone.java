package question2_Cone;

public class IcecreamCone {
	private double height,radius;
	public IcecreamCone(double height_input,double radius_input)
	{
		/*
		 * 생성자
		 * default 생성자 없음
		 * height=높이 radius=반지름
		 */
		height=height_input;
		radius=radius_input;
		
	}
	public double getSurfaceArea()
	{	/*
		 *겉넓이 계산
		 *반환:double
	 	 */
		return radius*3.14*(radius+Math.sqrt(radius*radius+height*height));
	}
	public double getVolume()
	{
		/*
		 * 부피 계산
		 * 반환:double
		 */
		return 3.14*radius*radius*height/3;
	}
}

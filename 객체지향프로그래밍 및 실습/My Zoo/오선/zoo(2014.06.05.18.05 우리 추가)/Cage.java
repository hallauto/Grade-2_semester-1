package zoo;

import java.awt.Dimension;
import java.awt.Point;

/**
 * Cages에 들어갈 각각의 우리를 표현하는 객체
 * 
 */
public class Cage {
	private Point 			cagePoint;
	private Dimension	cageDimension;
	
	/**
	 * cage의 생성자
	 * 인자:				Point inputPoint
	 * exception:	NullPointerException
	 * @param inputPoint
	 */
	public Cage(Point inputPoint){
		cagePoint				= inputPoint;
		cageDimension	= new Dimension(300,180);
		
	}
	
	/**
	 * @return the cagePoint
	 */
	public Point getCagePoint() {
		return cagePoint;
	}

	/**
	 * @return the cageDimension
	 */
	public Dimension getCageDimension() {
		return cageDimension;
	}
	
	/**
	 * If it is inside, return true, or return false.
	 * @param mouse
	 * @return
	 */
	public boolean isItInside(Point mouse){
		if(cagePoint.x <= mouse.x && cagePoint.y <= mouse.y)
			if(cagePoint.x+cageDimension.width >= mouse.x && cagePoint.y+cageDimension.height >= mouse.y)
				return true;
		return false;
	}
	
	/**
	 * If it is inside, return true, or return false.
	 * @param nextX
	 * @param nextY
	 * @return
	 */
	public boolean isItInside(Point nextPoint, Dimension nextDimension){
		if(cagePoint.x <= nextPoint.x && cagePoint.y <= nextPoint.y)
			if(cagePoint.x+cageDimension.width >= nextPoint.x+nextDimension.width && cagePoint.y+cageDimension.height >= nextPoint.y+nextDimension.height)
				return true;
		return false;
	}
	
}

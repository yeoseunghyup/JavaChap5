/**
 * 원의 면적을 구하는 클래스 20130923
 * @author 여승협
 *
 */
class Circle {
	
	/**
	 * 반지름
	 */
	double  radius ;     
	Circle(double  radius ) {     
		this.radius = radius;
	}
	double getArea() {    
		double  area ;
		area = radius * radius * 3.14;
		return area;
	}
}


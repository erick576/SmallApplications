public class CircleArea {

double radius;


public CircleArea(double radius) throws InvalidCircleRadiusException {
	if(radius < 0) {
	throw new InvalidCircleRadiusException("Negative Radius");	
	}
	else {
	 this.radius = radius;
	}
}


public double area() {
return radius * radius * 3.14;
}
}
import java.util.Scanner;

public class CircleAreaTester {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
boolean is = false;
System.out.println("Please enter the radius of your circle");
while(!is) {
double rad = input.nextDouble();
try {
	CircleArea num = new CircleArea(rad);
	System.out.println("The area of your circle is: " +  num.area());
	is = true;
} catch (InvalidCircleRadiusException e) {
	System.out.println(e);
	System.out.println("Please try again:");
}

}
input.close();
	}

}

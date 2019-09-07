
public class NonResidentStudent extends Student {

double discountRate;	
	
NonResidentStudent(String name) {
		super(name);
	}

double getTuition() {
double base = super.getTuition();

return discountRate * base;
}

public double getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
}



}


public class ResidentStudent extends Student {

	double PremiumRate;
	
	ResidentStudent(String name) {
		super(name);
	}

	double getTuition() {
	double base = super.getTuition();
	
	return base * PremiumRate;
	}

	public double getPremiumRate() {
		return PremiumRate;
	}

	public void setPremiumRate(double premiumRate) {
		PremiumRate = premiumRate;
	}
}

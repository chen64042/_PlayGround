package java8;

public class AppleDisplayWeight implements AppleDisplayStrategy {
	public double HEAVY = 150.0;

	@Override
	public String format(Apple apple) {
		return apple.getWeight() > HEAVY ? "Heavy" : "Light";
	}
}

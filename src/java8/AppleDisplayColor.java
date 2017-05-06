package java8;

public class AppleDisplayColor implements AppleDisplayStrategy {

	@Override
	public String format(Apple apple) {
		return apple.getColor().toString();
	}

}

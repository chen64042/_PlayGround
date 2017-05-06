package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Apple {
	private AppleColors color = AppleColors.UNKNOWN;
	private double weight = -1;

	public Apple() {

	}

	public Apple(AppleColors color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public AppleColors getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

	public static List<Apple> selectApplesBy(List<Apple> appleBasket, Predicate<Apple> p) {
		List<Apple> selected = new ArrayList<Apple>();

		for(Apple anApple : appleBasket) {
			if (p.test(anApple)) {
				selected.add(anApple);
			}
		}

		return selected;
	}

	public static List<String> printApplesBy(List<Apple> appleBasket, List<AppleDisplayStrategy> strategies) {
		List<String> displayText = new ArrayList<String>();

		for(Apple anApple : appleBasket) {
			StringBuffer sb = new StringBuffer("A");

			for(AppleDisplayStrategy strategy: strategies) {
				sb.append(" ");
				sb.append(strategy.format(anApple));
			}

			sb.append(" Apple");

			displayText.add(sb.toString());
		}

		return displayText;
	}
}
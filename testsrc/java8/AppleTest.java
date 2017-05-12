package java8;

import static java.util.stream.Collectors.toList;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class AppleTest extends junit.framework.TestCase {
	private List<Apple> applesInBasket = new ArrayList<Apple>();
	private List<AppleDisplayStrategy> strategies = new ArrayList<AppleDisplayStrategy>();
	private BiFunction<AppleColors, Double, Apple> appleFactory = Apple::new;

	protected void setUp() {

		applesInBasket.add(appleFactory.apply(AppleColors.GREEN, Double.valueOf(30)));
		applesInBasket.add(appleFactory.apply(AppleColors.RED, Double.valueOf(130)));
//		applesInBasket.add((AppleColors.PINK, 230.0)->Apple::new);
		applesInBasket.add(new Apple(AppleColors.PINK, 230));
		applesInBasket.add(new Apple(AppleColors.GREEN, 70));
		applesInBasket.add(new Apple(AppleColors.YELLOW, 100));
		applesInBasket.add(new Apple(AppleColors.PINK, 1000));
		applesInBasket.add(new Apple(AppleColors.GREEN, 100));
		applesInBasket.add(new Apple(AppleColors.YELLOW, 500));
		applesInBasket.add(new Apple(AppleColors.PINK, 30));
		applesInBasket.add(new Apple(AppleColors.YELLOW, 310));

		strategies.add(new AppleDisplayColor());
		strategies.add(new AppleDisplayWeight());
	}

	public void testDisplayStrategy() {
		List<String> displayText = Apple.printApplesBy(applesInBasket, strategies);

		assertEquals("[A Green Light Apple, A Red Light Apple, A Pink Heavy Apple, A Green Light Apple, A Yellow Light Apple, A Pink Heavy Apple, A Green Light Apple, A Yellow Heavy Apple, A Pink Light Apple, A Yellow Heavy Apple]", displayText.toString());
	}

	public void testSelectApplesBy() {
		List<Apple> selected = null;

		selected = Apple.selectApplesBy(applesInBasket, (Apple anApple)->anApple.getColor() == AppleColors.GREEN);

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getColor() == AppleColors.GREEN);
		}

		selected = Apple.selectApplesBy(applesInBasket, (Apple anApple)->anApple.getWeight() > 150);

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getWeight() > 150);
		}

		selected = Apple.selectApplesBy(applesInBasket, (Apple anApple)->anApple.getColor() == AppleColors.PINK && anApple.getWeight() < 100);

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getColor() == AppleColors.PINK && anApple.getWeight() < 100);
		}
	}

	public void testSelectApplesByParallel() {
		List<Apple> selected = null;

		selected = applesInBasket.parallelStream().filter((Apple anApple)->anApple.getColor() == AppleColors.GREEN).collect(toList());

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getColor() == AppleColors.GREEN);
		}

		selected = applesInBasket.parallelStream().filter((Apple anApple)->anApple.getWeight() > 150).collect(toList());

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getWeight() > 150);
		}

		selected = applesInBasket.parallelStream().filter((Apple anApple)->anApple.getColor() == AppleColors.PINK && anApple.getWeight() < 100).collect(toList());

		assertTrue(!selected.isEmpty());

		for(Apple anApple: selected) {
			assertTrue(anApple.getColor() == AppleColors.PINK && anApple.getWeight() < 100);
		}
	}
}
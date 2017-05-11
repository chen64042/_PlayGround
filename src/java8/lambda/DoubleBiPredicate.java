package java8.lambda;

import java.util.function.BiPredicate;

@FunctionalInterface
public interface DoubleBiPredicate extends BiPredicate<Double, Double> {
	default boolean test(Double d1, Double d2) {
		return test(d1, d2, 4);
	}

	public boolean test(double d1, double d2, int precision);
}

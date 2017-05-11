package java8.lambda;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;

@FunctionalInterface
public interface DoubleBiFunction extends DoubleBinaryOperator, BiFunction<Double, Double, Double> {
	default double applyAsDouble(double d1, double d2) {
		return apply(d1, d2);
	}

	default double apply(double d1, double d2) {
		return apply(Double.valueOf(d1), Double.valueOf(d2));
	}

	default DoubleBiFunction andThen(double d, DoubleBiFunction after) {
	    Objects.requireNonNull(after);
	    return (t, u) -> after.apply(d, (double)apply(t, u));
	}

	default DoubleBiFunction andThen(DoubleBiFunction after, double d) {
		return andThen(d, after);
	}

	default DoubleBiFunction compose(DoubleBiFunction before1, DoubleBiFunction before2) {
	    Objects.requireNonNull(before1);
	    Objects.requireNonNull(before2);

	    return (t, u)->applyAsDouble(before1.apply(t, u), before2.apply(t, u));
	}
}

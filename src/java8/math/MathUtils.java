package java8.math;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

import java8.lambda.DoubleBiPredicate;

public class MathUtils {
	public static BiFunction<DoubleFunction<Double>, Double, Double> slope() {
		return (DoubleFunction<Double> f, Double x)->(f.apply(x+0.0001)-f.apply(x))/0.0001;
	}

	public static DoubleBiPredicate doubleEquals() {
		return (s1, s2, precision)->Math.round(s1*Math.pow(10, precision)) == Math.round(s2*Math.pow(10, precision));
	}

	public static boolean isLinear(DoubleFunction<Double> df, double a, double b) {
		return doubleEquals().test(slope().apply(df, a), slope().apply(df,  b), 4);
	}
}

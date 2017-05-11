package java8.lambda;

import java.util.function.DoubleFunction;

@FunctionalInterface
public interface Integral {
	double integrate(DoubleFunction<Double> f, double a, double b);
}
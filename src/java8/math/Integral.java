package java8.math;

import java.util.function.DoubleFunction;

@FunctionalInterface
public interface Integral {
	double integrate(DoubleFunction<Double> f, double a, double b);
}
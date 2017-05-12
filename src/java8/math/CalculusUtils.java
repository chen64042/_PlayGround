package java8.math;

public class CalculusUtils {
	public static Integral integrateLinear() {
		return (f, a, b)->(f.apply(b)-f.apply(a))/(b-a)*2;
	}
}

package java8;

import java.util.function.DoubleFunction;

import java8.math.CalculusUtils;
import junit.framework.TestCase;

public class CalculusUtilsTest extends TestCase {
	protected void setUp() {

	}

	public void testIntegrate() {
		DoubleFunction<Double> df = (x)->2*x + 1;

		assertEquals(4.0, CalculusUtils.integrateLinear().integrate(df, 1, 5));
	}
}

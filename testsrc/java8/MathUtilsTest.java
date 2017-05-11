package java8;

import java8.lambda.MathUtils;
import junit.framework.TestCase;

public class MathUtilsTest extends TestCase {
	protected void setUp() {

	}

	public void testIsLinear() {
		assertTrue(MathUtils.isLinear((x)->2*x + 1, 5, 7));
		assertFalse(MathUtils.isLinear((x)->x*x + 1, 5, 7));
	}

	public void testSlop() {
		assertEquals(2, Math.round(MathUtils.slope().apply((x)->2*x + 1, 0.0)));
		assertEquals(0, Math.round(MathUtils.slope().apply((x)->x*x + 1, 0.0)));
	}

	public void testDoubleEquals() {
		assertTrue(MathUtils.doubleEquals().test(1.0, 1.0, 4));
		assertTrue(MathUtils.doubleEquals().test(1.00001, 1.00004, 4));
		assertFalse(MathUtils.doubleEquals().test(1.00001, 1.00009, 4));
	}
}

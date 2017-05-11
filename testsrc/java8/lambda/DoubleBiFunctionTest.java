package java8.lambda;

import junit.framework.TestCase;

public class DoubleBiFunctionTest extends TestCase {
	DoubleBiFunction f = (a, b)->a+b;
	DoubleBiFunction g = (c, h)->Math.PI*(c)*(1+3*h/(10+Math.sqrt(4-3*h)));
	DoubleBiFunction h = (a, b)->(a-b)*(a-b)/(a+b)*(a+b);


	protected void setUp() {
	}

	public void testCompose() {
		assertEquals(6.0, f.compose(f, f).applyAsDouble(1, 2));
		assertEquals(4.0, f.compose(f, h).applyAsDouble(1, 2));
	}

	public void testAndThen() {
		assertEquals(4.0, h.compose(h, f).applyAsDouble(1, 2));
		assertEquals(h.andThen(f.applyAsDouble(1, 2), g).applyAsDouble(1, 2), g.compose(f, h).applyAsDouble(1, 2));
	}
}

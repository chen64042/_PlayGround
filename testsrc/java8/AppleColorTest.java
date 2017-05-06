package java8;

import junit.framework.TestCase;

public class AppleColorTest extends TestCase {
	protected void setUp() {
	}

	public void testAppleColorToString() {
		assertEquals("Green", AppleColors.GREEN.toString());
	}
}

package java8;

import java8.shape2d.Rectangle;
import java8.shape2d.dimensions.RectangleDimension;
import junit.framework.TestCase;

public class ShapeTest extends TestCase {
	private Rectangle r1 = new Rectangle(new RectangleDimension(100, 200)), r2 = new Rectangle();

	protected void setUp() throws Exception {
		super.setUp();

	}

	public void testRectangle() {
		assertTrue(r2.area() == 0);
		assertTrue(r2.perimeter() == 0);

		assertTrue(r1.area() == 100*200);
		assertTrue(r1.perimeter() == (100+200)*2);
	}
}

package java8;

import java8.utils.StringTools;
import junit.framework.TestCase;

public class StringToolsTest extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testToCapitalize() {
		assertEquals("Upper", StringTools.toCapitalize("UPPER"));
		assertEquals("Lower", StringTools.toCapitalize("lower"));
	}

}

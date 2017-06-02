package java8;

import java.util.function.Function;

import junit.framework.TestCase;

public class StandardLetterTest extends TestCase {
	private StandardLetter letter = new StandardLetter("Jenhau");
	private Function<String, String> header = letter::addHeader;
	private Function<String, String> footer = letter::addFooter;
	private Function<String, String> body = letter::addBody;

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testAddHeader() {
		assertEquals("Dear Jenhau, " + StandardLetter.LINE_BREAKER +"Have a nice day!", header.apply("Have a nice day!"));
	}

	public void testAddFooter() {
		assertEquals("Have a nice day!" + StandardLetter.LINE_BREAKER + "Kind Regards", footer.apply("Have a nice day!"));
	}

	public void testAddBody() {
		assertEquals("Have a nice day!", body.apply("Have a nice day!"));

	}

	public void testAndThen() {
		String aLetter = body.andThen(header).andThen(footer).apply("Have a nice day!");

		assertEquals("Dear Jenhau, " + StandardLetter.LINE_BREAKER + "Have a nice day!" + StandardLetter.LINE_BREAKER + "Kind Regards", aLetter);
	}
}

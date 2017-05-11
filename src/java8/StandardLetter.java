package java8;

public class StandardLetter {
	public static final String LINE_BREAKER = System.getProperty("line.separator");
	private String name = "";

	public StandardLetter(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String addBody(String body) {
		return body;
	}

	public String addHeader(String after) {
		return "Dear " + this.getName() + ", "+ LINE_BREAKER + after;
	}

	public String addFooter(String before) {
		return before + LINE_BREAKER + "Kind Regards";
	}
}

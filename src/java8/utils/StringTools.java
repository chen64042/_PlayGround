package java8.utils;

public class StringTools {
	public static String toCapitalize(String s) {
		StringBuffer sb = new StringBuffer();

		sb.append(s.substring(0, 1).toUpperCase());
		sb.append(s.substring(1).toLowerCase());

		return sb.toString();
	}
}

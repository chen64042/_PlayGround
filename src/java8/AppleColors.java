package java8;

import java8.utils.StringTools;

public enum AppleColors {
	RED, GREEN, YELLOW, PINK, UNKNOWN;

	public String toString() {
		return StringTools.toCapitalize(super.toString());
	}
}

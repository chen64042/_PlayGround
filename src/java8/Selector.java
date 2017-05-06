package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Selector<T> {
	public static <T> List<T> filter(List<T> items, Predicate<T> p) {
		List<T> selected = new ArrayList<>();

		for(T item: items) {
			if (p.test(item)) {
				selected.add(item);
			}
		}

		return selected;
	}

}

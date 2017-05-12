package java8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class StreamPlay {
	public static void main(String[] args) {
		String s = "a long long ago in a galaxy far far away";
		List<String> words = Arrays.asList(s.split(" "));

		words.stream().filter(word->word.length() >= 4).map(String::length).collect(toList()).forEach(System.out::println);
	}
}

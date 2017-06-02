package java8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import java8.interviews.Pair;
import java8.math.MathUtils;
import java8.math.MatrixUtils;
import java8.utils.StringTools;

public class StreamPlay {
	public static void main(String[] args) {
		String s = "a long long ago in a galaxy far far away";
		List<String> words = Arrays.asList(s.split(" "));

		words.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().collect(toList()).forEach(System.out::println);
		words.stream().map(word->word.split("")).distinct().collect(toList()).forEach(System.out::println);
		words.stream().map(word->word.split("")).distinct().collect(toList()).forEach((word)->System.out.println(word[0]));
		words.stream().filter(word->word.length() >= 4).map(StringTools::toCapitalize).collect(toList()).forEach(System.out::println);
		if (words.stream().filter(word->word.length() >= 4).map(StringTools::toCapitalize).anyMatch((word)->word.startsWith("P"))) {
			System.out.println("Have words starts with P and longer than 3");
		} else {
			System.out.println("Do not have words starts with P and longer than 3");
		}

		if (words.stream().filter(word->word.length() > 4).map(StringTools::toCapitalize).allMatch((word)->word.startsWith("G"))) {
			System.out.println("All words starts with G and longer than 4");
		} else {
			System.out.println("Not all words starts with G and longer than 4");
		}

		words.stream().filter(word->word.length() >= 4).map(StringTools::toCapitalize).findAny().ifPresent(System.out::println);

		int[] numbers = {1, 2, 3, 4, 5, 6, 7};

		Arrays.stream(numbers).map((x)->x*x).forEach(System.out::println);

		System.out.println("7.5%1 -> "+1.5%1);
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4, 5);

	    double[][] mm1 = { {4, 8 }, { 0, 2 }, { 1, 6 } }; // 3 x 2
	    double[][] mm2 = { { 5, 2 }, { 9, 4 } }; // 2 x 2 <5, 2> is in a column, <9, 4> is in another column. Not rows

	    MatrixUtils.multiplyMatrices(mm1, mm2);

	    int mRows = 50, mColumns =20;
	    int nRows = 20, nColumns = 40;
	    int kRows = 10, kColumns = 100000;

	    double[][] m1 = new double[mRows][mColumns];
	    double[][] m2 = new double[nRows][nColumns];

	    double[] k = new double[kColumns];

	    long start = System.currentTimeMillis();
//	    IntStream.range(0, kColumns).mapToDouble(i->{ k[i] = (long)MathUtils.scaleRandom(1000, 3); return k[i]; }).forEach(System.out::println);;
	    long end = System.currentTimeMillis();

	    System.out.println("in "+(end - start)+"ms");

	    System.out.println("Done w/ Initialization for m, one-dimension");
	    System.out.println("Done w/ Initialization for m, one-dimension");


		int row = 1, column = 5, rows = 50, columns = 20;
		double[][] matrix = new double[columns][rows];

		System.out.println(m1.length); // # of rows
		System.out.println(m1[0].length); // # of columns

//		System.out.println(Arrays.deepToString(MatrixUtils.multiplication(m1, m2)));

//		numbers1.stream().map((x)->numbers2.stream().map((y)->new Pair<Integer>(x, y))).forEach(System.out::println);
//		numbers1.stream().reduce(Integer::min).ifPresent(System.out::println);


//		numbers1.stream().flatMap((x)->numbers2.stream().filter((y)->(x+y)%3 == 0).map((y)->new Pair<Integer>(x, y))).forEach(System.out::println);
	}
}

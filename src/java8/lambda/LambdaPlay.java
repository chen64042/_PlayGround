package java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import java8.Apple;
import java8.AppleColors;
import java8.Selector;
import java8.shape2d.Shape;

public class LambdaPlay {
	BiPredicate<Shape, Shape> p2 = (s1, s2)->Math.abs(s1.area() - s2.area()) > 0.0001;
	Comparator<Shape> c1 = (s1, s2)->Double.valueOf(s1.area()).compareTo(s2.area());
	// avoid autoboxing
	Comparator<Shape> cArea = comparingDouble(Shape::area);
	Comparator<Shape> cPerimeter = comparingDouble(Shape::perimeter);
	Runnable r = ()->{ Apple a = new Apple(); System.out.println("apple has color:"+a.getColor()); };
	Function<Integer, Integer> halves = (f)->(int)f/2;;
	// avoid autoboxing
	ToIntFunction<Integer> ihalves = (Integer f)->{ return (int)f/2; };
	Consumer<Apple> eaten = (Apple a)->System.out.print("eat "+a.getColor()+" apple");

	public static void main(String[] args) {
		Predicate<Apple> greenApple = (a)->a.getColor() == AppleColors.GREEN;
		List<Shape> shapes = new ArrayList<Shape>();
		List<Apple> apples = new ArrayList<Apple>();

		Selector.filter(apples, greenApple.and(a->a.getWeight() > 150).negate());

		shapes.sort(comparingDouble(Shape::perimeter).thenComparingDouble(Shape::area));

		Function<BufferedReader, String> aLine = (BufferedReader b)-> {
			String line = "";

			try {
				line = b.readLine();
			} catch (IOException e) {
				line = "";
				e.printStackTrace();
			}
			return line;

		};

		System.out.println(aLine);
	}
}

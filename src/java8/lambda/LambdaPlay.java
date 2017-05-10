package java8.lambda;

import java.util.Comparator;
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
import java8.shape2d.Shape;

public class LambdaPlay {
	Predicate<Apple> p = (Apple a)->a.getColor() == AppleColors.GREEN;
	BiPredicate<Shape, Shape> p2 = (Shape s1, Shape s2)->Math.abs(s1.area() - s2.area()) > 0.0001;
	Comparator<Shape> c1 = (Shape s1, Shape s2)->Double.valueOf(s1.area()).compareTo(s2.area());
	// avoid autoboxing
	Comparator<Shape> cArea = comparingDouble(Shape::area);
	Comparator<Shape> cPerimeter = comparingDouble(Shape::perimeter);
	Runnable r = ()->{ Apple a = new Apple(); System.out.println("apple has color:"+a.getColor()); };
	Function<Integer, Integer> halves = (Integer f)->{ return (int)f/2; };
	// avoid autoboxing
	ToIntFunction<Integer> ihalves = (Integer f)->{ return (int)f/2; };
	Consumer<Apple> eaten = (Apple a)->System.out.print("eat "+a.getColor()+" apple");

	public static void main(String[] args) {
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

package java8.shape2d;

import java8.shape2d.dimensions.SquareDimension;

public class Square extends Rectangle {
	private SquareDimension dimension = new SquareDimension();

	public Square() {
	}

	public Square(SquareDimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public double area() {
		return this.dimension.getSide()*this.dimension.getSide();
	}

	@Override
	public double perimeter() {
		return this.dimension.getSide()*4;
	}

	@Override
	public void draw() {
	}
}

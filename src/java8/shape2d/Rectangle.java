package java8.shape2d;

import java8.shape2d.dimensions.GeometryDimension2D;
import java8.shape2d.dimensions.RectangleDimension;

public class Rectangle implements Shape {
	private RectangleDimension dimension = new RectangleDimension();

	public Rectangle() {
	}

	public Rectangle(RectangleDimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public double area() {
		return this.dimension.getHeight()*this.dimension.getWidth();
	}

	@Override
	public double perimeter() {
		return (this.dimension.getHeight()+this.dimension.getWidth())*2;
	}

	@Override
	public void draw() {
	}

	@Override
	public GeometryDimension2D getDimension() {
		return this.dimension;
	}
}

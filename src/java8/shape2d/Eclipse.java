package java8.shape2d;

import java8.shape2d.dimensions.EclipseDimension;
import java8.shape2d.dimensions.GeometryDimension2D;

public class Eclipse implements Shape {
	private EclipseDimension dimension = new EclipseDimension();

	public Eclipse() {
	}

	public Eclipse(EclipseDimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public double area() {
		return this.dimension.getSemiMajor()*this.dimension.getSemiMinor()*Math.PI;
	}

	@Override
	public double perimeter() {
		double h, a = this.dimension.getSemiMajor(), b = this.dimension.getSemiMinor();

		h = (a-b)*(a-b)/(a+b)*(a+b);

		return Math.PI*(a+b)*(1+3*h/(10+Math.sqrt(4-3*h)));
	}

	@Override
	public void draw() {
	}

	@Override
	public GeometryDimension2D getDimension() {
		return this.dimension;
	}
}

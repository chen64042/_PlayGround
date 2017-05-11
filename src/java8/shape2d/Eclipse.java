package java8.shape2d;

import java8.lambda.DoubleBiFunction;
import java8.shape2d.dimensions.EclipseDimension;
import java8.shape2d.dimensions.GeometryDimension2D;

public class Eclipse implements Shape {
	private EclipseDimension dimension = new EclipseDimension();
	private DoubleBiFunction f = (a, b)->(a-b)*(a-b)/(a+b)*(a+b);
	private DoubleBiFunction g = (c, h)->Math.PI*(c)*(1+3*h/(10+Math.sqrt(4-3*h)));
	private DoubleBiFunction h = (a, b)->a+b;

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
		double a = this.dimension.getSemiMajor(), b = this.dimension.getSemiMinor();

		return g.compose(h, f).applyAsDouble(a, b);

		// return f.andThen(h.applyAsDouble(a, b), g).applyAsDouble(a, b);

	}

	@Override
	public void draw() {
	}

	@Override
	public GeometryDimension2D getDimension() {
		return this.dimension;
	}
}

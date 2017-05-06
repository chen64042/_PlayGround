package java8.shape2d.dimensions;

public class CircleDimension implements GeometryDimension2D {
	private double radius = 0;

	public CircleDimension() {
	}

	public CircleDimension(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}

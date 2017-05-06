package java8.shape2d.dimensions;

public class SquareDimension implements GeometryDimension2D {
	private double side = 0;

	public SquareDimension() {
	}

	public SquareDimension(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
}

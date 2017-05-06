package java8.shape2d.dimensions;

public class RectangleDimension implements GeometryDimension2D {
	private double height = 0, width = 0;

	public RectangleDimension() {
	}

	public RectangleDimension(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}
}

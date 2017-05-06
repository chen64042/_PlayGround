package java8.shape2d.dimensions;

public class EclipseDimension implements GeometryDimension2D {
	private double semiMinor = 0;
	private double semiMajor = 0;

	public EclipseDimension() {
	}

	public EclipseDimension(double semiMinor, double semiMajor) {
		this.semiMinor = semiMinor;
		this.semiMajor = semiMajor;
	}

	public double getSemiMinor() {
		return this.semiMinor;
	}

	public double getSemiMajor() {
		return this.semiMajor;
	}
}

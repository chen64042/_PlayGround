package java8.shape2d;

import java8.shape2d.dimensions.CircleDimension;

public class Circle extends Eclipse {
	private CircleDimension dimsnion = new CircleDimension();

	public Circle() {
	}

	public Circle(CircleDimension dimension) {
		this.dimsnion = dimension;
	}

	@Override
	public double area() {
		return this.dimsnion.getRadius()*this.dimsnion.getRadius()*Math.PI;
	}

	@Override
	public double perimeter() {
		return this.dimsnion.getRadius()*2*Math.PI;
	}

	@Override
	public void draw() {
	}

}

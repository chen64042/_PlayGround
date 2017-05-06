package java8.shape2d;

import java8.shape2d.dimensions.GeometryDimension2D;

public interface Shape {
	GeometryDimension2D getDimension();
	double area();
	double perimeter();
	void draw();

}

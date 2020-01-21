
public class Cylinder extends Shape {
	
	private double radius;
	private double height;
	
	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	double surface_area() {
		return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public String toString() {
		return "The surface area of the Cylinder is " + this.surface_area() + " and the Volume of the Cylinder is " + this.volume() + ".";
	}

}

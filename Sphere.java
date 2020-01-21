
public class Sphere extends Shape {
	
	private double radius;

	@Override
	double surface_area() {
		return 4 * Math.PI * (Math.pow(radius, 2));
	}

	@Override
	double volume() {
		return (4.0/3.0) * Math.PI * (Math.pow(radius, 3));
	}
	
	Sphere(double radius) {
		this.radius = radius;
	}
	public String toString() {
		return "The surface area of the Sphere is " + this.surface_area() + " and the Volume of the Sphere is " + this.volume() + ".";
	}
}

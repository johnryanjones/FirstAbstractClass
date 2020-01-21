
public class ShapeArray {

	public static void main(String[] args) {
		
		Sphere s1 = new Sphere(15.00);
		Cylinder c1 = new Cylinder(5.00, 20.00);
		Cone cone1 = new Cone(8.00, 30.00);
		
		Shape[] shapeArray = new Shape[3];
		shapeArray[0] = s1;
		shapeArray[1] = c1;
		shapeArray[2] = cone1;
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println("");
			System.out.println(shapeArray[i].toString());
			System.out.println("");
		}

	}

}

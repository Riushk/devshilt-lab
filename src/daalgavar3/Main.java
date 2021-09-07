package daalgavar3;

public class Main {

	public static void main(String[] args) {
		var rectangle = new Rectangle(10.0, 10.0);
		rectangle.setColor("red");
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.toString());
		
		var triangle = new Triangle(10.0, 3.0);
		triangle.setColor("blue");
		System.out.println(triangle.getArea());
		System.out.println(triangle.toString());
	}

}

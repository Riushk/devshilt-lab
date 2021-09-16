package daalgavar1;

public class Main {

	public static void main(String[] args) {
		Car mycar = new Car("4932", 2020, new Engine(5000, "this is my serial number"));
		
		System.out.println(mycar.toString());
		
	}

}

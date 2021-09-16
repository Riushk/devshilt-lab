package daalgavar1;

public class Car {

	private String number;
	private int yearOfManufacturer;
	private Engine engine;
	
	public Car() {
		super();
	}

	public Car(String number, int yearOfManufacturer, Engine engine) {
		super();
		this.number = number;
		this.yearOfManufacturer = yearOfManufacturer;
		this.engine = engine;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getYearOfManufacturer() {
		return yearOfManufacturer;
	}

	public void setYearOfManufacturer(int yearOfManufacturer) {
		this.yearOfManufacturer = yearOfManufacturer;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", yearOfManufacturer=" + yearOfManufacturer + ", engine=" + engine + "]";
	}
	
}

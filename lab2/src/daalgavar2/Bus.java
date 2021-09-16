package daalgavar2;

public class Bus {

	private String number;
	private int yearOfManufacturer;
	private Passenger[] passenger;
	
	public Bus() {
		super();
	}

	public Bus(String number, int yearOfManufacturer, Passenger[] passenger) {
		super();
		this.number = number;
		this.yearOfManufacturer = yearOfManufacturer;
		this.passenger = passenger;
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

	public Passenger[] getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger[] passenger) {
		this.passenger = passenger;
	}

}

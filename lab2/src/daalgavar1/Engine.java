package daalgavar1;

public class Engine {
	
	private int capacity;
	private String serialNumber;
	
	public Engine() {
		super();
	}

	public Engine(int capacity, String serialNumber) {
		super();
		this.capacity = capacity;
		this.serialNumber = serialNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", serialNumber=" + serialNumber + "]";
	}
	
}

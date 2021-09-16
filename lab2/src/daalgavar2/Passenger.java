package daalgavar2;

public class Passenger {
	
	private String passengerName;
	private int seatNum;
	
	public Passenger() {
		super();
	}

	public Passenger(String passengerName, int seatNum) {
		super();
		this.passengerName = passengerName;
		this.seatNum = seatNum;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}

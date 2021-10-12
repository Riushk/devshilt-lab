package daalgavar2;

public class Main {

	public static void main(String[] args) {
		Passenger[] passengers = new Passenger[1];
		passengers[0].setPassengerName("Bat");
		passengers[0].setSeatNum(1);
		passengers[1].setPassengerName("Bold");
		passengers[1].setSeatNum(2);
		var bus = new Bus("4932 UBN", 2021, passengers);
		
		System.out.println("bus number : " + bus.getNumber());
	}

}

package daalgavar2;

public class Main {

	public static void main(String[] args) {
		var checkingAccount = new CheckingAccount(1, 1000.0);
		checkingAccount.setFee(1.0);
		checkingAccount.deductFee();
		System.out.println("Balance after checking account deduct fee: " + checkingAccount.getTotalBalance());
	}

}

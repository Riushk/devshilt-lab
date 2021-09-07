package daalgavar2;

public class SavingAccount extends BankAccount{

	private Double interestRate;

	public void addInterest() {
		setTotalBalance(getTotalBalance() + interestRate*getTotalBalance());
	}
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
}

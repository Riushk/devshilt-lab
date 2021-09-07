package daalgavar2;

public class CheckingAccount extends BankAccount{
	
//	c. fee – шимтгэл, intestRate - хүү
	
	private Double fee;
	
//	d. deductFee() шимтгэл суутгаж, үлдэгдлийг хорогдуулна
	
	public void deductFee() {
		setTotalBalance(getTotalBalance()- fee); 
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
}

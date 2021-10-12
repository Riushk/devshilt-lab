package daalgavar2;

public class CheckingAccount extends BankAccount{
	
//	c. fee â€“ ÑˆÐ¸Ð¼Ñ‚Ð³Ñ�Ð», intestRate - Ñ…Ò¯Ò¯
	
	private Double fee;
	
//	d. deductFee() ÑˆÐ¸Ð¼Ñ‚Ð³Ñ�Ð» Ñ�ÑƒÑƒÑ‚Ð³Ð°Ð¶, Ò¯Ð»Ð´Ñ�Ð³Ð´Ð»Ð¸Ð¹Ð³ Ñ…Ð¾Ñ€Ð¾Ð³Ð´ÑƒÑƒÐ»Ð½Ð°
	
	public CheckingAccount(int accountNumber, Double totalBalance) {
		super(accountNumber, totalBalance);
	}
	
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

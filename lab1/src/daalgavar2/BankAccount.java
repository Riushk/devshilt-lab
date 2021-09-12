package daalgavar2;

public class BankAccount {
	
	private int accountNumber;
	private Double totalBalance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, Double totalBalance) {
		super();
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}

//	a. deposit() орлогын гүйлгээ хийнэ
	
	public void deposit(Double amount) {
		totalBalance = totalBalance + amount;
	}
	
//	b. withdraw() зарлагын гүйлгээ хийнэ
	
	public void widthraw(Double amount) {
		totalBalance = totalBalance - amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Double getTotalBalance() {
		return totalBalance;
	}
	
	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
}

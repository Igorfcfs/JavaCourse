package entities;

public /*final*/ class Account { //This 'final' prevent than a person create a subclass of this type

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}
	
	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public /*final*/ void deposit(Double amount) { //This 'final' prevent than subclass override it
		balance += amount;
	}
	
}

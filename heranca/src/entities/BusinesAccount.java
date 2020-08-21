package entities;

public class BusinesAccount extends Accounts {
	
	private Double limit;
	
	public BusinesAccount() {
		super();
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public BusinesAccount(Integer number, String holder, Double balance, Double limit) {
		super(number, holder, balance);
		this.limit = limit;
	}
	
	public void emprestimo(Double amount) {
		if(amount <= limit) {
			balance += amount -10.0;
		}
	}
	
	@Override
	public void saque(double amount) {
		super.saque(amount);
		balance -= 2.0;
	}

}

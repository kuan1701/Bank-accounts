package enums;

public enum CurrencyType {
	
	EURO ("Euro"),
	DOLLAR ("Dollar"),
	RUB ("Rub");
	
	String currency;
	
	CurrencyType(String currency) {
		this.currency = currency;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return currency;
	}
}

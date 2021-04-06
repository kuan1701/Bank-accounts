package interfaces;

import model.BankAccount;

public interface Transactions {
	
	void getMoney(long withdrawalAmount);
	
	void takeMoney(long replenishmentAmount);
	
	void moneyTransfer(long transferAmount);
	
	
}

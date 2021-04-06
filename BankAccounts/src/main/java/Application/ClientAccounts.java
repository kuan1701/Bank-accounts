package Application;

import enums.CurrencyType;
import model.BankAccount;
import model.ForeignCurrencyAccount;
import model.MainAccount;
import service.AccountTransactions;

import java.time.LocalDate;

public class ClientAccounts {
	
	public static void main(String[] args) {
		
		BankAccount mainAccount = new MainAccount("Chin Kuan", 123456789, 100, CurrencyType.EURO, LocalDate.of(2021, 4, 5), LocalDate.of(2025, 4, 5), false);
		
		BankAccount foreignCurrencyAccount = new ForeignCurrencyAccount("Chin Kuan", 12345678910L, 100, CurrencyType.DOLLAR, LocalDate.of(2021, 4, 5), LocalDate.of(2025, 4, 5), false);
		
		
		AccountTransactions.addAccount(mainAccount);
		AccountTransactions.addAccount(foreignCurrencyAccount);
		
		AccountTransactions.accountSearch(123456789);
		
		AccountTransactions.getSumOfAllPositiveAccounts();
		
		AccountTransactions.blockAccount(mainAccount);
		
		AccountTransactions.getListOfClientAccounts();
		
	}
}

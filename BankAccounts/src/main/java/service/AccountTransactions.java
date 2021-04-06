package service;

import enums.CurrencyType;
import model.BankAccount;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountTransactions {
	
	private static List<BankAccount> accountsList = new LinkedList<>();
	private static HashMap<Integer, BankAccount> accountsMap = new HashMap<>();
	
	// Method displays a list of client accounts
	public static void getListOfClientAccounts() {
		
		accountsList.forEach(System.out::println);
	}
	
	// The method adds a new account to the list of customer accounts
	public static void addAccount(BankAccount bankAccount) {

		accountsList.add(bankAccount);
	}
	
	// The method allows the client to block his account
	public static void blockAccount(BankAccount bankAccount) {

		bankAccount.setBlocked(true);
	}
	
	// The method allows the client to unblock his account
	public static void unblockAccount(BankAccount bankAccount) {

		bankAccount.setBlocked(false);
	}
	
	// The method allows the client to sort the list of their accounts
	public static void sortedAccount(CurrencyType currencyType) {
	
		accountsList.stream()
				.sorted(Comparator.comparing(BankAccount::getCurrency))
				.forEach(System.out::println);
	}
	
	// The method allows the client to find his account and view its details by
	// entering the account number
	public static void accountSearch(long accountNumber) {
		
		List<BankAccount> searchList = accountsList.stream()
				.filter(account -> account.getAccountNumber() == accountNumber)
				.collect(Collectors.toList());
		
		System.out.println(searchList);
	}
	
	// Method outputs positive balance of all accounts
	public static void getSumOfAllPositiveAccounts() {
		
		float positiveBalance = 0;
		
		for (BankAccount bankAccount : accountsList) {
			
			if (bankAccount.getBalance() > 0) {
				
				positiveBalance += bankAccount.getBalance();
			}
		}
		System.out.println(positiveBalance);
	}
	
	// Method outputs negative balance of all accounts
	public static void getSumOfAllNegativeAccounts() {
		
		float negativeBalance = 0;
		
		for (BankAccount bankAccount : accountsList) {
			
			if (bankAccount.getBalance() < 0) {
				
				negativeBalance += bankAccount.getBalance();
			}
		}
		System.out.println(negativeBalance);
	}
}

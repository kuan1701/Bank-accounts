package model;

import enums.CurrencyType;

import java.time.LocalDate;

public class ForeignCurrencyAccount extends BankAccount{

	
	/**
	 * Constructs an ForeignCurrencyAccount with no specified parameters
	 */
	public ForeignCurrencyAccount() {
	}
	
	/**
	 * Creates a ForeignCurrencyAccount given by the fields of the superclass BankAccount
	 *
	 * @param accountOwner   BankAccount accountOwner
	 * @param accountNumber  BankAccount accountNumber
	 * @param balance        BankAccount balance
	 * @param currency       BankAccount currency
	 * @param openingDate    BankAccount openingDate
	 * @param expirationDate BankAccount expirationDate
	 * @param blocked        BankAccount blocked
	 */
	public ForeignCurrencyAccount(String accountOwner, long accountNumber, float balance, CurrencyType currency, LocalDate openingDate, LocalDate expirationDate, boolean blocked) {
		
		super(accountOwner, accountNumber, balance, currency, openingDate, expirationDate, blocked);
	}
	
	@Override
	public void getMoney(long withdrawalAmount) {
	
	}
	
	@Override
	public void takeMoney(long replenishmentAmount) {
	
	}
	
	@Override
	public void moneyTransfer(long transferAmount) {
	
	}
	
	@Override
	public String toString() {
		
		return "ForeignCurrencyAccount " + super.toString();
	}
}

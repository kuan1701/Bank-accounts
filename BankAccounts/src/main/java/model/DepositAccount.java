package model;

import enums.CurrencyType;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
	
	private float interestRate;
	
	
	/**
	 * Constructs an DepositAccount with no specified parameters
	 */
	public DepositAccount() {
	}
	
	/**
	 * Creates a DepositAccount given by the fields of the superclass BankAccount, and by the field interestRate
	 *
	 * @param accountOwner   BankAccount accountOwner
	 * @param accountNumber  BankAccount accountNumber
	 * @param balance        BankAccount balance
	 * @param currency       BankAccount currency
	 * @param openingDate    BankAccount openingDate
	 * @param expirationDate BankAccount expirationDate
	 * @param blocked        BankAccount blocked
	 * @param interestRate   DepositAccount interestRate
	 */
	public DepositAccount(String accountOwner, long accountNumber, float balance, CurrencyType currency, LocalDate openingDate, LocalDate expirationDate, float interestRate, boolean blocked) {
		
		super(accountOwner, accountNumber, balance, currency, openingDate, expirationDate, blocked);
		this.interestRate = interestRate;
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
	
	/**
	 * @return the entered fields of the object as a string
	 */
	@Override
	public String toString() {
		
		return "DepositAccount {" +
				"interestRate = " + interestRate +
				"} " + super.toString();
	}
	
	/**
	 * @return interestRate
	 */
	public float getInterestRate() {
		
		return interestRate;
	}
	
	public void setInterestRate(float interestRate) {
		
		this.interestRate = interestRate;
	}
}

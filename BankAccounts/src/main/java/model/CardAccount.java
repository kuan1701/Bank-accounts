package model;

import enums.CurrencyType;

import java.time.LocalDate;

public class CardAccount extends BankAccount{
	
	private long cardNumber;
	
	
	/**
	 * Constructs a CardAccount with no specified parameters
	 */
	public CardAccount() {
	}
	
	/**
	 * Creates a CardAccount given by the fields of the superclass BankAccount, and by the field cardNumber
	 *
	 * @param accountOwner   BankAccount accountOwner
	 * @param accountNumber  BankAccount accountNumber
	 * @param balance        BankAccount balance
	 * @param currency       BankAccount currency
	 * @param openingDate    BankAccount openingDate
	 * @param expirationDate BankAccount expirationDate
	 * @param blocked        BankAccount blocked
	 * @param cardNumber     CardAccount interestRate
	 */
	public CardAccount(String accountOwner, long accountNumber, float balance, CurrencyType currency, LocalDate openingDate, LocalDate expirationDate, boolean blocked, long cardNumber) {
		
		super(accountOwner, accountNumber, balance, currency, openingDate, expirationDate, blocked);
		this.cardNumber = cardNumber;
	}
	
	@Override
	public void getMoney(long withdrawalAmount) {
		
		System.out.println("Operation completed successfully");
		System.out.println("Account balance " + (getBalance() - withdrawalAmount));
	}
	
	@Override
	public void takeMoney(long replenishmentAmount) {
		
		System.out.println("Operation completed successfully");
		System.out.println("Account balance " + (getBalance() + replenishmentAmount));
	}
	
	@Override
	public void moneyTransfer(long transferAmount) {
		
		System.out.println("Operation completed successfully");
		System.out.println("Account balance " + (getBalance() - transferAmount));
	}
	
	/**
	 * @return the entered fields of the object as a string
	 */
	@Override
	public String toString() {
		
		return "CardAccount {" +
				"cardNumber = " + cardNumber +
				"} " + super.toString();
	}
	
	/**
	 * @return cardNumber
	 */
	public long getCardNumber() {
		
		return cardNumber;
	}
	
	public void setCardNumber(long cardNumber) {
		
		this.cardNumber = cardNumber;
	}
}

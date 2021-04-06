package model;

import enums.CurrencyType;
import interfaces.Transactions;

import java.time.LocalDate;
import java.util.Objects;

abstract public class BankAccount implements Transactions {
	
	private String accountOwner;
	private long accountNumber;
	private float balance;
	private CurrencyType currency;
	private LocalDate openingDate;
	private LocalDate expirationDate;
	private boolean blocked = true;
	
	
	/**
	 * Constructs a BankAccount with no specified parameters
	 */
	public BankAccount() {
	}
	
	/**
	 * Constructs an BankAccount of a given accountOwner, accountNumber, balance, currency, openingDate, blocked
	 *
	 * @param accountOwner   BankAccount accountOwner
	 * @param accountNumber  BankAccount accountNumber
	 * @param balance        BankAccount balance
	 * @param currency       BankAccount currency
	 * @param openingDate    BankAccount openingDate
	 * @param expirationDate BankAccount expirationDate
	 * @param blocked        BankAccount blocked
	 */
	public BankAccount(String accountOwner, long accountNumber, float balance, CurrencyType currency, LocalDate openingDate, LocalDate expirationDate, boolean blocked) {
		
		this.accountOwner = accountOwner;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.currency = currency;
		this.openingDate = openingDate;
		this.expirationDate = expirationDate;
		this.blocked = blocked;
	}
	
	/**
	 * @return true or false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof BankAccount)) return false;
		BankAccount that = (BankAccount) obj;
		return getAccountNumber() == that.getAccountNumber() &&
				getAccountOwner().equals(that.getAccountOwner());
	}
	
	/**
	 * @return the hash code of the object as a number
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(accountOwner, accountNumber, currency);
	}
	
	/**
	 * @return the entered fields of the object as a string
	 */
	@Override
	public String toString() {
		
		return "BankAccount {" +
				"accountOwner = '" + accountOwner + '\'' +
				", accountNumber = " + accountNumber +
				", balance = " + balance +
				", currency = " + currency +
				", openingDate = " + openingDate +
				", expirationDate = " + expirationDate +
				", blocked = " + blocked +
				'}';
	}
	
	/**
	 * @return accountOwner
	 */
	public String getAccountOwner() {
		
		return accountOwner;
	}
	
	public void setAccountOwner(String accountOwner) {
		
		this.accountOwner = accountOwner;
	}
	
	/**
	 * @return accountNumber
	 */
	public long getAccountNumber() {
		
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	
	/**
	 * @return balance
	 */
	public float getBalance() {
		
		return balance;
	}
	
	public void setBalance(float balance) {
		
		this.balance = balance;
	}
	
	/**
	 * @return currency
	 */
	public CurrencyType getCurrency() {
		
		return currency;
	}
	
	public void setCurrency(CurrencyType currency) {
		
		this.currency = currency;
	}
	
	/**
	 * @return openingDate
	 */
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	
	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}
	
	/**
	 * @return expirationDate
	 */
	public LocalDate getExpirationDate() {
		
		return expirationDate;
	}
	
	public void setExpirationDate(LocalDate expirationDate) {
		
		this.expirationDate = expirationDate;
	}
	
	/**
	 * @return expirationDate
	 */
	public boolean isBlocked() {
		
		return blocked;
	}
	
	public void setBlocked(boolean blocked) {
		
		this.blocked = blocked;
	}
}

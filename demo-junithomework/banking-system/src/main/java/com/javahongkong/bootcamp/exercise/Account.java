package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.startingDeposit = balance;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		if attemptedPin == this.pin{
		return true;
		}
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
		this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue;
	}

	public boolean debitAccount(double amount) {
		// complete the function
		if this.balance >= amount {
			this.balance = BigDecimal.valueOf(amount).subtract(BigDecimal.valueOf(this.balance)).doubleValue; 
			return true;
		} return false;		
	}
}

package model.entities;

import java.util.InputMismatchException;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		setBalance(balance);
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) throws InputMismatchException {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
		setBalance(balance);
	}
	public void withdraw(Double amount)throws DomainException {	
		
		if (amount > getWithdrawLimit()) {
			throw new DomainException(" Withdrawerror: The amount exceeds withdraw limit ");
		}
		if (amount > getBalance()) {
			throw new DomainException( "Withdrawerror: Not enough balance");
		}
		balance -= amount;
		setBalance(balance);
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}
	
	
	
}

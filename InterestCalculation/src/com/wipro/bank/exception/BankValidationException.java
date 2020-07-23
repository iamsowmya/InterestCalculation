package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	public String toStriing()
	{
		return "Invalid Date";
	}
	public BankValidationException(String str)
	{
		super(str);
	}
}

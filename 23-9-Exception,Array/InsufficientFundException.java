package com.a239;

public class InsufficientFundException extends Exception 
{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//constructor
	public InsufficientFundException(Throwable cause,String message) 
	{
		super(cause);
		this.message = message;
	}
	
	//constructor
	public InsufficientFundException(String message) 
	{
		this.message = message;
	}
	
	
	
}

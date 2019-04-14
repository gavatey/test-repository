package com.pradeep.banking.ccc;

public class Logging {
	
	
	public Logging() {
	System.err.println("Logging Aspect Created....");
	}
	
	
	/**
	 * * This is the method which I would like to execute * before a selected
	 * method execution.
	 */
	public void beforeAdvice() {
		System.err.println("Going to setup account profile.");
	}

	/**
	 * * This is the method which I would like to execute * after a selected
	 * method execution.
	 */
	public void afterAdvice() {
		System.err.println("account profile has been setup.");
	}

	/**
	 * * This is the method which I would like to execute * when any method
	 * returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		System.err.println("Returning :" + retVal);
	}

	/**
	 * * This is the method which I would like to execute * if there is an
	 * exception raised.
	 */
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.err.println("There has been an exception: " + ex.toString());
	}

}

package org.cusey.ExceptionHandling;

public class DivideByZeroException extends ArithmeticException {

	private static final long serialVersionUID = 1L;
	
	public DivideByZeroException(){
		super ("Attempted to divide by zero");
	}
	

}

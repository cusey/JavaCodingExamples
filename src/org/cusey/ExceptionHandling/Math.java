package org.cusey.ExceptionHandling;

public class Math {
	
	public Math(){
	}
	
	public double divide(double numerater, double denominater)throws DivideByZeroException{
		if(denominater == 0){
			throw new DivideByZeroException();
		}
		
		return numerater/denominater;
	}
	


}

package exceptionhadling;

public class LicenseException extends Exception {  // we can extend the child class using parent class(exception- already the inbulit class in java)

	public  LicenseException(String s)     // constructor, if we want to pass the message(print the statement) we use string data type 
	{
		super(s);           // parent class(exception) constructor calling 

	}

}
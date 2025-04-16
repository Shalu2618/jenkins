package exceptionhadling;

import java.io.IOException;  //if checked exception then it should be import.
//checked exception

public class Throwsexample2 {
	
	public static void print()throws IOException
	{
		throw new IOException();
		
	}
	public static void main(String[] args) throws IOException {    //in checked exception it can be declared using throws keyword or handle it using try,catch
		// TODO Auto-generated method stub
		Throwsexample2.print();
	}


}

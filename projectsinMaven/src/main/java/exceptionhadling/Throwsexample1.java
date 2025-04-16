package exceptionhadling;
//unchecked exception

public class Throwsexample1 {
	public static void print() throws ArithmeticException
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {

		Throwsexample1.print();

	}

}


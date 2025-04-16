package exceptionhadling;

public class Throwsample {

	public static void print(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		if(c>20) {
			throw new ArithmeticException("c is greater than 20");// we generate exception
		}
		else
		{
			System.out.println("c is less than 20");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsample.print(10,15);
	}

}
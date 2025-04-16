package exceptionhadling;


	public class Trycatch {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a=10;
	int b=5;
	int c=a+b;
	System.out.println(c);

	try                                  // exception code should be  given inside the try block
	{
		int arr[]=new int [5];          // array exception
		arr[10]=45;
		int result=5/0;                  // arithmetic exception
	}
	/*catch(ArithmeticException e)           // used to handle exception.it preceded by try block  
	{
		System.out.println("division by zero is not possible");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ARRAY SIZE IS 5");
	}*/
	catch(Exception e)                // commonly we gave the catch block for entire exception(total 2 exceptions)
	{
		System.out.println("Parent Exception");
	}
	finally
	{
		System.out.println("finally block will always executed");
		
	}
	System.out.println("rest of the code");

		}
	}
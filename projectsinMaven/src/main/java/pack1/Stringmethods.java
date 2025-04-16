package pack1;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Welcome";
		System.out.println(a.length());     // find the  length of the string
		System.out.println(a.charAt(3));    // used to print the specific character from string, so we use the index value of 'c' is given in the printing statement
		int b=10;
		String c=String.valueOf(b);        // convert int data type to string
		System.out.println(c);
		String d="welcome";
		System.out.println(a.equals(d));   // compare the contents and case(upper&lower case) of two strings
		System.out.println(a.equalsIgnoreCase(d));	//compare only the contents of two strings
	    String e="";
	    System.out.println(e.isEmpty());   // used to find the string is empty or not
	    String f=a.concat(" to java");     // used to add two strings
	    System.out.println(f);
		
	}
	


	}



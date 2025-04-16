package pack;

public class Instancemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancemethod show=new  Instancemethod();        
		  show.print(30,20);
		  show.print("hello");  
		
	}
	public  void print(int a,int b)
	{                                       
	int c=a+b;
	System.out.println(c);
	}
	public  void print(String a)
	{
	System.out.println(a);
	System.out.println("maven");
	}
	

	}



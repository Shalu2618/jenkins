package abstraction;

public class Childclass extends Abstractclass {

	
	public void show()//  its an abstract method.we want to add that method as instance method because abstract method has no body .
	{
		System.out.println("child class of abstarction");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.show();
		obj.display();
	}

	
		// TODO Auto-generated method stub
		
	}



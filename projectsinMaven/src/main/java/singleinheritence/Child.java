package singleinheritence;

public class Child extends Parent {       // inherit the parent class
	public void show()
	{
		System.out.println("method of child class");
		
	}
	public static void main(String[] args) {
		
		
		Child display=new Child();
		display.show();
		display.print();              // call by using same instance object of child class
		System.out.println(display.a);  // call by using same instance object of child class
	
	}
	
	}



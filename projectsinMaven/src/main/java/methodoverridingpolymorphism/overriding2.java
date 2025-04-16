package methodoverridingpolymorphism;

public class overriding2 extends Overriding1 {
	
public void print()
{
	super.print();       
	System.out.println("method of class2");
}
public void show(String a)
{
	super.show("hello");   // calling the parent class method using super keyword   
	System.out.println(a);   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding2 obj=new overriding2();
		obj.print();
		obj.show("parameterised method of class2");
	}
	
}

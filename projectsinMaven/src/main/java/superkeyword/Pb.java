package superkeyword;

public class Pb extends Pa
{
	int b=10;                   // instance variable

	public static void main(String[] args) {
		Pb obj=new Pb();
		obj.show("hello");
		
	}
		
		// TODO Auto-generated method stub
  public void show(String a)          // instance method
{
	System.out.println(a);
	super.print();
	super.print1(10,5.5f);
	System.out.println(b);             // child class instance variable printing
	System.out.println(super.b);      // parent class instance variable printing
	 }

}

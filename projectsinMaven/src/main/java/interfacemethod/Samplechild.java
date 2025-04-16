package interfacemethod;

public class Samplechild implements Sample {

	public static void main(String[] args) {
		     Sample obj=new Samplechild();     //   interface name obj=new classname (object creation in interface)       
            obj.print();
            obj.show();
	}

	@Override
	public void print()                 // abstarct method body should be declared in the child class
	{
		
		System.out.println("implementaion of abstarct method 1");
	}

	@Override
	public void show()     //abstarct method body should be declared in the child class
	{
		System.out.println("implementaion of abstarct method 2");
		
	}

}
package superkeyword;

public class Constructor2 extends Constructor1 {
	public Constructor2()
	{
		super("world");  // parent class constructor calling
		System.out.println("Constructor of child class");
	}
    public  Constructor2(int a)
{
    	super();
    	System.out.println(a);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 obj=new Constructor2();
		Constructor2 obj1=new Constructor2(2);
		
	}

}
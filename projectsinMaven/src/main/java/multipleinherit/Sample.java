package multipleinherit;

public class Sample implements Interface1,Interface2 {
	public void print()
	{
		System.out.println("interface1");
		System.out.println(B);
	}
public void show()
{
	System.out.println("interface2");
	System.out.println(A);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.print();
		obj.show();
		
	}

}
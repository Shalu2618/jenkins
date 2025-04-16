package hierarchialinheritence;

public class Chb extends Pa {
	public void show(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chb obj=new Chb();
		obj.show(10,5);
		obj.print("Hello");
	}

}

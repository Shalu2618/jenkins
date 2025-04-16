package multilevelinheritence;

public class Child extends Intermediatory{
	public void display()
	{
		System.out.println("Multilevel inheritence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child obj=new Child();
    obj.display();
    obj.show(3, 4);
    obj.print();
	}

}
	


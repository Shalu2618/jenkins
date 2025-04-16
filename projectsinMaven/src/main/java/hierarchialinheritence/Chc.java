package hierarchialinheritence;

public class Chc extends Pa{
	public void display(int a,int b)
	{
		int c=a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Chc obj1=new Chc();
      obj1.display(10,2);
      obj1.print("welcome");
      
	}

}



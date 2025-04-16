package multilevelinheritence;

public class Intermediatory extends Parent {
	 public void show(int a,int b)
	 {
		 int c=a*b;
		 System.out.println(c);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intermediatory print1=new Intermediatory();
		print1.show(3, 4);
		print1.print();
	}

}

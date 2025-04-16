package accessspecifier;

public class Access1 {
	public void publicmethod()
	{
	System.out.println("publicmethod");
	}
	private void privatemethod()
	{
		System.out.println("privatemethod");
	}
    void defaultmethod()
   {
    	System.out.println("defaultmethod");
   }
   protected void protectedmethod()
   {
	System.out.println("protectedmethod");
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1();
		obj.publicmethod();
		obj.privatemethod();
		obj.defaultmethod();
		obj.protectedmethod();
		 
	}
}
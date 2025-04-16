package accessspecifier;

public class Access2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Access1 obj=new Access1();  //object of access1 class because we want to access the method from  one class to other class
		 obj.publicmethod();
		 obj.defaultmethod();
		 obj.protectedmethod();                             
		
	}

}

package pack1;

public class BufferBuilderMethods {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	StringBuffer a=new StringBuffer("hello");
		a.append(" world");         //to add two strings
		System.out.println(a);
		a.insert(6,"new ");         //to add string at any index position
		System.out.println(a);	
		a.replace(0, 5,"welcome to");	// used to replace a string
		System.out.println(a);	
		a.delete(11,14);               // used to delete a string
		System.out.println(a);	
	}

}

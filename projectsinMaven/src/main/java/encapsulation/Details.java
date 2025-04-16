package encapsulation;

public class Details {           //child class

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	Employee obj=new Employee();	   // local aggregation so we can access only in main method(we can create the object for parent class)
			obj.setter("salini","Testing",20000);
		    obj.getter();
	}

}

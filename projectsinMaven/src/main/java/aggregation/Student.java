package aggregation;

public class Student  {

	int rollno;
	String name,subject;
	Address add;                      //entity reference we can acccess entier  class
	public Student(int rollno,String name,String subject,Address add)
	{
		this.rollno=rollno;
		this.name=name;
		this.subject=subject;
		this.add=add;
		
	}
	private void display() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(subject);
		System.out.println(add.houseno);      // we want to add the details oof inside the address class into student class so we use this method.
		System.out.println(add.housename);
		System.out.println(add.city);
		System.out.println(add.pin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address ob=new Address(12345665,25,"villa","KK");
		Student obj=new Student(5,"salini","Maths",ob);
		obj.display();
			
	}

	
}
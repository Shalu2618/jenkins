package Aggregation1;

public class Student {

	int rollno;
	String name;
	Address add;
	public Student(int rollno,String name,Address add)
	{
	this.rollno=rollno;
	this.name=name;
	this.add=add;
	}
	public void print()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(add.pin);
		System.out.println(add.houseno);
		System.out.println(add.housename);
		System.out.println(add.city);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address obj=new Address(629161,5,"villa","kk");
		Student ob=new Student(10,"salini",obj);
		ob.print();
	}
		
}


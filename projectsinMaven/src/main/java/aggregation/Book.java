package aggregation;

public class Book {

	String bookname;
	int price;
	Author add;
	
	public Book(String bookname,int price,Author add) // constructor
	{
		this.bookname=bookname;
		this.price=price;
		this.add=add;
	}
	public void print()        // instance method
	{
		System.out.println(bookname);
		System.out.println(price);
		System.out.println(add.authorname);
		System.out.println(add.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Author obj=new Author("salini",30);     //  fisrt call author(we want to add details of class author  into class book) 
         Book ob=new Book("Novel",100,obj);
         ob.print();
	}
}
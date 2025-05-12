package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Set<String>s1=new HashSet<String>();
	s1.add("red");
	s1.add("blue");
	s1.add("green");
	System.out.println(s1);
	
	HashSet s2=new HashSet();
	s2.add("cat");
	s2.add("dog");
	s2.add("crow");
	System.out.println(s2);
	
	HashSet<Integer>s3=new HashSet<Integer>();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	System.out.println(s3);
	
	
	/*for(int i=0;i<s1.size();i++)               // array list size is mentioned in for loop
	  { 
		 System.out.println(s1.get(i));                  //used to return particular elemet at the given index 
	  }*/
	
	Iterator<String> it=s1.iterator();        // iterator is an interface
	  while(it.hasNext())
	  {
		 System.out.println(it.next()); 
	  }
		
	  it.remove();                         //remove the last element form l1
	  System.out.println(s1);
	    
		
	  s2.addAll(s3);
	  System.out.println(s2);
	  
	  s2.removeAll(s3);
	  System.out.println(s2);
	  
	  /*System.out.println(s3.contains("10"));                // used to search an element in the arraylist
		Collections.sort(s3);                                  // USED TO SORT AN ELLEMENTS IN ARRAYLIST
		System.out.println(s3);
	  */
	  
	}

}

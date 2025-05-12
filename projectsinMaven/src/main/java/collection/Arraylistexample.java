package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l1=new ArrayList();                  //arraylist syantax
l1.add("orange");                                   // items are added using add method
l1.add("apple");
l1.add("grapes");
System.out.println(l1);

ArrayList l2=new ArrayList();                      // array list creation-non generic collection(if we are not given data type)
l2.add("salini");                                  //
l2.add(30);
l2.add(168.2);
System.out.println(l2);

ArrayList<String>l3=new ArrayList();                   //generic collection
l3.add("salini");
l3.add("meenu");
l3.add("lathika");
l3.add("meenu");                                      //duplicate elements will allow
l3.add(null);
l3.add(null);                                       // one or more null values are added in list
System.out.println(l3);

System.out.println(l3.isEmpty());                      // to check list is empty or not
	
System.out.println(l3.size());                         // to find the size of list
  
l3.remove(0);                                           // give remove (int index)
System.out.println(l3);

l3.remove("meenu");                                     // give remove(object o)
System.out.println(l3);

System.out.println(l3.contains("orange"));                // used to search an element in the arraylist
	Collections.sort(l1);                                  // USED TO SORT AN ELLEMENTS IN ARRAYLIST
	System.out.println(l1);

ArrayList<Integer>l4=new ArrayList();                      // we have to use wrapper class instead primitive data type because primitive datatype wont work in arraylist.wrapper class of int is integer
  l4.add(10);
  l4.add(11);
  l4.add(12);
  System.out.println(l4);  
  
  //for loop
  for(int i=0;i<l1.size();i++)               // array list size is mentioned in for loop
  { 
	 System.out.println(l1.get(i));                  //used to return particular elemet at the given index 
  }
  // for each loop
  for(String a:l1)                        // for each loop(loop name) used only in generic collection
  {
	  System.out.println(a);
  }
  
  // add all  method 
   
  l1.addAll(l2);
  System.out.println(l1);
  
 // remove all method
  l1.removeAll(l2);
  System.out.println(l1);
  
  System.out.println(l1.get(0));    //get(0) is oth elemet
  
  System.out.println(l1.set(1,"banana"));
  System.out.println(l1);
  
  // iterator method-has next
  Iterator<String> it=l1.iterator();        // iterator is an interface
  while(it.hasNext())
  {
	 System.out.println(it.next()); 
  }
  // iterator method -remove method
  it.remove();                         //remove the last element form l1
  System.out.println(l1);
    
  
}
}

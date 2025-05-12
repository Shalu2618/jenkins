package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character>l1=new ArrayList(); 
		l1.add('A');                                   // items are added using add method
		l1.add('B');
		l1.add('C');
		System.out.println(l1);
		
		System.out.println(l1.isEmpty()); 
		l1.remove(0);  
		System.out.println(l1);
		
		ArrayList<Float>l2=new ArrayList(); 
		l2.add(1.2f);                                   // items are added using add method
		l2.add(1.3f);
		l2.add(1.4f);
		System.out.println(l2);
		
		System.out.println(l2.size());
		
		l2.remove("1.4f"); 
		System.out.println(l2);
		
		System.out.println(l2.contains('A'));
		System.out.println(l2);
		
		Collections.sort(l1);                                  // USED TO SORT AN ELLEMENTS IN ARRAYLIST
		System.out.println(l1);
}
}



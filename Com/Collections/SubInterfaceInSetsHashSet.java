package Com.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class SubInterfaceInSetsHashSet {

	public static void main(String[] args) {
		
	  Set<Object> hs=new HashSet<>();
	  hs.add("Hyma");
	  hs.add("Raj");
	  hs.add('a');
	  hs.add(12345);
	  hs.add(123);
	  hs.remove(123); //it got removed 
	  
	 Iterator<Object> itr= hs.iterator();
	  
	 while (itr.hasNext())
	 {
		
		 System.out.println(itr.next()); //unordered ...items scattered 
	 }

	}

}

package Com.CollectionsMethods;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionIterator {

	public static void main(String[] args) {
		
		//Collection is an interface
		//here "List" is an sub-interface for collection(main root)
//List emp_names=new List(); // without datatype
ArrayList<String> emp_names=new ArrayList<>(); //with datatype
//here we can use object datatype(to accept all types) as well ArrayList<object> emp_names=new ArrayList<>();

        emp_names.add("Raj");
        //to add an item .add("string value")
     	emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj");
		
		
		
		//print a "value" from the list
		System.out.println(emp_names.get(1));
		System.out.println("********************");
		
		//to print all values
		System.out.println(emp_names);
		System.out.println("********************");
		
		//iterate over a list.. "all values"
		ListIterator<String> itr=emp_names.listIterator();
		
		//to check if there is next item exist
		while(itr.hasNext())
		{
			//print the current items and move the cursor to the next item
			System.out.println(itr.next());
		}
		
	}

}

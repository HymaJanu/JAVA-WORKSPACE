package Com.CollectionsMethods;

import java.util.ArrayList;

public class CollectionInsertNewValuetoExistingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> emp_names=new ArrayList<String>();
	    emp_names.add("Raj");
 	    emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj");
		emp_names.set(0, "Testing master"); 
				
		//insert a value by overiding the existing value ??
		
		//here set(index,replace value)--1st parameter is index num =zero(0) and 2nd parameter replacing with existing value --new/insert value
		emp_names.set(0, "Testing master"); 
		
		System.out.println(emp_names);
		// o/p: Testing master should be instead of raj 
	}

}

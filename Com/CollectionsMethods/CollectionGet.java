package Com.CollectionsMethods;

import java.util.ArrayList;

public class CollectionGet {

	public static void main(String[] args) {
		
		ArrayList<String> emp_names=new ArrayList<String>();
	    emp_names.add("Raj");
 	    emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj");
		
		//Get() method
		System.out.println(emp_names.get(2)); //get() is used to retrive the value by using index
		//output is Null
		
		//finding size by using size() method and retrieving value by Get() method
		//to find size() of the list..length ....it counts num of items which are align to the class
		System.out.println(emp_names.size());
		
		//Index = length -1
		System.out.println(emp_names.size()-1); //output 3 ...last item ...index is 3
		
		//at a time to get() value as per index (length-1) 
		System.out.println(emp_names.get(emp_names.size()-1)); 
		//or
		//by using index number & get()
		System.out.println(emp_names.get(3)); //get() is used to retrive the value by using index
		//output is Raj //duplicate values are allowed.
	}

}

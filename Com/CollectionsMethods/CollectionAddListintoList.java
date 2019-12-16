package Com.CollectionsMethods;

import java.util.ArrayList;

public class CollectionAddListintoList {

	public static void main(String[] args) {
		//List 1
		ArrayList<String> emp_names=new ArrayList<String>();
	    emp_names.add("Raj");
 	    emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj"); //4 items
	
		//List 2
		ArrayList<String> companies=new ArrayList<String>(); //here we used object for all types
		companies.add("TCS"); //1 item
		
		//addALL()
	   //List 1.addAll(List 2) is used to 2 arraylist items by array class names ??
	      //NOTE: for addALL()method  both datatypes should be same ...not accepting object as well
		
		emp_names.addAll(companies);
    	
		System.out.println(emp_names.size()); //total : 5 items
		System.out.println(emp_names);

	}

}

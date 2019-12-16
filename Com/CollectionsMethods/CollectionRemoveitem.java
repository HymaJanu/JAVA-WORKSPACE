package Com.CollectionsMethods;

import java.util.ArrayList;

public class CollectionRemoveitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> emp_names=new ArrayList<>(); //here we used string
        emp_names.add("Raj");//to add an item .add("string value"
        emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj");
		
		//to Remove item from the existing list ?
		emp_names.remove(1); //remove() through index num
		// o/p: rani is removed from the existing list
		
		System.out.println(emp_names); //Remaining should be print except index num 1
		
		//here "index 1" value= rani removed  is restored by index 2 value =Null in "index 1"
		System.out.println(emp_names.get(1)); 
		

	}

	}


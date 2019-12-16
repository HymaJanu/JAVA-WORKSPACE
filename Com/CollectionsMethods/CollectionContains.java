package Com.CollectionsMethods;

import java.util.ArrayList;

public class CollectionContains {

	public static void main(String[] args) {
	
        ArrayList<String> emp_names=new ArrayList<>();
		
		emp_names.add("Prathap");
		emp_names.add("Raj");
		emp_names.add("Krish");
		emp_names.add("Prathap");
		emp_names.add("Prathap");
		
		//contains(value) is used to find value existing in the list ??
		System.out.println(emp_names.contains("Rahul")); //No..false
		System.out.println(emp_names.contains("Raj")); //yes...true
	}

}

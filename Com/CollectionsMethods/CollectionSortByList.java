package Com.CollectionsMethods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortByList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       ArrayList<String> emp_names=new ArrayList<>();
	        emp_names.add("Prathap");
			emp_names.add("Raj");
			emp_names.add("Krish");
			emp_names.add("Prathap");
			emp_names.add("Prathap");
			
			
			//sortby list 
			//here Collections.sort(classname)--- alphbetical order of class items(emp_names) are displayed
			Collections.sort(emp_names); 
			for (Object object : emp_names) //for each ..to store the sorted values
			{
				System.out.println(object);

	}

}
}

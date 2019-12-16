package Com.CollectionsMethods;

//import java.awt.List; ...for list method import ..not used
import java.util.ArrayList;

public class CollectionsAdditem {

	private static final Object Null = null;

	public static void main(String[] args) {
	
		//String datatype
		
		ArrayList<String> emp_names=new ArrayList<>(); //here we used string
        emp_names.add("Raj");
      //to add an item .add("string value")
		emp_names.add("Rani");
		emp_names.add("Null");
		emp_names.add("Raj");
		System.out.println("*******with class name*********");
		System.out.println(emp_names);
		
		System.out.println("*******with for each*********");
		
		for (Object object : emp_names) {
			System.out.println(object);
		}
		
		
		//Object datatype
		
		//List companies=new List();.....list 
		ArrayList<Object> companies=new ArrayList<>(); //here we used object for all types
		companies.add("TCS"); //String
		//to add an item .add("string value")
		companies.add(123);//numeric value
		companies.add('c');//character value
		companies.add(0);
		companies.add(Null); //accepts null value
		//System.out.println(companies);---invalid error ...so we are list converting into array list
		System.out.println("*******with class name*********");
		System.out.println(companies);
		
		
		System.out.println("*******with for each*********");
		for (Object object : companies) {
			System.out.println(object);
	}

}
}

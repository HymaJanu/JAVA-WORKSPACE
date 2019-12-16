//AddMethod without passing arguments
/*package Package;

public class AddMethod {

		public static void main(String[] args) 
		{
	    
	       addTwoNumber(); //This is method which is used to the add the values
		}	
			
		public static void addTwoNumber() {
		int a=5;
		int b=4;
		System.out.println(a+b); //we are calling ADD Method() directly without writing logic for addition or adding values 
				
	}

	}*/


//AddMethod with passing arguments
package Package;

public class AddMethod {

		public static void main(String[] args) 
		{
	    
	       addTwoNumber(23,56); //In "add method" we are passing "arugments" ..here 23,56 are arugments 
	       addTwoNumber(89,25); 
		}	
			
		public static void addTwoNumber(int a, int b) //here addTwoNumber is a "MethodName" & here inta ,intb are the "Parameters" (accepting values by method is called as parameter)
		//Both "MethodName" + "Parameters" together we called as "Signature"
		{
			// TODO Auto-generated method stub
	    System.out.println(a+b); 
		}
	
	}


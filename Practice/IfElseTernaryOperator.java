package Practice;

public class IfElseTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ternary Operator
		 /*int number=13;    
		    //Using ternary operator  
		    String output=(number%2==0)?"even number":"odd number";    
		    System.out.println(output); 
		    ************************************
		    */
		
		//Printing Even Odd upon 20 numbers without if and if else ....By using ternary Operator ?"" :""
		for(int i=1;i<=20;i++)
		{
		String out=(i/2==0)?i+": Even Number":i+": OddNumber";
		System.out.println(out);

	}
	}
}

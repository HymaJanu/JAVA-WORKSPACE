package Package;

import java.util.Scanner;

public class ScannerManualInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for integer
		Scanner sc=new Scanner(System.in);//Step 1
		System.out.println("Enter a value for A"); //pass input value through keyboard and it will be appear as in Green Color
		int a =sc.nextInt(); //Step 2 declaration of a variable 
        System.out.println(a);//output for variable "a" it will be appear as in Black color
		
		//for string
    	//Scanner sc=new Scanner(System.in);// No need to enter scanner twice within the program as we have import scanner in this program
		System.out.println("Enter a value for Name");  //pass input value through keyboard and it will be appear as in Green Color
		String name =sc.next();//Step 2 declaration of a variable 
		System.out.println(name);//output for variable "name" it will be appear as in Black color
		
		
	}

}

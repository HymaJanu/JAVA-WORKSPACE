package Package;

import java.util.Scanner;

public class OperatorsWithScannerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");  
		int a =sc.nextInt(); 
			
		if (a==1)
		{
			System.out.print("Monday");
		}
		
		else if (a==2)
		{
			System.out.println("Tuesday");
		}
		
		else if (a==3)
		{
			System.out.println("Wednesday");	
		}
		else if (a==4)
		{
			System.out.println("Thursday");	
		}
		
		else if (a==5)
		{
			System.out.println("Firday");	
		}
		
		else if (a==6)
		{
			System.out.println("saturday");	
		}
		
		else if (a==7)
		{
			System.out.println("Sunday");	
		}
	}

}

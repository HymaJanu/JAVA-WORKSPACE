package Com.Arrays;

public class arrayForEach {

	public static void main(String[] args) {
		
//Declaring of an ARRAY
		
 String[] empname = new String[5]; 
 empname[0]="Hyma"; //assigning an items to and array
 empname[1]="Raja";
 empname[2]="Rani";
 empname[3]="Ohh";
 empname[4]="Baby";
 
 //Task 1
 System.out.println(empname[4]);
 
 //Task 2
 //System.out.println(empname[0,1,2,3,4]); Error occurs====Only single index value we can print or access
 

  System.out.println("***************");
 
 //Task 3
 //To print Multiple values at a time === "For Each" loop needs to be used.
  
 for(String s : empname) //For Each loop
 {
	 System.out.println(s);
 }
	
 System.out.println("***************");
 
 //Task 4
 //To print Multiple values at a time === "For" loop by index(as length-1 ) needs to be used.
 
 for(int i=0;i<=empname.length-1;i++) //for Loop
	{
		System.out.println(empname[i]);
	}
 System.out.println("******get*********");

 //Task 4
 //To print Multiple values at a time === "For" loop by iteration needs to be used.
 
 for(int i=0;i>=0;i++) //for Loop
	{
		System.out.println(empname[i]);  
		//instead of index(as length-1 )if we use greater or equal Zero ..we will get output but it gives index out bound error 
	}
	}

}

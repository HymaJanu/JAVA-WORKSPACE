package Com.StringASCII;

import java.util.Scanner;

public class ASCIINumToPrintCharacters {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int AB=sc.nextInt();
        
    	if((int)AB<=65&&(int)AB>=90)
    	{
    		int curntvalue=(int)AB+32;
    		System.out.println((char)curntvalue);
    	}
    	else
    	{
    		
    		System.out.println((char)AB);
    	}


	}

}

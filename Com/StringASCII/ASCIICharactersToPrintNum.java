package Com.StringASCII;

import java.util.Scanner;

public class ASCIICharactersToPrintNum {

	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		//In scanner class >>for char === next().charAT(0) is used of 
		char AB = sc.next().charAt(0);
        System.out.println((int)AB);
        
	}

}

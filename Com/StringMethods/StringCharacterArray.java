package Com.StringMethods;

public class StringCharacterArray {

	public static void main(String[] args) {
    String Data="My name is Hyma";
    //Character Array Syntax: string character array like object array..is to print string to characters
    char[] arr=Data.toCharArray();
    for(char c: arr) //for each
   {
	   System.out.println(c); //print string to character
   }
    
	}

}

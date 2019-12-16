
package Com.StringMethods;

public class StringCrop {

	public static void main(String[] args) {
	
		 String Data="India is great country";
		System.out.println(Data.substring(5,21)); //to corp particular text from the string ...
		//Syntax: Substring(Starting position,Length of characters)
		 System.out.println(Data.substring(5,21)); //for cropping of a sentence from string
		 System.out.println(Data.substring(5,22)); //for cropping of a sentence from string as second parameter is "length" from 1 to 22
	     
		 //where as substring with index 22 is not accepting why ?
		 //System.out.println(Data.substring(22));//no result ===here length is 22 but sub string will takes "index" from zero 0 to 21
	}
	

}

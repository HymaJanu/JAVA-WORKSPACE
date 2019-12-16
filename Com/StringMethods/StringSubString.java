package Com.StringMethods;

public class StringSubString {

	public static void main(String[] args) {
 String Data="India is great country";
 System.out.println(Data.substring(0)); //here we need to pass index =0 ..it will print from 0(zero) to end
 System.out.println(Data.substring(6)); //here we need to pass index =6 ..it will print from 6 to end
 System.out.println(Data.length());
 System.out.println(Data.length()-1);//Index
 //difference between length & substring ?
 System.out.println(Data.substring(21));
 //System.out.println(Data.substring(22));//no result ===here length is 22 but sub string will takes "index" from zero 0 to 21
 System.out.println(Data.substring(5,21)); //for cropping of a sentence from string
 System.out.println(Data.substring(5,22)); //for cropping of a sentence from string as second parameter is "length" from 1 to 22

	}

}

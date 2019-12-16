package Com.StringMethods;

public class StringIsLowerCase {

	public static void main(String[] args) {
		
		//for string lower to upper case "conversion"
		String data="HYMA";//Upper
		System.out.println(data.toLowerCase()); //Lower
		
		//Is Character is lower or upper case ??
		Character c='H';
		System.out.println(Character.isLowerCase(c));//flase
		System.out.println(Character.isUpperCase(c));//true

	}

}
 
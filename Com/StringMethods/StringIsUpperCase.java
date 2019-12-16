package Com.StringMethods;

public class StringIsUpperCase {

	public static void main(String[] args) {
		
		//for string lower to upper case "conversion"
		String data="hyma";//lower
		System.out.println(data.toUpperCase()); //upper
		
		//Is Character is lower or upper case ??
		Character c='h';
		System.out.println(Character.isLowerCase(c));//true
		System.out.println(Character.isUpperCase(c));//flase

	}

}

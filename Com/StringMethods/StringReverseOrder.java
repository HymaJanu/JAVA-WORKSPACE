package Com.StringMethods;

public class StringReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Data="I love my country";
		String temp="";
		for(int i=Data.length()-1;i>=0;i--)
		{
					temp=temp+Data.charAt(i);
		}
		
		System.out.println(temp);
		
	}

}

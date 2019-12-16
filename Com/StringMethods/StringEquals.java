package Com.StringMethods;

public class StringEquals {

	public static void main(String[] args) {

			String sys1= new String("hyma");
			String sys2=new String("Hyma");
			
		
	System.out.println(sys1.equals(sys2));
	System.out.println(sys1.equalsIgnoreCase(sys2));
	System.out.println(sys1.contentEquals(sys2));
	}

}

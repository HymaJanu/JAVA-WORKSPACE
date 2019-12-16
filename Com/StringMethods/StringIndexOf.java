package Com.StringMethods;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String Data="The generations of our family changing";
System.out.println(Data.indexOf("The")); //Index ==== displays "the" position in the string
System.out.println(Data.indexOf("family"));
System.out.println(Data.indexOf("Family")); //case sensitive ====== for index thats the reason -1 is printing.
	}

}

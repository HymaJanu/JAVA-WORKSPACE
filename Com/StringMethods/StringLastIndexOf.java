package Com.StringMethods;

public class StringLastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Data; //String declaration
Data="The transaction generated ID is Hyma"; //String Initialization
System.out.println(Data.lastIndexOf(" "));
System.out.println(Data.length());

System.out.println(Data.lastIndexOf(" "));

System.out.println("*******************");

int xyz= Data.lastIndexOf(" ");
System.out.println(Data.substring(xyz));
	}

}

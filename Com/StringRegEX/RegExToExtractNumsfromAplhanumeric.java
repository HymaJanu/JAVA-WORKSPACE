package Com.StringRegEX;

public class RegExToExtractNumsfromAplhanumeric {

	public static void main(String[] args) {
		String data="AB65BCO852DEF741gt456/****";
data=data.replaceAll("[^0-9]","@"); //to extract numeric values here we are replacing alphabets with "@"
String[] array=data.split("@"); //now splitting them with "@" to separate numbers and @ symbols 
int temp=0;
for(String s:array) //to store string value "for each" is used..here we can use isdigit()..try once
{

System.out.println(s); //to print number from aplhanumeric is string.

if(!s.isEmpty())
{
	//here "s" is string datatype to store s value in temp which is integer datatype ..not possible
	//so we need to convert string into integer as Integer.valueOf(s)
	temp=temp+Integer.valueOf(s); //All numeric values are adding out here
}


	}
System.out.println("Adding all number: "+temp);
}
}

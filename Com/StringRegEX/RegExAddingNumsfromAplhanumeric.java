package Com.StringRegEX;

public class RegExAddingNumsfromAplhanumeric {

	public static void main(String[] args) {
		String data="AB65BCO852DEF741gt456/****";
		data=data.replaceAll("[^0-9]","@"); //to extract numeric values here we are replacing alphabets with "@"
		String[] array=data.split("@"); //now splitting them with "@" to separate numbers and @ symbols 
		int temp=0; //to store the value "temp" is created
		for(String s:array) //to store string value "for each" is used
		{
		
		if(!s.isEmpty())
		{
			//here "s" is string datatype to store s value in temp which is integer datatype ..
			//we need to string into integer as Integer.valueOf(s)
			temp=temp+Integer.valueOf(s); //All numeric values are adding out here
		}
		
		System.out.println(temp);
	}
	}

}

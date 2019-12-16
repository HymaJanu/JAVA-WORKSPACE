package Com.StringMethods;

public class StringIsDigit {

	public static void main(String[] args) {
String data="abghfj6847584nvnkdf";
String temp="";
    for(int i=0;i<=data.length()-1;i++)
    {
	//the given string is converted into characters by using charAt()
	char c=data.charAt(i); 
    //isdigit() is used to filter digits from alphanumeric like String/characters/numbers 
    if(Character.isDigit(c)) 
	{
	temp=temp+c; //numeric values are stored in "temp"
	}
}
System.out.println(temp);

		
	}

}

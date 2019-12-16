package Com.StringRegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCreditCardFormat {

	public static void main(String[] args) {
	String Data="Today my credit number genaerated is 1234-5648-4568-8965"; //
	String pattern="[0-9]{4}\\-[0-9]{4}\\-[0-9]{4}\\-[0-9]{4}";
	Pattern p=Pattern.compile(pattern);
	Matcher matcher=p.matcher(Data);
	boolean status= false;
	String result="";
	while(matcher.find())
	{
		status=true;
		result=matcher.group();
		break;
	}
	if(status)
	{
		System.out.println("Credit card num: "+result);
	}
	else
	{
		System.out.println("Match doesnot exist");
	}
	

	}

}

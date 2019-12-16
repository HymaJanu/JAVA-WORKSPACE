package Com.StringRegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEXPrintDateofBrith {

	public String getDataofBrith(String pattern,String Data){
String result="";
Pattern p=Pattern.compile(pattern);
Matcher matches =p.matcher(Data);
 boolean status= false; //if in case of false(i.e; no matches found ...else condition will executes
 
 while(matches.find())
 {
	 status=true;
	result=matches.group();
	break;
 }
 if(status) //we declare as boolean status= false;
 {
	 System.out.println("Date of Birth: "+result);
 }
 else
 {
	 System.out.println("My Date of Birth doesnot exist in a given string");
 }
	
	
	return result;
	}

}

package Com.StringRegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReusableComponenetsforEmailID {
	
	public String getpatternData(String pattern,String data)
	{
		String result="";
		Pattern p=Pattern.compile(pattern); //complier used to complie with format of a particular data in a string and stored in pattern p.
		Matcher matches=p.matcher(data); //the pattern p format matches with the data in a string ..if it is matcher occured it will stored "matches"
		boolean status =false; 
			
			while(matches.find())
			{
				status=true;
				result=matches.group();
				break;
								
			}
				if(status)
				{
					System.out.println("Data exists: "+result);
				
				
				}
				else
				{
					System.out.println("Data doesnot exist");
				}
		return result;
	}
}

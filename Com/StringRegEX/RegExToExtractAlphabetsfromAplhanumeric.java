package Com.StringRegEX;

public class RegExToExtractAlphabetsfromAplhanumeric {

	public static void main(String[] args) {
		String data="AB65BCO852DEF741gt456/****";
		data=data.replaceAll("[^A-Z]", "@");
		String temp=""; //here output is alphabets ..we given string datatype
		String[] array=data.split("@");
		
			for(String s:array)
			{
				System.out.println(s); //output for exacting alphates from alphanumeric string
				if(!s.isEmpty())
				{
					temp=temp+s; //adding all characters ....No need to convert int to string and string to integer value
					}
			}
		System.out.println(temp);
	}

}

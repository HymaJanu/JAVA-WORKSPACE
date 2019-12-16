package Com.StringMethods;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Data="                    my name is hyma        janu                ";
		System.out.println(Data);
		System.out.println(Data.length()); //before Trim length
		//Trim Method is used to remove Staring space and ending space in the current source string.
		Data=Data.trim();  //(or) call to Data1
		System.out.println(Data);
		System.out.println(Data.length()); //after trim length=
		
		
		//Questioner://
		//String Data2="************my name is hyma        janu**************"; ???
		//String Data3=Data2.trim(new Data2(*)); ? //to special remove special characters before starting and ending of a string.
		
		
	
				
	}

}

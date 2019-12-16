package Com.StringMethods;

public class StringGetPosition {

	public static void main(String[] args) {
		String Data="Thermal  plant is hot, The climate has been changed";
		int len= Data.length()-24;
		String temp="";
		int counter=0;
		
		for(int i=1;i<=len;i++)
		{
			counter++;
			char c=Data.charAt(i);
			
			if(Character.isSpaceChar(c))
			{

			System.out.println(true);	

			 if(temp.equals("The"))
			 {
				 break;
				 
			 }else
			 {
				 temp="";
			 }
			 
			 
			}
			
	  }
					
System.out.println("Counter :" + (counter-4));
	}

}


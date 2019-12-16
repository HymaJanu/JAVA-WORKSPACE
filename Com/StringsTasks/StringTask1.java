package Com.StringsTasks;

public class StringTask1 {

	public static void main(String[] args) {
		//find what are the repeated characters available on the string as well as non repeated characters
	
		String Data="i am learning java with selenium";
	    Data=Data.replace(" ", "");
		char[] arr=Data.toCharArray();
		String temp="";
				
		for(int i=0;i<=Data.length()-1;i++)
		{
			char act=arr[i];
			
			if(!temp.contains(String.valueOf(act)))
			{
			for (int j=0;j<=Data.length()-1;j++)
			{
				char exp=arr[j];

		if(String.valueOf(act).equals(String.valueOf(exp)))	
				{
		temp=temp+act;
		break;
	 }
	}

   }
 }
System.out.println(temp);
}
}
	
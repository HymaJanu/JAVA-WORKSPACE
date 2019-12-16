package Com.StringsTasks;

public class StringSplit {

	public static void main(String[] args)
	{
		String input="India is great country INDIA is having large population iNDIa is having good landscapes"; 
		String[] arr= input.split(" "); //String array is used 
		
		for(String name : arr) //for each loop used in arrays
		{
		System.out.println(name);
		}
		
	}

}

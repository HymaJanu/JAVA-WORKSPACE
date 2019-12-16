package Com.StringsTasks;

public class GetthemiidelCharacter {

	public static void main(String[] args) {
	
		String data="Raj Kumark";

		int len=data.length();
				
if(len%2!=0)
{
		
		System.out.println("Print Middle character in the given string:"+data.charAt(len/2));
	}
		else
		{
		System.out.println("Middle character Doesn't exist in the given string"); //+data.charAt(len/2-1)
}
	}

	}
	


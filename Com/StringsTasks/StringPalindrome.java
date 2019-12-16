package Com.StringsTasks;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String temp="";
		String Data="Gog";
				
		//int len = Data.length()-1 ///==== (datalength=5, 5-1 =4)

		for(int i=Data.length()-1;i>=0;i--) //here i=4;yes;second iteration --3...it excutes until 0(zero)
		{
			temp=temp+Data.charAt(i); //here temp prints 4th letter...second iteration...3rd letter...until 0index (reverse order)
		}
			
			if(Data.equalsIgnoreCase(temp))	//reverse order-----goG ..yes
			{
				
			System.out.println("Is a Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}

			}

	}



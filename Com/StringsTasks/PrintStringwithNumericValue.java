package Com.StringsTasks;

public class PrintStringwithNumericValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Data="The Transaction id :1089 @The Voucher number :852 @The Transaction id:851";
String[] Spec=Data.split(" @");
String temp=""; 

for (String s :Spec)
	 {
	 System.out.println(s); 
	String[] Spec1=s.split(" :");
		
	for (String s1 :Spec1)
	 {
		int xyz= s1.lastIndexOf(":")+1;
		String s2= s1.substring(xyz);
		System.out.println(s2);
				
		}
	 }
   for(int i=0;i<=Data.length()-1;i++)
{
	char c= Data.charAt(i);
	

	if(Character.isDigit(c))
	{
	
		temp=temp+c;
		
		}

	}

 }
	
}





//System.out.println(Data);
/*if(s.equalsIgnoeCase(" @"))
{
	temp=temp+s;
	System.out.println(temp);
*/
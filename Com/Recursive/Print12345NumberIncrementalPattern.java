package Com.Recursive;

public class Print12345NumberIncrementalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String temp = "";
		
		for (int i=1;i<=5;i++)
		{

			for (int j=1;j<=i;j++)
         {
        	temp=temp+j; 
         }
         System.out.println(temp);
         temp="";
         }
	}
}


/* AND String temp = "";

for (int i=1;i<=5;i++)
{

	for (int j=1;j<=i;j++)
 {
	temp=temp+i; ("here i" need to replace instead of "j")
 }
 System.out.println(temp);
 temp="";
 }

Result:
1
22
333
4444
55555*/
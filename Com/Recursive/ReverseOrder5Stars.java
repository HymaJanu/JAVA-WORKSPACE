package Com.Recursive;

public class ReverseOrder5Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Ptrn = "*";
        String temp = "";
		
		for (int i=5;i>=1;i--)
		{

			for (int j=1;j<=i;j++)
         {
        	temp=temp+Ptrn; 
         }
         System.out.println(temp);
         temp="";
         }
	}

}

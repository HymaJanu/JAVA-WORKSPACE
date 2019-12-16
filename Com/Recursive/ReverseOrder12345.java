package Com.Recursive;

public class ReverseOrder12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     String temp = "";
		
		for (int i=5;i>=1;i--) //here for reverse order we need to replace "i" value 1 with 5, i>= instead of i<= and i-- instead of i++
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

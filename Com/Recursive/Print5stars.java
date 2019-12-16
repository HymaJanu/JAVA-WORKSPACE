package Com.Recursive;

public class Print5stars {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ptrn="*"; //here "*" datatype we need to considered as "string".
		String temp="";
		
	for(int i=1;i<=5;i++) //itiration basic format and observation: here if we given i=0 extra space is occuring in the result 
	{
		for(int j=1;j<=i;j++) //itiration basic format
		{
			temp=temp+ptrn;  //(*+0 = *) here we are adding ptrn with temp for every itiration extra star need to be include.
		
		}
		System.out.println(temp);
		temp="";  //for clearing previously stored value (*) and to clear result executed in the for loop so that which is not impact to next itartion of for loop.
		
	}
  }
	
}
	
		
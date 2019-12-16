package Com.ExceptionHandling;

import java.awt.List;
import java.util.ArrayList;

public class UncheckedExpections {

	public static void main(String[] args) {
	
		//System.out.println(10000/0);
		
			
			ArrayList data=new ArrayList();
			
			data.add("hello");
			try{
				System.out.println(10/0);
				System.out.println(data.get(32));
				
				
			}
			
			
			catch(ArithmeticException a)
			{
				System.out.println("Due to arthematic");
			}
			catch(NullPointerException n)
			{
				
			}
			catch(IndexOutOfBoundsException i)
			{
				
			}
			
			catch(Exception e)
			{
				//write your control code
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println("OOps i got an exception");
				
				System.out.println(data.size());
			}finally{
				
				System.out.println("My Execution is completed");
				try{
				System.out.println(10/0);
				}catch(Exception o)
				{
					try
					{
						
					}catch(Exception e)
					{
						
					}
				}
			}
	}

}

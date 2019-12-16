package Com.StringsTasks;

public class InvertUpperandLower {

	public static void main(String[] args) {
		String str="CTS_tcs";
		{
		    char[] chars = str.toCharArray();
		    for (int i = 0; i < chars.length; i++)
		    {
		    
		        char c = chars[i];
		    
		        if (Character.isUpperCase(c))
		        {
		            chars[i] = Character.toLowerCase(c);
		            System.out.println(chars[i]); //
		    		        }
		        
		        else if (Character.isLowerCase(c))
		        {
		            chars[i]= Character.toUpperCase(c);
		            System.out.println(chars[i]);
		          
		         } //	 we can use ..please we need to try...   String reverse = new StringBuffer(String.tochar(i)).reverse().toString();

			    }
	
		   		}
	
	    return;	
	    

	}

}

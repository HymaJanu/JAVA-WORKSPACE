package Com.CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class printDuplicateCountByUsingHashMap {

	public static void main(String[] args) {
String data="ABCGGAAABCdsasCCCCBBVDzGGGTTHHH";	
		
		
		Map<Character,Integer> chars=new HashMap<Character,Integer>();
		
		char[] arr=data.toCharArray();
		
		for (char c : arr) {
			
			if(! chars.containsKey(c)) //contains ---characters exist or not in chars
			{
				chars.put(c, 1); //those finding characters will put in chars..map				
				//System.out.println(c);//it will print all characters without repeating
				
			}else{
				chars.put(c, chars.get(c)+1); //those repeating characters will put in chars and counting accordingly..map	
				//System.out.println(c);
				//it will print all character with repeating + count the character here based on small or captial
				
			}
			
					}
		
		System.out.println(chars); //finally both combinally print 

	}

}

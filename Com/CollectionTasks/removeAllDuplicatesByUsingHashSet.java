package Com.CollectionTasks;

import java.util.HashSet;
import java.util.Set;

public class removeAllDuplicatesByUsingHashSet {

	public static void main(String[] args) {
		
		String data="ABCGGAAABCCCCCBBrtyuVDGGGTTHHH";
		
		Set chars=new HashSet();
		
		char[] arr=data.toCharArray();//1st string convert character array
		for(char c:arr) //2nd for each
		{
	        chars.add(c); //3rd in harsh set we need add characters where logic applied through hashset
		}

		System.out.println(chars);//finally printing out values stored in hash set----single occurrance of all characters
	}

}

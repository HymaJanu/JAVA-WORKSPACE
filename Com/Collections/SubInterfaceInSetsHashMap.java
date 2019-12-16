package Com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.border.EmptyBorder;

public class SubInterfaceInSetsHashMap {

	public static void main(String[] args) {

		//Hash Map which is used to retrieve the data without duplicates
		Map<Integer, String> abcd=new HashMap<Integer, String>();
		abcd.put(1,"Hyma"); //(Index,Value)
		abcd.put(2,"Raj");
		abcd.put(3,"Ram");
		abcd.put(4,"Rani");
		abcd.put(4,"Ramya"); //duplicates values are allowing are not 
		abcd.put(0,"Null"); //null values are allowing or not
		//abcd.put(0,"0");//null values are allowing or not --output value is 0(Zer0)
		abcd.put(6,"Rani"); //overwitten value ..index 4
		abcd.put(7,"Ramya");//not overwritten value ..index 4
				
		System.out.println(abcd.get(1)); //output Hyma....it calls from index num 1
		System.out.println(abcd.get(3)); //output Ram 
		System.out.println(abcd.get(4)); //output Ramya ----Duplicates index are allowed but it took recent value 
		System.out.println(abcd.get(6));//output Rani ----Duplicates Values are allowed with overwritten duplicate value
		System.out.println(abcd.get(7));///output Ramya ----Duplicates values are allowed without overwritten duplicate value
		System.out.println(abcd.get(0)); //output Null----Here index is 0(Zero) ..so it printed Null text
		System.out.println(abcd.get(5)); //output null....here index 5 is not passed actually 
		
		
		System.out.println("**************for Loop(Entry set)***************");
		//Entry is used to print multiple value at a time based up on "key".
		for (Entry<Integer,String>data:abcd.entrySet())
		{
			System.out.println(data.getKey()); //Index ...ordered manner printed
			System.out.println(data.getValue());//values are printed based upon index keys
			
		}
		
		System.out.println("**************conatins by Key************");
		
				//contains is used to find out if given "key" or "index" is existing in the mapedlist
	System.out.println(abcd.containsKey(1));//key...true
	System.out.println(abcd.containsKey(5));//key..false
	
	System.out.println("**************conatins by Value********");
			//contains is used to find out if given "value" is existing in the mapedlist
		
			System.out.println(abcd.containsValue("Hyma"));//value..true
			System.out.println(abcd.containsValue("Meena"));//value ..flase
			
	}
	
	}
	

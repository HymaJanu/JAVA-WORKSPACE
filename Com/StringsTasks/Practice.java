package Com.StringsTasks;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Data="The Transaction id :1089 @The Voucher number :852 @The Transaction id:851";
		String[] Spec=Data.split(" @");
		int count=0;
		String temp="";
		 /*for (String s :Spec)
		 {
			
			 System.out.println(s); 
			 
			 //System.out.println(s.substring(xyz));
			 
		 }*/
		 for(int i=0;i<=Data.length()-1;i++)
		{
			char c= Data.charAt(i);
		
	   for (String s :Spec)
			 {
				
				 System.out.println(s); 
				 int xyz = Data.lastIndexOf(s)+1;
				 
				 System.out.println(s.substring(xyz));
				 
	

			if(Character.isDigit(xyz)) 
			{
				temp=temp+xyz;
												}
			
			}
		 		 System.out.println(temp);

		 
		}
	}

}



/*		 		 for(int xyz=0;xyz<=Data.lastIndexOf(s);i++)
		 		 {
		 		int xyz = Data.lastIndexOf(s)+1;
		 		 }
		 		System.out.println(s.substring(xyz));*/

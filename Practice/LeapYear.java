package Practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	for(int i= 2020;i<=2040;i++)
	{
		
	if(((i % 4 ==0) && (i % 100 !=0))) //(year % 400==0)
	{
		System.out.println(i+": Is a LeapYear");
	}
	else
	{
		System.out.println(i+": Not a LeapYear");
	}
	
	}
	}

}

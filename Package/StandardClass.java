package Package;

public class StandardClass {
	final int a = 10;
	final float b = 2.23f;
	String Name = "Hyma"; //{Instance or non static variables}
	char c = 'a'; 

	static String Username = "king";
    static String  Password = "first"; //{static variables}
		
	public void add() //{Instance Method --1 }
	{
		System.out.println(Name);
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		System.out.println(b+a);
	}
    
	public void sat() //{Instance Method---2}
	{
		System.out.println(Password);
		System.out.println(Name);
	}
	public static void sub() //{Static Method --1}
	{
		System.out.println(Password);
	
	}
	public static void lin() //{Static Method --2}
	{
		System.out.println(Username);
		
	}
}

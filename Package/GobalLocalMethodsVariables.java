package Package;

public class GobalLocalMethodsVariables {
static int a =2;
static int b =12;

public static void add()
{
	System.out.println(a+b);
	}
	
public void Mul()
{
	System.out.println(a*b);
}

public int sub()
{
	System.out.println(a);
	return a;
}

	public static void main(String[] args) 
	{
		GobalLocalMethodsVariables obj = new GobalLocalMethodsVariables();
		obj.Mul();
    add();
    obj.sub();
     	
    }
    
    
	}



package Com.StringMethods;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Data1="My is name is hyma";
		String Data2="My is name is hyma";
		String Data3="My is name is januyuyuy";
		String Data4="My is name is hymm";
		//Compare To Method is used to compare the data between two strings ..return type is int
		System.out.println(Data1.compareTo(Data2)); //str1=str2==0
		System.out.println(Data1.compareTo(Data1)); //str1=str2==0
		System.out.println(Data3.compareTo(Data1)); //str1>str2==+(+ve)
		System.out.println(Data1.compareTo(Data4)); //str1<str2==-(-ve)================position is different (-12)??
		System.out.println(Data1.compareTo(Data3));//str1<str2==-(-ve)================ on which based -ve position Is displaying ??

	}

}

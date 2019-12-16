package Com.StringsTasks;

public class StringTaskParenthesisPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String id="The Transaction id (1089) is sucessfully generated";

int len= id.length()-1;
System.out.println(len);
System.out.println(id.substring(0,49));
System.out.println("position of(:"+id.indexOf("("));
System.out.println("position of):"+id.indexOf(")"));
System.out.println("Print integers:" +id.substring(20,24));


	}

}

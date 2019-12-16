package Com.StringRegEX;

public class MainPrintGetDatabirthPattern {

	public static void main(String[] args) {
		String Data= "My Date of brith is 14-Feb-1994";
String pattern="[0-9]*\\-[A-Za-z]*\\-[0-9]*";
RegEXPrintDateofBrith dofb=new RegEXPrintDateofBrith();
dofb.getDataofBrith(pattern, Data);
	}

}

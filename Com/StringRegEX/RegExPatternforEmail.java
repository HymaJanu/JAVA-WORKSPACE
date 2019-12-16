package Com.StringRegEX;

public class RegExPatternforEmail {

	public static void main(String[] args) {
		String data="My email id is abc.xyz1@tcs.com fhgjfjhjhgjgf abcgfg.xyz1123gh@tcs.comdfg";
		String pattern="[a-z0-9]*\\.[a-z0-9]*\\@[a-z]*\\.[a-z]*";
		ReusableComponenetsforEmailID rc=new ReusableComponenetsforEmailID();
		rc.getpatternData(pattern,data);
	
	}

}

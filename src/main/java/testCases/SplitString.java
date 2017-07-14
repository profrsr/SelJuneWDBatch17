package testCases;

import org.junit.Test;

public class SplitString {
	
	@Test
	public void sample(){
		String txt = "sarath (1000)";
		
		String[] x = txt.split("(");
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		String y = x[1].replace("(", "");
		
		System.out.println(y);
		
		System.out.println(y.replace(")", ""));
	}

}

package learnString;

import org.testng.annotations.Test;

public class PrintReverString {

	/*@Test
	public void sample(){

		String txt = "Gopinath";		
		char[] x = txt.toCharArray();

		int charTotal = x.length;
		System.out.println(charTotal);

		for (int i = charTotal-1; i >=0 ; i--) {
			System.out.println(x[i]);
		}		
	}
	 */


	/*@Test
	public void nextSample(){
		String txt = "Gopinath";		
		for(int i=txt.length()-1; i>=0; i-- ){
			System.out.print(txt.charAt(i));
		}
	}*/

	
	
	
	
	
	
	
	@Test
	public void nextSample(){
		String txt = "ABCD";		
		for (int i = 0; i < txt.length()-1; i++) {
			char x = txt.charAt(i);
			int afterNumber = (int)x+1;
			System.out.print((char)afterNumber);
		}
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void Occurance(){
		String txt = "Gopinatha";
		int occ=0;
		char[] x = txt.toCharArray();	
		for (char c : x) {
			if(c=='a'){
				occ++;
			}
		}
		System.out.println(occ);

	}*/



}

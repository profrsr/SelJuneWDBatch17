package string;

public class ReverseStringCharacters {
	
	public static void main(String[] args) {
		
		/*
		 * 
		*/
		// String class in java do not have reverse() method , 
		// StringBuilder class does have built in reverse() method.
	
		// Solution 1:
		
		// Convert String to character array :{{toCharArray()}}
		// Loop from the end to beginning by a character :{{for iterator}}
		// Print the character :{{print}}
		String companyName = "Infosys";
		char[] charComp = companyName.toCharArray();
		for(int i=companyName.length()-1; i>=0; i-- ){
			System.out.print(charComp[i]);
		}
		
		System.out.println(); // Using charAt
		for(int i=companyName.length()-1; i>=0; i-- ){
			System.out.print(companyName.charAt(i));
		}
		
		System.out.println(); // Using split
		String[] comp = companyName.split("");
		for (int i = comp.length-1; i >= 0; i--) {
			System.out.print(comp[i]);
		}
	
		
		
		
		
		
		
		// Solution 2: Built in

		// StringBuilder class do not have toCharArray() method , 
		// while String class does have toCharArray() method.
		System.out.println();
		StringBuilder strBuil = new StringBuilder(companyName);
		System.out.println(strBuil.reverse());
		
		
		
		
		
		
		
		
		
	}

}

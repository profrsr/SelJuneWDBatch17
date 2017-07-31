package string;

public class FindOccurences {
	
	public static void main(String[] args) {
		
		String check = "Cognizant";
		char chr = 'n';
		
		// Solution 1
		
		// Find the length of the String :{{length}}
		// Move to each character item :{{charAt[i]}}
		// Check if it has the expected character, if yes -> count ++
		int occuranceOfN = 0;
		char[] charArray = check.toCharArray();
		for (char c : charArray) {
			// don't use equals here
			if(c==chr){
				occuranceOfN ++;
			}
		}		
		
		System.out.println("Occurance of n is :" +occuranceOfN);
		
		
		// // Solution 2 - other equivalent way
		int occurance = 0;
		for (int i=0; i<check.length(); i ++) {
			// don't use equals here
			if(check.charAt(i)==chr){
				occurance ++;
			}
		}		
		
		System.out.println("Occurance of n is :" +occurance);
		
		
		
		// Solution 3 {One liner}

		// Split using character :{{split("c")}}
		// Get the array size :{{length-1}}

		
		// Anything else??
		
		if(check.endsWith(""+chr)){
			System.out.println("Occurance of n is :" +check.split(""+chr).length);
		}else{
			System.out.println("Occurance of n is :" +(check.split(""+chr).length-1));
		}
		
		
		
		// Solution 4:  How about replaceAll??
		// count before replace - count after replace??		
		System.out.println("Occurance of n is :" + (check.length()-check.replace(""+chr,"").length()));
		
		


	}

}

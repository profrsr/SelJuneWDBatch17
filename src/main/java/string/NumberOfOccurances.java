package string;

public class NumberOfOccurances {

	public static void main(String[] args) {

		String company = "Cognizant";
		char chr = 'n';

		//	Solution 1

		//Step1: Convert the given String to Character - toCharArray
		//Step2: loop through each Character - foreach
		//Step3: Compare each Character with the expected Character - if, ==
		//Step4: if matches add the count

		char[] comp = company.toCharArray();
		int count = 0;
		for (char c : comp) {
			if(c==chr){
				count++;
			}			
		}
		System.out.println(count);	

	//Solution 2:		
		int len = company.length();
		count = 0;
		for (int i = 0; i < len; i++) {
			if(company.charAt(i)==chr){
				count++;
			}
		}
		System.out.println(count);	
	}






}

























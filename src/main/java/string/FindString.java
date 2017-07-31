package string;

public class FindString {
	
	public static void main(String[] args) {
		
		String data = " InfoSys ";
		
		System.out.println(data.length());
		
		System.out.println(data.charAt(data.length()-2));
		
		System.out.println(data.concat(" India "));
		
		System.out.println(data.substring(4));
		
		System.out.println(data.trim());
		
		System.out.println(data.toLowerCase());
		
		String compName = " Amazon India Dev center ";
		String[] words = compName.split(" ");
		System.out.println(words.length);
		
		for (String eachWord : words) {
			System.out.println(eachWord);
		}
		
		System.out.println(compName.indexOf("e"));
		System.out.println(compName.lastIndexOf("e"));
		
		char[] x = compName.toCharArray();
		for (char c : x) {
		System.out.println(c);	
		}
		
		
		if(compName.contains("Amazon")){
			System.out.println("I wish to Attend Interview");
		}
		
		System.out.println(compName.replace(" ", ""));
		
		String leadId = "HCL (12345)";
		System.out.println(leadId.replaceAll("[^0-9]", ""));
	}
	

}

































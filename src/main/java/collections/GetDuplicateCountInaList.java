package collections;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicateCountInaList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();

		// Add mentors to the set -- Note the order
		mentors.add("Babu");
		mentors.add("Gopi");
		mentors.add("Nesa");
		mentors.add("Raheed");
		mentors.add("Karim");
		mentors.add("Babu");
		mentors.add("Sethu");
		
		String checkDuplicates = "Babu";
		int i=0;
		for (String mentor : mentors) {
			
			if(mentor.equals(checkDuplicates)){
				i++;
			}
		}
		System.out.println(i);
	}

}

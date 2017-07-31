package collections;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.NoSuchElementException;

public class GetCountOfEachCharacter {

	public static void main(String[] args) {
		
	//	NoSuchElementException

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String

		// 1, Convert the string to the character array >> toCharArray()
		// 2, Create a map with Key as Character and Value as Integer >> LinkedHashMap<Character, Integer>();
		// 3, Loop through each character (use foreach) from character array
		// 4, If the character is already in map key >> containsKey
		//	  then increment the count with 1
		// 5, If not add to the map >> put(k,1)

		String company = "INDIA";		
		
		// 1, Convert the string to the character array >> toCharArray()
		char[] allChars= company.toCharArray();
		
		// 2, Create a map with Key as Character and Value as Integer >> LinkedHashMap<Character, Integer>();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		// 3, Loop through each character (use foreach) from character array
		for (char chr : allChars) {
			// 4, If the character is already in map key >> containsKey
			if(map.containsKey(chr)){
				// then increment the count with 1
				// get the key' value
				int val = map.get(chr)+1;
				
				// put them back into map
				map.put(chr, val);
			} // 5, If not add to the map >> put(k,1)
			else{
				map.put(chr, 1);
			}
		}
		
		System.out.println(map);

		
	}
}



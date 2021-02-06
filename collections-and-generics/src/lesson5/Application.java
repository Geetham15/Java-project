package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		//HashMap<String, String> dictionary = new HashMap<String, String>(); //contains key and value
		//LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>(); 
		TreeMap<String, String> dictionary = new TreeMap<String, String>();  //TreMap - Natural order
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
		dictionary.put("Brilliant", "clever or talented");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		dictionary.put("Brilliant", "xxxxxxxxxxxxxxx");
		/**
		// Iterate through key
		for(String word : dictionary.keySet()) {
			System.out.println(dictionary.get(word));
			System.out.println(word);
		}
		
		// Iterate through value
		for(String word : dictionary.values()) {
			System.out.println(dictionary.get(word));
			System.out.println(word);
		}
		**/
		
		//Iterate both key and value 
		for(Map.Entry<String, String> entry :dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}
}

package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		//HashSet<Integer> values = new HashSet<Integer>();
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Random");
		values.add("Animal");
		values.add("People");
		values.add("Zoo");
		values.add("Random");
		values.add("Random");
		
		//Set is used to prevent duplicates. useful for unique values		
		//order is not maintained
		
		//LinkedHashSet maintains insertion order and prevent duplicates
		for(String value : values) {
			System.out.println(value);
		}
	}
}

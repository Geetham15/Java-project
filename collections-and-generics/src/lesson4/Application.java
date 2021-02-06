package lesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		/**
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Random");
		hashSet.add("Tooth Brush");
		hashSet.add("Computer");
		hashSet.add("Cloths");
		hashSet.add("Apples");
		hashSet.add("America");
		
		
		ArrayList<String> myList = new ArrayList<String>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		**/
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike",3600, "Accounting"));
		hashSet.add(new Employee("paul",3000, "Admin"));
		hashSet.add(new Employee("peter",2500, "IT"));
		hashSet.add(new Employee("Angel",1600, "Maintenance"));
		
		
		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList); // sort based on salary which is implemented in compareTo() in Employee
		
		System.out.println(myList);
		
	}
}

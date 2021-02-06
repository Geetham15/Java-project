package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
	
		/**
		Container<Integer, String> container = new Container<>(12,"Hello");
		int val1 = container.getItem1();
		String val2 =container.getItem2();
		System.out.println(val1);
		System.out.println(val2);
		**/
		Container<Double, Integer> container2 = new Container<>(12.00,300);
		
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("whatever");
		
		Set<String> mySet2 = new HashSet<>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("computer");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
			System.out.println(var);
		}
	}

	//Set do not store duplicates
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}

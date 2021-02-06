package lesson1;
import java.util.ArrayList;
import java.util.LinkedList;

public class LearnArrayAndLinkedList {

	public static void main(String[] args) {
	
		ArrayList words = new ArrayList();
		words.add("Hello");
		words.add("There");
		words.add(10);
		words.add(9);
		words.add(12.00);
		words.add('G');
		
		
		System.out.println(words.get(0));
		
		Object item1 = words.get(0);
		String item2 = (String) words.get(1);
		int item3 = (int) words.get(2);
		int item4 = (int) words.get(3);
		System.out.println(item1 + " " + item2);
		System.out.println(item3 + " " + item4);
		System.out.println(item3 + item4);
		
		
		ArrayList<String> text = new ArrayList<String>();
		text.add("hello");
		text.add("Geetha");
		text.add("Good Morning");
		
		String text1 = text.get(0);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>(); // user only Wrapper classes like Integer, Float 
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.remove(3);
		numbers.remove(); //remove first occurence
		numbers.removeFirst(); // remove and removeFirst are the same
		System.out.println("Linked List below");
		for(int num : numbers) {
			System.out.println(num);
		}
	}

}

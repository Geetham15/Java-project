package streams.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		//Print 1 to 9 
		IntStream.range(1,10).forEach((x)->System.out.print(x));
		System.out.println();
		
		//Integer Steam with skip 
		//skip 5 elements of the stream
		IntStream.range(1,10).skip(5).forEach((x)->System.out.print(x));
		System.out.println();
		
		//Integer Steam with sum
		int val = IntStream.range(1,5).sum();
		System.out.println(val);
		
		//Stream of sorted and findFirst
		Stream.of("Hello", "bottle", "Africa").sorted().findFirst().ifPresent((x)->System.out.println(x));
		
		//Stream from Array, sort, filter and print
		String[] items= {"car","computer","toothpaste","box","pencil","tent","door","toy"};
		Stream.of(items).filter((x)->x.startsWith("t")).sorted().forEach(x->System.out.print(x + ","));
		System.out.println();
		
		//Average of squares of an int array
		Arrays.stream(new int[] {2,4,6,8,10}).map((x) -> x*x).average().ifPresent(n -> System.out.print(n));
		System.out.println();
		
		//Stream from a list, filter and print
		List<String> listOfItems = Arrays.asList("Computer","Toothpaste","Box","Pencil","Car","Tent","Door");
		listOfItems.stream().map((x) -> x.toLowerCase()).filter(x -> x.startsWith("c"))
					.sorted().forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		
	}

}

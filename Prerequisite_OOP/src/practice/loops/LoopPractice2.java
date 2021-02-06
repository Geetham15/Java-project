package practice.loops;

public class LoopPractice2 {
	
	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in "
				+ " the category:apperal and the slightly " 
				+ "more in demand category:makeup along with the category:furniture and .... " ;
		
		printCategories(str);
	}

	/*
	 * extract all categories from the string argument
	 */
	public static void printCategories(String string) {
		int i = 0;
		while(true) {
			int found = string.indexOf("category:", i);
			if (found == -1) {
				break;
			}
			int start = found + 9; // start of the actual category
			int end = string.indexOf(" ", start);
			
			System.out.println(string.substring(start, end));
			i = end +1;
		}
		
	}
	
}

//Output

//apperal
//makeup
//furniture

package practice.loops;

public class LoopPractice3 {

	public static void main(String[] args) {

		/*
		 * String name = "asdfghjkert";
		 * 
		 * //print forward for(int i = 0; i < name.length(); i++) {
		 * System.out.println("char: " + name.charAt(i)); }
		 * 
		 * //print in reverse for(int i= name.length()-1; i>=0; i--) {
		 * System.out.println("char: " + name.charAt(i)); }
		 */

		// print even number from 0-100 inclusive

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
}

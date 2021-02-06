package practice.loops;

public class LoopPractice4 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i=0;i<=10;i=i+1) {
			for(int j = 0; j < 10; j++) {
			System.out.println("i = " + i + " j = " + j);
			counter++;
			}
		}
		System.out.println("counter = " + counter);
	}
}

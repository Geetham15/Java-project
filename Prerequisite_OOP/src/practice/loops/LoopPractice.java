package practice.loops;

public class LoopPractice {

	public static void main(String[] args) {
		
		int count = 1;
		while(count<=10) {
			System.out.println("Geetha " + count);
			//count++;
			count = count + 1;
			
			if(count ==5)
				break;
		}
	}
}

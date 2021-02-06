package practice.strings;

public class StringPractice {

	public static void main(String[] args) {
		//length
		String a = "Hello";
		System.out.println("String length = " + a.length());
		
		//substring
		String str = "ABCDEFG";
		System.out.println(str.substring(1)); // BCDEFG
		System.out.println(str.substring(1, 3)); //BC
		
		String s1 = "hello";
		String s2 = "there";
		
		if(s1 == "hello")
		{
			//THIS IS A TRAP.DON'T DO THIS
		}
		
		if(!s1.equals("hello")) {
			//USE THIS
		}
		
		if(s2.equalsIgnoreCase("there")) {
			System.out.println("Printed there");
		}
		
		System.out.println(s1.charAt(4));
		//System.out.println(s1.charAt(10)); //StringIndexOutofBoundException
		
		String text = "Hello there yogi there";
		//int x = text.indexOf("there"); //6
		int x = text.indexOf("there", 0);
		int y = text.lastIndexOf("yogi");
		System.out.println(x );
		System.out.println(y);
	}
}

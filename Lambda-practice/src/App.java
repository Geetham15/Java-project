
public class App {

	public static void main(String[] args) {
		
		//Polymorphism
		
		Human tom = new Human();
		walker(tom);
		
		Robot wale = new Robot();
		walker(wale);
		
		//java 7
		/**
		walker(new Walkable() {

			@Override
			public void walk() {
				System.out.println("Custom object walking.... ");
				
			}});
		**/
		System.out.println();
		//java 8 using lambda
		walker(() -> System.out.println("Custom object walking.... "));
		
		ALambdaInterface aBlockOfCode = ()-> {
			System.out.println("Custom object walking.... ");
			System.out.println("the object tripped... ");
		};
		
		Walkable bBlockOfCode = ()-> {
			System.out.println("Custom object walking.... ");
			System.out.println("the object tripped... ");
		};

		walker(bBlockOfCode);
		
		ALambdaInterface helloVar = () -> System.out.println("Hello there .... ");
		
		//Add two numbers
		Calculate sumVar = (a, b) -> a + b;
		helloVar.someMethod();
		System.out.println(sumVar.compute(4, 6));
		
		//Divide
		Calculate nonZeroDivide = (a,b) -> {
			if(a==0) {
				return 0;
			}
			return a/b;
		};
		System.out.println(nonZeroDivide.compute(5, 5));
		
		//String reversal
		MyGenericInterface<String> reverser = (s) -> {
		//StringWorker reverser = (s) -> {
			String result ="";
			for(int i= s.length()-1;i>=0;i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("Geetha Muniswamy"));
		
		
		
		//Factorial
		MyGenericInterface<Integer> fact = (num) ->{
		//MathWorker fact = (num) ->{
			int result = 1;
			for(int i =1; i<=num;i++) {
				result *=i;
			}
			return result;
		};
		//System.out.println(fact.factorial(10));
		System.out.println(fact.work(10));
	}
	
	public void sayHello() {
		System.out.println("hello there...");
	}

	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int nonZeroDivide(int arg1, int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public String reverse(String str) {
		String result ="";
		for(int i= str.length()-1;i>=0;i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public int fact(int num) {
		int result = 1;
		for(int i =1; i<=num;i++) {
			result *=i;
		}
		return result;
	}
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
}

interface Calculate{
	public int compute(int a, int b);
}

interface StringWorker{
	public String work(String str);
}

interface MathWorker{
	public int factorial(int num);
}

interface MyGenericInterface<T>{
	public T work(T t);
}
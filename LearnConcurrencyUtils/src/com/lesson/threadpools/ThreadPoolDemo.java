package com.lesson.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); //recycle threads

		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		executor.shutdown(); //Rejects any new tasks from being submitted. Gracefully shuts down the service
		//executor.shutdownNow(); //Terminate the executor service immediately..
		
		/**
		while(!executor.isTerminated()) {
			// the below printline will print at the end of the program
		}**/
        
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS); // waits 20 seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Submitted all tasks.....");
	}

}

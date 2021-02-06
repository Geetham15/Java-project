package com.lesson.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
	
		//ArrayBlockingQueue - wait() and notify() is taken care
		Thread t1 = new Thread(new Producer(questionQueue));
		
		Thread t2 = new Thread(new Consumer(questionQueue));
		t1.start();
		t2.start();
	}

}

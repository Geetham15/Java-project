package com.lesson.threading;

public class Sequence {

	private int value = 0;

	/**
	public int getNext() {
		synchronized (this) { // can be useful for multithreading
			value++;
			return value;
		}
	}
	**/
	public synchronized int getNext() {	 // method synchronized
		
			value++;
			return value;

	}
}

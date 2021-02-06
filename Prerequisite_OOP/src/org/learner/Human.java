package org.learner;

public class Human {

	int age;
	String name;
	int heightInInches;
	String eyeColor;
	
	public Human(int age, String name, int heightInInches, String eyeColor) {
		super();
		this.age = age;
		this.name = name;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void eat() {
		System.out.println("eating...");
	}
	
	public void speak() {
		System.out.println("Speaking....");
		System.out.println("My name is " + age);
		System.out.println("My height is " + heightInInches);
		System.out.println("My eyecolor is " + eyeColor);
	}
	public void walk() {
		System.out.println("Walking...");
    }
}

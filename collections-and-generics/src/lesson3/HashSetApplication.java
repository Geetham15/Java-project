package lesson3;

import java.util.HashSet;

public class HashSetApplication {
	public static void main(String[] args) {

		//HashSet goes with hashCode for uniqueness
		//Integer and String the HashSet find the uniquess
		//For userdefined object , we need to override equals() and hashCode() method in the class Ex: Animal
		
		HashSet<Animal> animals = new HashSet<Animal>();
		Animal animal1 = new Animal("Dog", 18);
		Animal animal2 = new Animal("Cat", 2);
		Animal animal3 = new Animal("Cow", 10);
		Animal animal4 = new Animal("Horse", 12);
		Animal animal5 = new Animal("Pig", 5);
		Animal animal6 = new Animal("Dog", 18);

		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);

		System.out.println(animal1.equals(animal6));
		
		System.out.println("Animal1 : " +animal1.hashCode());
		System.out.println("Animal6 : " +animal6.hashCode());

		for (Animal value : animals) {
			System.out.println(value);
		}

	}
}

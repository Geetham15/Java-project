package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		//ArrayList<String> animals = new ArrayList<String>();
		List<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("cat");
		animals.add("Dog");
		animals.add("Bird");
		animals.add("Tiger");
		/**
		System.out.println("foreach loop");
		for(String str : animals) {
			System.out.println(str);
		}

		System.out.println("for loop");
		for(int i=0; i<animals.size();i++) {
			System.out.println(animals.get(i));
		}
		
		**/
		
		//LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota","RAV4",12000,false);
		vehicles.add(new Vehicle("Honda", "Accord",25000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep","Wrangler",35000,true));
		
		System.out.println("for loop");
		System.out.println("--------");
		for(int i=0; i<vehicles.size();i++) {
			System.out.println(vehicles.get(i).toString());
		}
		
		System.out.println("foreach loop");
		System.out.println("------------");
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
			System.out.println(vehicle.getMake());
			System.out.println(vehicle.getModel());
			System.out.println(vehicle.getPrice());
			System.out.println(vehicle.isFourWDrive());
		}
		
		printElements(vehicles);
		printElements(animals);
	}

	public static void printElements(List someList) {
		System.out.println("PrintElements List");
		System.out.println("------------------");
		for(int i=0; i<someList.size();i++) {
			System.out.println(someList.get(i));
		}
	}
}

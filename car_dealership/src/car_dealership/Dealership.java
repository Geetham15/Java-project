package car_dealership;

public class Dealership {

	//Write a program to simulate a car dealership sales process. We will have employees,
	//working selling vehicles to customers
	
	public static void main(String[] args) {
		
		//Customer cust1 = new Customer("XYZ","Calgary",12000);
		Customer cust1 = new Customer();
		cust1.setName("XYZ");
		cust1.setAddress("Calgary");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord",15000);
		
		/*Vehicle vehicle = new Vehicle();
		vehicle.setModel("Accord");
		vehicle.setMake("Honda");
		vehicle.setPrice(15000);*/
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		cust1.toString();
		
		/*
		 * 
		 * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
		 * if(finance==true)
		 * 		runCreditHistory(Customer cust, double Amount)
		 * else if (vehicle.getPrice() <= cust.getCashOnHand())
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * else
		 * 		tell customer to bring more money
		 * 
		 * 
		 */

	}

}

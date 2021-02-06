package client;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		ArrayList<HRManager> hrmanager = new ArrayList<>();
		hrmanager.add(new HRManager());
//		employees = accountants;
		
		//Raw type
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		
		ArrayList<? extends Employee> employees3 = new ArrayList<>(); //upper bound Employee and the child
		ArrayList<Employee> accountants3 = new ArrayList<>();
		employees3 = accountants3;
		
		ArrayList<? super Employee> employees4 = new ArrayList<>(); // lower bound - Employee or a parent
		ArrayList<Object> accountants4 = new ArrayList<>();
		employees4 = accountants4;
		
		makeEmployeeWork(hrmanager);
	}

	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		
		for(HRManager emp : (ArrayList<HRManager>) employees) { //downcast to HRManager
			emp.work();
		}
	}
}

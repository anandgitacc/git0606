package org.employee;
//           class
public class EmployeeDetails { 
	// {} - Block or body of the class
	
	// private -> access specifier or access limit
	// void    -> return type of given method
	// empName -> method name
	// ()      -> arguments place/ input or parameter place
	// {}      -> block or body of the method
	
	//           method1
	private void empName() {
		// business logics
		System.out.println("Employee name: Anand");
	}
	//            method2
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	//                main method
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		
	}
	

}

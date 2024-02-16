package inheri;

import org.testing.ClientDetails;

public class EmployeeDetails {
	
	public void empId() {
		System.out.println("Emp Id: 333");
	}
	public void empName() {
		System.out.println("Emp Name: Selvam");
	}

	public static void main(String[] args) {
		
		EmployeeDetails one = new EmployeeDetails();
		
		one.empId();
		one.empName();
		
		CompanyDetails Two =  new CompanyDetails();
		
		Two.companyName();
		Two.CompanyLocation();
		
		ClientDetails Three = new ClientDetails();
		
		Three.clientId();
		Three.clientName();
	}

}

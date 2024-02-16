package org.Polymorphism;

public class Overloding {
	
	public void employee() {
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("================");
	}
	public void employee(int age) {
		System.out.println("Employee Age:" + age); 
	}
	public void employee(String name) {
		System.out.println("Employee Name:" + name);
	}
	public void employee(String city,char letter) {
		System.out.println("Employee City:"+ city);
		System.out.println("Employee letter:" + letter);
	}
	public void employee(String address,char gender, String num) {
		System.out.println("Employee Address:"+ address);
		System.out.println("Employee Gender:" + gender);
		System.out.println("Employee num:" + num);
	}
	public void employee(float average,long regNo) {
		System.out.println("Employee average:"+ average);
		System.out.println("Employee regNo:" + regNo);
	}
	public void employee(long accNo,float salary) {
		System.out.println("Employee Account No:"+ accNo);
		System.out.println("Employee Salary:" + salary);
	}
	public static void main(String[] args) {
		
		Overloding A=new Overloding();
		
		A.employee();
		A.employee(12);
		A.employee("Pandi");
		A.employee("Chennai",'A');
		A.employee("No.2,abc street,Porur", 'M', "33");
		A.employee(88.568f,123456789l);
		A.employee(2154654654564l,45000.858f);
		
	}

}

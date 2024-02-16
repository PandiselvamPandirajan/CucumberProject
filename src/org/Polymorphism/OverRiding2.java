package org.Polymorphism;

public class OverRiding2 extends OverRiding1 {
	@Override
	public void Saving() {
		System.out.println("Saving-10%");	
	}
	public void Deposit() {
		System.out.println("Deposit-8%");
		
	}
	public static void main(String[] args) {
	
		OverRiding2 A = new OverRiding2();
		
		A.fixed();
		A.Saving();
		A.Deposit();
	}

}

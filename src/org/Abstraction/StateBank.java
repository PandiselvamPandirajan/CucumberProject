package org.Abstraction;

public class StateBank implements IndianBank {
	// Fully Abstraction
	public void deposit() {
		System.out.println("Deposit-5%");
	}
	public void fixed() {
		System.out.println("Fixed-8%");
	}
	public void saving() {
		System.out.println("Savings-10%");
	}

	public static void main(String[] args) {
		StateBank B = new StateBank();
		B.deposit();
		B.fixed();
		B.saving();
	}

}

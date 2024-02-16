package org.Abstraction;

public class LoginUsingEmail extends FacebookLogin {

	@Override
	public void loginFuntionality() {
		System.out.println("Login Using Email...");
	}
	public void getEmail() {
		System.out.println("Email Id: greens@gmail.com");
	}
	
	public static void main(String[] args) {
		
		LoginUsingEmail A = new LoginUsingEmail();
		A.login();
		A.loginFuntionality();
		A.getEmail(); 
	}

}

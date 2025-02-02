package day1;

import java.util.Scanner;



public class Login {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password");
		int password = s.nextInt();
		                                                                                                                                                                            
		if(password==123) {
			System.out.println("Login Succesful");
		}
		else {
			try {
				throw new InvalidPasswordException ("Kindly enter the valid password");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}



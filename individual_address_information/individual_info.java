package individual_address_information;

import java.util.Scanner;

public class individual_info {
	
	public static void main(String[] args) {
		// Create Scanner object to accept user inputs
		Scanner scnr = new Scanner(System.in);
		
		//Get user first name and Print on display
		System.out.println("What's your First Name?");
		String firstName = scnr.nextLine();
		
		
		//Get user last name and Print on display
		System.out.println("What's your Last Name?");
		String lastName = scnr.nextLine();
		
		
		//Get user Address and Print on display
		System.out.println("What's your Street Address?");
		String address = scnr.nextLine();
		
		
		//Get user Address city and Print on display
		System.out.println("What's your Address City?");
		String city = scnr.nextLine();
		
		
		//Get user Zip Code and Print on display
		System.out.println("What's your Zip Code?");
		String zipCode = scnr.nextLine();
		
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Street Address: " + address);
		System.out.println("City: " + city);
		System.out.println("Zip Code: " + zipCode);
		
	}
	

}

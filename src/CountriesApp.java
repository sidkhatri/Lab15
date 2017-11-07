/*
 * Alexander Cyr, Siddique Khatri, Tim Johnson
 * Grand Circus
 * Lab 15 -- List of Countries
 * 11/7/17
 */


import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		
		
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println();
	while (userChoice != 3) 
	{
		//Begin by showing a menu with three options
		displayMenu();
		userChoice = Validator.getInt(scan, "Enter a menu number: ",1, 3);
		performUserChoice(scan, userChoice);
	}	
	System.out.println("Goodbye!");	
		
	}

	/*
	 * 	//If the user chooses option 1, display a list of countries that are in a file
		//if the user chooses option 2, prompt user to enter country and then add (append) 
		//option 3 is a goodbye message
	 */
	private static void performUserChoice(Scanner scan, int userChoice) {
		
		switch(userChoice) {
		case 1: CountriesTextFile.readFromFile("countries.txt");
		break;
		case 2: 
			String country = Validator.getString(scan, "Enter country:  ");
			CountriesTextFile.writeToFile("countries.txt",  country);
		break;
		case 3: 
		break;
		default: 
		break;	
		}
	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("1. See the list of countries.");
		System.out.println("2. Add a country.");
		System.out.println("3. Exit ");
	}
	
}

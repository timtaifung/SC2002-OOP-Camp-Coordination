package Menu;

import java.util.Scanner;


public class CommonView {

	private static final Scanner sc = new Scanner(System.in);
	
	private CommonView() {}

	/**
	 * Prompts the user to press the "Enter" key to continue with the application.
	 */
	public static void pressEnterToContinue() {
		System.out.println("Enter key to continue!");
		sc.nextLine();
	}

}
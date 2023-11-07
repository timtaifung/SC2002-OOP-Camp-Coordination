package Menu;

import Camp.CampHelper;
import Roles.User;

import java.util.Scanner;

public class StudentMenu {
    public static void menu(User currentUser) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Student Menu");
        System.out.println("Choose your options:");
        System.out.println("1. View All Camps");
        System.out.println("2. View All Available Camps");
        System.out.println("3. View My Camps");
        System.out.println("4. Logout");
        System.out.println("Please enter your choice: ");
        int x = sc.nextInt();
        switch (x) {
            case 1 -> CampHelper.showAllVisibleCamp(););
            case 2 -> System.out.println("View Enquiries");
            case 3 -> System.out.println("View Suggestions");
            case 4 -> System.out.println("Logout");
            default -> System.out.println("Invalid input!");
        }
    }
}

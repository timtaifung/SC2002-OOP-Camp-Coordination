package Menu.StudentMenu;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void menu(Student currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList) {
        int x = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Student Menu");
            System.out.println("------ Personal Detail ------");
            System.out.println("1. Change password");
            System.out.println("-----------------------------\n");
            System.out.println("----------- Camps -----------");
            System.out.println("2. View All Camps");
            System.out.println("3. View All Available Camps");
            System.out.println("4. Register Camp");
            System.out.println("5. View My Registered Camps");
            System.out.println("6. Inspect Individual Camp");
            System.out.println("7. Logout");
            System.out.println("-----------------------------\n");
            System.out.println("Please enter your choice: ");
            System.out.println("Please enter your choice: ");
            x = sc.nextInt();

            if (x == 7) {
                System.out.println("------------------------");
                System.out.println("Successfully logged out!");
                System.out.println("------------------------\n");
                break;
            }

            // Use a factory method to create the appropriate option based on user input
            StudentMenuOption option = createOption(x);
            if (option != null) {
                option.execute(currentUser, enquiryList, suggestionList, campCommitteeList, campList);
            } else {
                System.out.println("Invalid input!");
            }

        } while (x != 7);
    }

    // Factory method to create the appropriate menu option based on user input
    private static StudentMenuOption createOption(int choice) {
        switch (choice) {
            case 1:
                return new Menu.ChangePasswordOption();
            case 2:
                return new ViewAllCampsOption();
            case 3:
                return new Menu.ViewAvailableCampsOption();
            case 4:
                return new RegisterCampOption();
            case 5:
                return new ViewRegisteredCampsOption();
            case 6:
                return new InspectCampOption();
            case 7:
                break;
            default:
                return null;
        }
        return null;
    }
}

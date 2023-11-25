package Menu.StaffCampMenus;

import Assets.Camp.Camp;
import Assets.Camp.CampManager;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.QnA.Suggestion.Suggestion;
import Assets.QnA.Suggestion.SuggestionManager;
import Assets.QnA.Suggestion.SuggestionViewer;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;
import Assets.Login.ChangePassword;
import Assets.Tools.CampReport;
import Assets.Tools.PerformanceReport;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffCampMenu {
    private static final Scanner sc = new Scanner(System.in);

    private static void displayStaffCampMenu() {
        // ... (unchanged menu display code)
    }

    public static void menu(User currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList) {
        int choice1, choice2;

        ArrayList<StaffMenuOption> options = new ArrayList<>();
        options.add(new ChangePasswordOption());
        options.add(new ViewAllCampsOption());
        options.add(new ViewMyCreatedCampsOption());
        options.add(new CreateCampOption());


        do {
            System.out.println("Staff Menu:");
            System.out.println("------ Personal Detail ------");
            System.out.println("1. Change password");
            System.out.println("-----------------------------\n");

            displayStaffCampMenu();

            choice1 = sc.nextInt();
            if (choice1 == 10) {
                return;
            }

            if (choice1 >= 1 && choice1 <= options.size()) {
                options.get(choice1 - 1).execute(currentUser, enquiryList, suggestionList, campCommitteeList, campList);
            } else {
                System.out.println("------------------------------------");
                System.out.println("Invalid choice! Please choose again!");
                System.out.println("------------------------------------\n");
            }
        } while (choice1 != 10);
    }
}

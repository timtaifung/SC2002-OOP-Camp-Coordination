package Menu.StaffCampMenus;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffCampMenu {
    private static final Scanner sc = new Scanner(System.in);

    private static void displayStaffCampMenu() {
    }

    public static void menu(User currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList) {
        int choice1, choice2;

        ArrayList<StaffMenuOption> options = new ArrayList<>();
        options.add(new ChangePasswordOption());
        options.add(new ViewAllCampsOption());
        options.add(new ViewMyCreatedCampsOption());
        options.add(new CreateCampOption());
        options.add(new EditDeleteCampOption());
        options.add(new ViewReplyEnquiriesOption());
        options.add(new ViewReplySuggestionsOption());
        options.add(new GenerateReportsOption());
        options.add(new PerformanceReportsOption());




        do {
            System.out.println("Staff Menu:");
            System.out.println("------ Personal Detail ------");
            System.out.println("1. Change password");
            System.out.println("-----------------------------\n");
            System.out.println("----------- Camps -----------");
            System.out.println("2. View all Camps");
            System.out.println("3. View own Camps");
            System.out.println("4. Create new Camp");
            System.out.println("5. Edit/Delete camp");
            System.out.println("-----------------------------\n");
            System.out.println("------------ QnA ------------");
            System.out.println("6. View/Reply Enquiries");
            System.out.println("7. View/Approve Suggestions");
            System.out.println("-----------------------------\n");
            System.out.println("---------- Reports ----------");
            System.out.println("8. Generate reports");
            System.out.println("9. Performance reports");
            System.out.println("10. Logout");
            System.out.println("-----------------------------\n");
            System.out.println("Please enter your choice: ");
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

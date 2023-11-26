package Menu.StaffCampMenus;
import Assets.Camp.Camp;
import Assets.Camp.Tools.CampDeletor;
import Assets.Camp.Tools.CampEditor;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EditDeleteCampOption implements StaffMenuOption {
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        int choice2;

        do {
            System.out.println("-------------------");
            System.out.println("1. Edit Camp");
            System.out.println("2. Delete Camp");
            System.out.println("3. Back to homepage");
            System.out.println("-------------------\n");

            choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Staff -> Edit Camp");
                    CampEditor.editCamp(campList, currentUser);
                    break;
                case 2:
                    System.out.println("Staff -> Delete Camp");
                    CampDeletor.delCamp(campList, currentUser);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid choice! Please choose again!");
                    System.out.println("------------------------------------\n");
                    break;
            }
        } while (choice2 != 3);
    }
}

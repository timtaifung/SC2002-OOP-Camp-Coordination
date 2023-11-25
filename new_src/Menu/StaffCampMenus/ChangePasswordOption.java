package Menu.StaffCampMenus;

import Assets.Login.ChangePassword;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;
import Menu.StaffCampMenus.StaffMenuOption;

import java.util.ArrayList;
import java.util.Scanner;


public class ChangePasswordOption implements StaffMenuOption {
    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Assets.Camp.Camp> campList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Staff -> Change Password");
        System.out.println("Input new Password: ");
        System.out.println("------------------------\n");
        sc.nextLine();
        ChangePassword.changePassword(currentUser);
    }
}

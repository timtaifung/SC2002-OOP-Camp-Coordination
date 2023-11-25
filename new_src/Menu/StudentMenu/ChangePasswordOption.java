package Menu;

import Assets.Camp.Camp;
import Assets.Login.ChangePassword;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Menu.StudentMenu.StudentMenuOption;

import java.util.ArrayList;

public class ChangePasswordOption implements StudentMenuOption {
    @Override
    public void execute(Student currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        System.out.println("--------------------------");
        System.out.println("Student -> Change Password");
        System.out.println("Input new Password: ");
        System.out.println("--------------------------\n");
        ChangePassword.changePassword(currentUser);
    }
}

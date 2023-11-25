package Menu;

import Assets.Camp.Camp;
import Assets.Camp.CampViewer;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Menu.StudentMenu.StudentMenuOption;

import java.util.ArrayList;

public class ViewAvailableCampsOption implements StudentMenuOption {
    @Override
    public void execute(Student currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        CampViewer.showAvailableCamp(campList, currentUser);
    }
}

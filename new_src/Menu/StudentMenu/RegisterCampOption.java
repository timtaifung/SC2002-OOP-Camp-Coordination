package Menu.StudentMenu;

import Assets.Camp.Camp;
import Assets.Camp.Tools.RegisterCamp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public class RegisterCampOption implements StudentMenuOption {
    @Override
    public void execute(Student currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        RegisterCamp.registerCamp(campList, currentUser);
    }
}


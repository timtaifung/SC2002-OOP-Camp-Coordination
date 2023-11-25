package Menu.StaffCampMenus;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;

public interface StaffMenuOption {
    void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList);
}

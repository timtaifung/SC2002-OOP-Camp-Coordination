package Menu.StaffCampMenus;

import Assets.Camp.CampViewer;
import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;

public class ViewMyCreatedCampsOption implements StaffMenuOption {
    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        System.out.println("Staff -> View My Created Camp");
        CampViewer.viewMyCreatedCamps(campList, currentUser);
    }
}

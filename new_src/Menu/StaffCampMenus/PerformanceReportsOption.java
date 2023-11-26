package Menu.StaffCampMenus;

import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Tools.PerformanceReport;
import Assets.Roles.CampCommittee;
import Assets.Camp.Camp;
import Assets.Roles.User;

import java.util.ArrayList;

public class PerformanceReportsOption implements StaffMenuOption {
    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        System.out.println("Staff -> Performance reports");
        PerformanceReport.generateList(campCommitteeList, campList);
    }
}

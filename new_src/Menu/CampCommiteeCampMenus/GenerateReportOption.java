package Menu.CampCommiteeCampMenus;

import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Tools.CampReport;
import Assets.Camp.Camp;
import Menu.CampCommiteeCampMenus.CampMenuOption;

import java.util.ArrayList;

public class GenerateReportOption implements CampMenuOption {
    @Override
    public void execute(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<Camp> campList) {
        System.out.println("Camp Commitee -> Student reports");
        CampReport.generateList(campList);
    }
}

package Menu.CampCommiteeCampMenus;

import Assets.Camp.Camp;
import Assets.Camp.Tools.CampDetails;
import Assets.Roles.CampCommittee;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;

import java.util.ArrayList;

public class ViewCampDetailsOption implements CampMenuOption {
    @Override
    public void execute(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<Camp> campList) {
        System.out.println("-----------------");
        System.out.println("View Camp Details");
        System.out.println("-----------------\n");
        CampDetails.campDetail(currentCamp);
    }
}

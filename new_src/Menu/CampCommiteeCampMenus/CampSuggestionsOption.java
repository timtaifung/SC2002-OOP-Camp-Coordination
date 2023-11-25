package Menu;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.SuggestionManager;
import Assets.QnA.Suggestion.SuggestionViewer;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Menu.CampCommiteeCampMenus.CampMenuOption;

import java.util.ArrayList;
import java.util.Scanner;

public class CampSuggestionsOption implements CampMenuOption {
    @Override
    public void execute(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<Camp> campList) {
        // Implement Camp Suggestions logic here...
    }
}

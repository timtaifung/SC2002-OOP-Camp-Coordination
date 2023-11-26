package Menu.StaffCampMenus;

import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.QnA.Suggestion.Tools.SuggestionApprover;
import Assets.QnA.Suggestion.Tools.SuggestionViewer;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewReplySuggestionsOption implements StaffMenuOption {
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Assets.Camp.Camp> campList) {
        System.out.println("Staff -> View/Reply Suggestions");
        if (!SuggestionViewer.getAllSuggestion(suggestionList)) {
            System.out.println("No suggestions found!");
            return;
        }
        SuggestionViewer.getAllSuggestion(suggestionList);
        System.out.println("--------------------------------------");
        System.out.println("Select a suggestion to approve/reject:");
        System.out.println("--------------------------------------\n");
        int sChoice = sc.nextInt();
        Suggestion currentSuggestion = suggestionList.get(sChoice - 1);
        SuggestionApprover.approveSuggestion(currentSuggestion);
    }
}

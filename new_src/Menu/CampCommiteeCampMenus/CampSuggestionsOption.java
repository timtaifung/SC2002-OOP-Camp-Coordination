package Menu.CampCommiteeCampMenus;

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
        Scanner sc = new Scanner(System.in);
        int t = 0;
        do
        {
            System.out.println("Camp Suggestions");
            System.out.println("----- Camp Suggestions -----");
            System.out.println("1. View My Camp Suggestions");
            System.out.println("2. Create Camp Suggestions");
            System.out.println("3. Edit Camp Suggestions");
            System.out.println("4. Delete Camp Suggestions");
            System.out.println("5. Back to Camp Menu");
            System.out.println("----------------------------\n");
            t = sc.nextInt();
            switch (t)
            {
                case 1:
                {
                    System.out.println("------------------------");
                    System.out.println("View My Camp Suggestions");
                    System.out.println("------------------------\n");
                    SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                    break;
                }

                case 2:
                {
                    System.out.println("-----------------------");
                    System.out.println("Create Camp Suggestions");
                    System.out.println("-----------------------\n");
                    SuggestionManager.newSuggestion(suggestionList, currentCampCommittee, currentCampCommittee);
                    System.out.println("-------------------------");
                    System.out.println("Camp Suggestions created!");
                    System.out.println("-------------------------\n");
                    currentCampCommittee.setpoint();
                    break;
                }

                case 3:
                {
                    System.out.println("---------------------");
                    System.out.println("Edit Camp Suggestions");
                    System.out.println("---------------------\n");
                    SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                    System.out.println("Please enter your choice: ");
                    Integer suggestionIndex = sc.nextInt();
                    Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                    SuggestionManager.editSuggestion(currentSuggestion, currentCampCommittee);
                    break;
                }

                case 4:
                {
                    System.out.println("-----------------------");
                    System.out.println("Delete Camp Suggestions");
                    System.out.println("-----------------------\n");
                    SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                    System.out.println("Please enter your choice: ");
                    Integer suggestionIndex = sc.nextInt();
                    Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                    SuggestionManager.deleteSuggestion(currentSuggestion, suggestionList);
                    break;
                }

                case 5:
                {
                    System.out.println("----");
                    System.out.println("Exit");
                    System.out.println("----\n");
                    break;
                }

                default:
                {
                    System.out.println("--------------");
                    System.out.println("Invalid input!");
                    System.out.println("--------------\n");
                    break;
                }
            }
        }
        while (t != 5);
    }
}

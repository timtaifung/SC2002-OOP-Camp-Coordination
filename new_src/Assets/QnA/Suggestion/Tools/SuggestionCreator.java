package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class SuggestionCreator {
    public static void newSuggestion(ArrayList<Suggestion> suggestionList, User currentUser, CampCommittee currentCampCommittee) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Enter your suggestion title:");
        System.out.println("----------------------------\n");
        String title = sc.nextLine();

        System.out.println("------------------------------");
        System.out.println("Enter your suggestion content:");
        System.out.println("------------------------------\n");
        String content = sc.nextLine();

        Suggestion newSuggestion = new Suggestion(currentUser);
        newSuggestion.setTitle(title);
        newSuggestion.setContent(content);
        suggestionList.add(newSuggestion);

        currentCampCommittee.addSuggestion(newSuggestion);

        System.out.println("---------------------");
        System.out.println("Suggestion submitted!");
        System.out.println("---------------------\n");
    }

}

package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;

import java.util.ArrayList;

public class SuggestionDeletor {
    public static void deleteSuggestion(Suggestion currentSuggestion, ArrayList<Suggestion> suggestionList)
    {
        if(currentSuggestion.getCheckedStatus()){
            System.out.println("------------------------------------------------");
            System.out.println("Suggestion has been processed and cannot be deleted!");
            System.out.println("------------------------------------------------\n");
            return;
        }
        suggestionList.remove(currentSuggestion);
        System.out.println("-------------------");
        System.out.println("Suggestion deleted!");
        System.out.println("-------------------\n");
    }
}

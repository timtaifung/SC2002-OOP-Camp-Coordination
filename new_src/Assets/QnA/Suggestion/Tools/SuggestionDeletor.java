package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;

import java.util.ArrayList;

public class SuggestionDeletor {
    public static void deleteSuggestion(Suggestion currentSuggestion, ArrayList<Suggestion> suggestionList)
    {
        suggestionList.remove(currentSuggestion);
        System.out.println("-------------------");
        System.out.println("Suggestion deleted!");
        System.out.println("-------------------\n");
    }
}

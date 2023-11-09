package Assets.QnA.Suggestion;
import Assets.Roles.User;

import java.util.ArrayList;

public class SuggestionViewer extends Suggestion
{
    public SuggestionViewer(User currentUser) 
    {
        super(currentUser);
    }

    public static void getAllSuggestion(ArrayList<Suggestion> suggestionList)
    {
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            System.out.println(i + ". " + currentSuggestion.getTitle());
        }
    }

    public static void viewMySuggestion(ArrayList<Suggestion> suggestionList, User currentUser)
    {
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if(currentSuggestion.getCreatedBy().equals(currentUser))
            {
                System.out.println(i + ". " + currentSuggestion.getTitle());
            }
        }
    }

    public static void viewAllSuggestion(ArrayList<Suggestion> suggestionList)
    {
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            System.out.println(i + ". " + currentSuggestion.getTitle());
        }
    }

    public static void viewAllPendingSuggestion(ArrayList<Suggestion> suggestionList)
    {
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if(!currentSuggestion.getApprovedStatus())
            {
                System.out.println(i + ". " + currentSuggestion.getTitle());
            }
        }
    }

    public static void viewAllApprovedSuggestion(ArrayList<Suggestion> suggestionList)
    {
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if(currentSuggestion.getApprovedStatus())
            {
                System.out.println(i + ". " + currentSuggestion.getTitle());
            }
        }
    }
}
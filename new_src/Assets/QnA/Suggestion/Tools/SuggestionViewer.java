package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.User;

import java.util.ArrayList;

public class SuggestionViewer extends Suggestion
{
    public SuggestionViewer(User currentUser) 
    {
        super(currentUser);
    }

    public static Boolean getAllSuggestion(ArrayList<Suggestion> suggestionList) {
        if (suggestionList.isEmpty()) 
        {
            System.out.println("-----------------------------------");
            System.out.println("There are no suggestions currently!");
            System.out.println("-----------------------------------\n");
            return false;
        }
        Integer i = 1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            System.out.println("-----------------------------------");
            System.out.println(i + ". " + currentSuggestion.getTitle());
            System.out.println("-----------------------------------\n");
        }
        return true;
    }

    public static void viewMySuggestion(ArrayList<Suggestion> suggestionList, User currentUser) 
    {
        Integer i = 1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if (currentSuggestion.getCreatedBy().equals(currentUser)) 
            {
                System.out.println("-----------------------------------");
                System.out.println(i + ". " + currentSuggestion.getTitle() + " " + currentSuggestion.getCheckedStatus());
                System.out.println("-----------------------------------\n");
                i++;
            }
        }
    }

    public static void viewAllSuggestion(ArrayList<Suggestion> suggestionList) 
    {
        Integer i = 1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            System.out.println("-----------------------------------");
            System.out.println(i + ". " + currentSuggestion.getTitle());
            System.out.println("-----------------------------------\n");
            i++;
        }
    }

    public static void viewAllPendingSuggestion(ArrayList<Suggestion> suggestionList) {
        Integer i = 1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if (!currentSuggestion.getApprovedStatus()) 
            {
                System.out.println("-----------------------------------");
                System.out.println(i + ". " + currentSuggestion.getTitle());
                System.out.println("-----------------------------------\n");
                i++;
            }
        }
    }

    public static void viewAllApprovedSuggestion(ArrayList<Suggestion> suggestionList) 
    {
        Integer i = 1;
        for (Suggestion currentSuggestion : suggestionList) 
        {
            if (currentSuggestion.getApprovedStatus()) 
            {
                System.out.println("-----------------------------------");
                System.out.println(i + ". " + currentSuggestion.getTitle());
                System.out.println("-----------------------------------\n");
                i++;
            }
        }
    }
}
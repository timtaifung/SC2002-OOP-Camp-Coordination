package Assets.QnA.Suggestion;

import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class SuggestionManager extends Suggestion {
    public SuggestionManager(User currentUser) {
        super(currentUser);
    }

    public static void approveSuggestion(Suggestion currentSuggestion) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Suggestion content:");
        System.out.println(currentSuggestion.getContent());
        System.out.println("-------------------");

        System.out.println("---------");
        System.out.println("1. Accept");
        System.out.println("2. Reject");
        System.out.println("---------\n");
        Integer y = sc.nextInt();

        if (y == 1) {
            currentSuggestion.setApprovedStatus(true);
            System.out.println("--------------------");
            System.out.println("Suggestion approved!");
            System.out.println("--------------------\n");
        } else if (y == 2) {
            currentSuggestion.setApprovedStatus(false);
            System.out.println("--------------------");
            System.out.println("Suggestion rejected!");
            System.out.println("--------------------\n");
        } else {
            System.out.println("--------------");
            System.out.println("Invalid input!");
            System.out.println("--------------\n");
        }
    }

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

    public static void editSuggestion(Suggestion currentSuggestion, User currentUser) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("1. Edit suggestion title");
        System.out.println("2. Edit suggestion content");
        System.out.println("3. Exit");
        System.out.println("--------------------------\n");

        Integer x = sc.nextInt();
        switch (x) 
        {
            case 1: 
            {
                System.out.println("----------------------------");
                System.out.println("Enter your suggestion title:");
                System.out.println("----------------------------\n");
                sc.nextLine();
                String title = sc.nextLine();
                currentSuggestion.setTitle(title);
                break;
            }

            case 2: 
            {
                System.out.println("------------------------------");
                System.out.println("Enter your suggestion content:");
                System.out.println("------------------------------\n");
                sc.nextLine();
                String content = sc.nextLine();
                currentSuggestion.setContent(content);
                break;
            }

            case 3:
                System.out.println("----------");
                System.out.println("Exiting...");
                System.out.println("----------\n");
                break;

            default:
                System.out.println("--------------");
                System.out.println("Invalid input!");
                System.out.println("--------------\n");
                break;
        }
    }

    public static void deleteSuggestion(Suggestion currentSuggestion, ArrayList<Suggestion> suggestionList) 
    {
        suggestionList.remove(currentSuggestion);
        System.out.println("-------------------");
        System.out.println("Suggestion deleted!");
        System.out.println("-------------------\n");
    }
}
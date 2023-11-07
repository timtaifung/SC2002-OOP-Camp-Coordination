package QnA.Suggestions;
import java.util.ArrayList;
import java.util.Scanner;
import Roles.CampCommitee;
import Roles.User;


public class SuggestionHelper extends Suggestion{
    public SuggestionHelper(User currentUser) {
        super(currentUser);
    }

    public static void approveSuggestion(Suggestion currentSuggestion){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Accept 2.Reject");
        Integer y = sc.nextInt();
        if (y==1){
            currentSuggestion.setApprovedStatus(true);
            System.out.println("Suggestion approved!");
        }
        else if (y==2){
            currentSuggestion.setApprovedStatus(false);
            System.out.println("Suggestion rejected!");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
    public static void getAllSuggestion(ArrayList<Suggestion> suggestionList){
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) {
            System.out.println(i+". "+currentSuggestion.getTitle());
        }
    }

    public static void newSuggestion(ArrayList<Suggestion> suggestionList, User currentUser, CampCommitee currentCampCommitee){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your suggestion title:");
        String title = sc.nextLine();
        System.out.println("Enter your suggestion content:");
        String content = sc.nextLine();
        Suggestion newSuggestion = new Suggestion(currentUser);
        newSuggestion.setTitle(title);
        newSuggestion.setContent(content);
        suggestionList.add(newSuggestion);
        System.out.println("Suggestion submitted!");
    }

    public static void viewMySuggestion(ArrayList<Suggestion> suggestionList, User currentUser){
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) {
            if(currentSuggestion.getCreatedBy().equals(currentUser)){
                System.out.println(i+". "+currentSuggestion.getTitle());
            }
        }
    }

    public static void editSuggestion(Suggestion currentSuggestion, User currentUser){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Edit suggestion title");
        System.out.println("2. Edit suggestion content");
        System.out.println("3. Exit");
        Integer x = sc.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("Enter your suggestion title:");
                String title = sc.nextLine();
                currentSuggestion.setTitle(title);
            }
            case 2 -> {
                System.out.println("Enter your suggestion content:");
                String content = sc.nextLine();
                currentSuggestion.setContent(content);
            }
            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid input!");
        }
    }

    public static void deleteSuggestion(Suggestion currentSuggestion, ArrayList<Suggestion> suggestionList){
        suggestionList.remove(currentSuggestion);
        System.out.println("Suggestion deleted!");
    }

    public static void viewAllSuggestion(ArrayList<Suggestion> suggestionList){
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) {
            System.out.println(i+". "+currentSuggestion.getTitle());
        }
    }

    public static void viewAllPendingSuggestion(ArrayList<Suggestion> suggestionList){
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) {
            if(!currentSuggestion.getApprovedStatus()){
                System.out.println(i+". "+currentSuggestion.getTitle());
            }
        }
    }

    public static void viewAllApprovedSuggestion(ArrayList<Suggestion> suggestionList){
        Integer i=1;
        for (Suggestion currentSuggestion : suggestionList) {
            if(currentSuggestion.getApprovedStatus()){
                System.out.println(i+". "+currentSuggestion.getTitle());
            }
        }
    }
}
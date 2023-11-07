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
}
package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;

import java.util.Scanner;

public class SuggestionApprover {
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
}

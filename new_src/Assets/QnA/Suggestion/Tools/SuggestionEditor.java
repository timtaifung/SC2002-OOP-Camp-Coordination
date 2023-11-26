package Assets.QnA.Suggestion.Tools;

import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.User;

import java.util.Scanner;

public class SuggestionEditor {
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

}

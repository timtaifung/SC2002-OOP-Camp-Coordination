package Menu.CampCommiteeCampMenus;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Menu.CampCommiteeCampMenus.CampMenuOption;
import Menu.CampEnquiryOption;
import Menu.CampSuggestionsOption;
import Menu.GenerateReportOption;
import Menu.ViewCampDetailsOption;

import java.util.ArrayList;
import java.util.Scanner;

public class CampCommiteeCampMenu {
    public static void menu(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<Camp> campList) {
        ArrayList<CampMenuOption> options = new ArrayList<>();
        options.add(new ViewCampDetailsOption());
        options.add(new CampEnquiryOption());
        options.add(new CampSuggestionsOption());
        options.add(new GenerateReportOption());

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Main Menu -> Camp Committee " + currentCamp.getName() + " Camp Menu");
            System.out.println("--------------------");
            System.out.println("1. View Camp Details");
            System.out.println("2. Camp Enquiry");
            System.out.println("3. Camp Suggestion");
            System.out.println("4. Generate Report");
            System.out.println("5. Back to Main Menu");
            System.out.println("--------------------\n");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= options.size()) {
                options.get(choice - 1).execute(currentCamp, currentCampCommittee, enquiryList, suggestionList, campList);
            } else if (choice != 5) {
                System.out.println("Invalid input!");
            }

        } while (choice != 5);
    }
}

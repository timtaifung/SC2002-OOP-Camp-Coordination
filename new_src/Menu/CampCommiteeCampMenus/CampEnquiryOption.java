package Menu.CampCommiteeCampMenus;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Menu.CampCommiteeCampMenus.CampMenuOption;

import java.util.ArrayList;
import java.util.Scanner;

public class CampEnquiryOption implements CampMenuOption {
    @Override
    public void execute(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<Camp> campList) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        do {
            System.out.println("Camp Enquiry");
            System.out.println("----- Camp Enquiry -----");
            System.out.println("1. View All Camp Enquiry");
            System.out.println("2. Answer Camp Enquiry");
            System.out.println("3. Back to Camp Menu");
            System.out.println("------------------------\n");
            y = sc.nextInt();
            switch (y)
            {
                case 1:
                {
                    System.out.println("---------------------");
                    System.out.println("View All Camp Enquiry");
                    System.out.println("---------------------\n");
                    EnquiryViewer.getAllEnquiry(enquiryList);
                    break;
                }

                case 2:
                {
                    System.out.println("-------------------");
                    System.out.println("Answer Camp Enquiry");
                    System.out.println("-------------------\n");
                    EnquiryViewer.getAllEnquiry(enquiryList);
                    System.out.println("Please enter your choice: ");
                    Integer enquiryIndex = sc.nextInt();
                    Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                    EnquiryManager.replyEnquiry(currentEnquiry);
                    currentCampCommittee.addToEnquiryAnswered(currentEnquiry);
                    currentCampCommittee.setpoint();
                    break;
                }

                case 3:
                {
                    System.out.println("----");
                    System.out.println("Exit");
                    System.out.println("----\n");
                    break;
                }

                default:
                {
                    System.out.println("--------------");
                    System.out.println("Invalid input!");
                    System.out.println("--------------\n");
                    break;
                }
            }
        }
        while (y != 3);
    }

}

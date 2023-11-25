package Menu;

import Assets.Camp.Camp;
import Assets.Camp.CampManager;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.QnA.Suggestion.Suggestion;
import Assets.QnA.Suggestion.SuggestionManager;
import Assets.QnA.Suggestion.SuggestionViewer;
import Assets.Roles.CampCommittee;

import java.util.ArrayList;
import java.util.Scanner;

public class CampCommiteeCampMenu {
    //similar to camp menu but with additional features for camp commitee like suggestion reply
    public static void menu(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList) {
        int x = 0;
        do 
        {
            System.out.println("Main Menu -> Camp Committee" + currentCamp.getName() + " Camp Menu");
            System.out.println("--------------------");
            System.out.println("1. View Camp Details");
            System.out.println("2. Camp Enquiry");
            System.out.println("3. Camp Suggestion");
            System.out.println("4. Back to Main Menu");
            System.out.println("--------------------\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) 
            {
                case 1: 
                {
                    System.out.println("-----------------");
                    System.out.println("View Camp Details");
                    System.out.println("-----------------\n");
                    CampManager.campDetail(currentCamp);
                    break;
                }

                case 2: 
                {
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
                    break;
                }

                case 3: 
                {
                    int t = 0;
                    do 
                    {
                        System.out.println("Camp Suggestions");
                        System.out.println("----- Camp Suggestions -----");
                        System.out.println("1. View My Camp Suggestions");
                        System.out.println("2. Create Camp Suggestions");
                        System.out.println("3. Edit Camp Suggestions");
                        System.out.println("4. Delete Camp Suggestions");
                        System.out.println("5. Back to Camp Menu");
                        System.out.println("----------------------------\n");
                        t = sc.nextInt();
                        switch (t) 
                        {
                            case 1: 
                            {
                                System.out.println("------------------------");
                                System.out.println("View My Camp Suggestions");
                                System.out.println("------------------------\n");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                break;
                            }

                            case 2: 
                            {
                                System.out.println("-----------------------");
                                System.out.println("Create Camp Suggestions");
                                System.out.println("-----------------------\n");
                                SuggestionManager.newSuggestion(suggestionList, currentCampCommittee, currentCampCommittee);
                                System.out.println("-------------------------");
                                System.out.println("Camp Suggestions created!");
                                System.out.println("-------------------------\n");
                                currentCampCommittee.setpoint();
                                break;
                            }

                            case 3: 
                            {
                                System.out.println("---------------------");
                                System.out.println("Edit Camp Suggestions");
                                System.out.println("---------------------/n");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                System.out.println("Please enter your choice: ");
                                Integer suggestionIndex = sc.nextInt();
                                Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                                SuggestionManager.editSuggestion(currentSuggestion, currentCampCommittee);
                                break;
                            }

                            case 4: 
                            {
                                System.out.println("-----------------------");
                                System.out.println("Delete Camp Suggestions");
                                System.out.println("-----------------------/n");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                System.out.println("Please enter your choice: ");
                                Integer suggestionIndex = sc.nextInt();
                                Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                                SuggestionManager.deleteSuggestion(currentSuggestion, suggestionList);
                                break;
                            }

                            case 5:
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
                    while (t != 5);
                }

                case 4:
                {
                    System.out.println("----");
                    System.out.println("Exit");
                    System.out.println("----\n");
                    break;
                }
            }
        } 
        while (x != 4);
    }
}

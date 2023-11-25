package Menu;
import Assets.Camp.Camp;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Assets.Camp.*;
import Assets.QnA.Enquiry.*;
import Assets.QnA.Suggestion.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CampCommiteeCampMenu{
    //similar to camp menu but with additional features for camp commitee like suggestion reply
    public static void menu(Camp currentCamp, CampCommittee currentCampCommittee, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
        int x=0;
        do{
            System.out.println("Main Menu -> Camp Committee" + currentCamp.getName() + " Camp Menu");
            System.out.println("1. View Camp Details");
            System.out.println("2. Leave Camp");
            System.out.println("3. Camp Enquiry");
            System.out.println("4. Camp Suggestion");
            System.out.println("5. Back to Main Menu");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("View Camp Details");
                    CampManager.campDetail(currentCamp);
                    break;
                }

                case 2: {
                    System.out.println("Leave Camp");
                    System.out.println("Are you sure you want to leave this camp? (Y/N)");
                    System.out.println("Once you leave, you will not be able to rejoin the camp.");
                    sc.nextLine();
                    String choice = sc.nextLine();
                    if (choice.equals("Y"))
                        CampManager.leaveCamp(currentCampCommittee,currentCamp, campCommitteesList);
                    else if (choice.equals("N"))
                        break;
                    else
                        System.out.println("Invalid input!");
                    break;
                }

                case 3: {
                    int y=0;
                    do{
                        System.out.println("Camp Enquiry");
                        System.out.println("-------------------Camp Enquiry-------------------");
                        System.out.println("1. View All Camp Enquiry");
                        System.out.println("2. Answer Camp Enquiry");
                        System.out.println("3. Back to Camp Menu");
                        y = sc.nextInt();
                        switch (y) {
                            case 1: {
                                System.out.println("View All Camp Enquiry");
                                EnquiryManager.viewAllEnquiry(enquiryList);
                                break;
                            }
                            case 2:{
                                System.out.println("Answer Camp Enquiry");
                                EnquiryViewer.viewMyEnquiry(enquiryList, currentCampCommittee);
                                System.out.println("Please enter your choice: ");
                                Integer enquiryIndex = sc.nextInt();
                                Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                                EnquiryManager.replyEnquiry(currentEnquiry);
                                break;
                            }
                            case 3:
                                System.out.println("Exit");
                            default: {
                                System.out.println("Invalid input!");
                                break;
                            }
                        }
                    }while(y != 3) ;
                    break;
                }
                case 4:{

                    int t=0;
                    do{
                        System.out.println("Camp Suggestions");
                        System.out.println("-------------------Camp Suggestions-------------------");
                        System.out.println("1. View My Camp Suggestions");
                        System.out.println("2. Create Camp Suggestions");
                        System.out.println("3. Edit Camp Suggestions");
                        System.out.println("4. Delete Camp Suggestions");
                        System.out.println("5. Back to Camp Menu");
                        t = sc.nextInt();
                        switch (t) {
                            case 1: {
                                System.out.println("View My Camp Suggestions");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                break;
                            }

                            case 2: {
                                System.out.println("Create Camp Suggestions");
                                SuggestionManager.newSuggestion(suggestionList, currentCampCommittee,currentCampCommittee);
                                System.out.println("Camp Suggestions created!");
                                break;
                            }
                            case 3: {
                                System.out.println("Edit Camp Suggestions");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                System.out.println("Please enter your choice: ");
                                Integer suggestionIndex = sc.nextInt();
                                Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                                SuggestionManager.editSuggestion(currentSuggestion, currentCampCommittee);
                                break;
                            }
                            case 4: {
                                System.out.println("Delete Camp Suggestions");
                                SuggestionViewer.viewMySuggestion(suggestionList, currentCampCommittee);
                                System.out.println("Please enter your choice: ");
                                Integer suggestionIndex = sc.nextInt();
                                Suggestion currentSuggestion = suggestionList.get(suggestionIndex - 1);
                                SuggestionManager.deleteSuggestion(currentSuggestion, suggestionList);
                                break;
                            }
                            case 5:
                                System.out.println("Exit");

                            default: {
                                System.out.println("Invalid input!");
                                break;
                            }
                        }
                    }while (t != 5) ;
                }
                case 5:
                    System.out.println("Exit");

            }
        }while(x!=5);
    }
}

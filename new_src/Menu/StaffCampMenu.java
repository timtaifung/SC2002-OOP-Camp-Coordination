package Menu;

import Assets.Camp.*;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.QnA.Suggestion.Suggestion;
import Assets.QnA.Suggestion.SuggestionManager;
import Assets.QnA.Suggestion.SuggestionViewer;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;
import Assets.Login.ChangePassword;
import Assets.Tools.CampReport;
import Assets.Tools.PerformanceReport;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffCampMenu {
    private static final Scanner sc = new Scanner(System.in);

    private static void displayStaffCampMenu() {
        System.out.println("----------- Camps -----------");
        System.out.println("2. View all Camps");
        System.out.println("3. View own Camps");
        System.out.println("4. Create new Camp");
        System.out.println("5. Edit/Delete camp");
        System.out.println("-----------------------------\n");
        System.out.println("------------ QnA ------------");
        System.out.println("6. View/Reply Enquiries");
        System.out.println("7. View/Approve Suggestions");
        System.out.println("-----------------------------\n");
        System.out.println("---------- Reports ----------");
        System.out.println("8. Generate reports");
        System.out.println("9. Performance reports");
        System.out.println("10. Logout");
        System.out.println("-----------------------------\n");
        System.out.println("Please enter your choice: ");
    }

    public static void menu(User currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList) {
        int choice1, choice2;

        do {
            System.out.println("Staff Menu:");
            System.out.println("------ Personal Detail ------");
            System.out.println("1. Change password");
            System.out.println("-----------------------------\n");

            displayStaffCampMenu();

            choice1 = sc.nextInt();
            if (choice1 == 10)
            {
                return;
            }

            switch (choice1) 
            {
                case 1:
                    System.out.println("------------------------");
                    System.out.println("Staff -> Change Password");
                    System.out.println("Input new Password: ");
                    System.out.println("------------------------\n");
                    sc.nextLine();
                    ChangePassword.changePassword(currentUser);
                    break;

                case 2:
                    System.out.println("Staff -> View All Camps");
                    CampViewer.viewAllCamps(campList);
                    break;

                case 3:
                    System.out.println("Staff -> View my Created Camp");
                    CampViewer.viewMyCreatedCamps(campList, currentUser);
                    break;

                case 4:
                    System.out.println("Staff -> Create Camp");
                    campList.add(CampManager.createCamp(currentUser));
                    break;

                case 5:
                    do 
                    {
                        System.out.println("-------------------");
                        System.out.println("1. Edit Camp");
                        System.out.println("2. Delete Camp");
                        System.out.println("3. Back to homepage");
                        System.out.println("-------------------\n");

                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Staff -> Edit Camp");
                                CampManager.editCamp(campList, currentUser);
                                break;
                            case 2:
                                System.out.println("Staff -> Delete Camp");
                                CampManager.delCamp(campList, currentUser);
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("------------------------------------");
                                System.out.println("Invalid choice! Please choose again!");
                                System.out.println("------------------------------------\n");
                                break;
                        }
                    } while (choice2 != 3);


                case 6:
                    System.out.println("Staff -> View/Reply Enquiries");
                    if (!EnquiryViewer.getAllEnquiry(enquiryList)) {
                        break;
                    }
                    System.out.println("------------------------------");
                    System.out.println("Select an enquiry to reply to:");
                    System.out.println("------------------------------\n");
                    int eChoice = sc.nextInt();
                    Enquiry currentEnquiry = enquiryList.get(eChoice - 1);
                    EnquiryManager.replyEnquiry(currentEnquiry);
                    break;

                case 7:
                    System.out.println("Staff -> View/Reply Suggestions");
                    if (!SuggestionViewer.getAllSuggestion(suggestionList)) {
                        break;
                    }
                    SuggestionViewer.getAllSuggestion(suggestionList);
                    System.out.println("--------------------------------------");
                    System.out.println("Select a suggestion to approve/reject:");
                    System.out.println("--------------------------------------\n");
                    int sChoice = sc.nextInt();
                    Suggestion currentSuggestion = suggestionList.get(sChoice - 1);
                    SuggestionManager.approveSuggestion(currentSuggestion);
                    break;

                case 8:
                    System.out.println("Staff -> Generate reports");
                    CampReport.generateList(campList);
                    break;
                case 9:
                    System.out.println("Staff -> Performance reports");
                    PerformanceReport.generateList(campCommitteeList, campList);
                    break;

                case 10:
                    System.out.println("------------------");
                    System.out.println("Leaving staff menu");
                    System.out.println("------------------\n");
                    return;

                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid choice! Please choose again!");
                    System.out.println("------------------------------------\n");
                    break;

            }
        }
        while (choice1 != 10);
    }
}

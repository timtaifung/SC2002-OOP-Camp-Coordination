package Menu;

import Assets.Camp.Camp;
import Assets.Camp.CampManager;
import Assets.Camp.CampViewer;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Assets.Login.ChangePassword;

import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu {
    public static void menu(Student currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList) {
        int x = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Student Menu");
            System.out.println("------ Personal Detail ------");
            System.out.println("1. Change password");
            System.out.println("-----------------------------\n");
            System.out.println("----------- Camps -----------");
            System.out.println("2. View All Camps");
            System.out.println("3. View All Available Camps");
            System.out.println("4. Register Camp");
            System.out.println("5. View My Registered Camps");
            System.out.println("6. Inspect Individual Camp");
            System.out.println("7. Logout");
            System.out.println("-----------------------------\n");
            System.out.println("Please enter your choice: ");
            x = sc.nextInt();

            if (x == 7) {
                System.out.println("Successfully logged out!");
                break;
            }

            switch (x) {
                case 1:
                    System.out.println("\n-----------------------------");
                    System.out.println("Student -> Change Password");
                    System.out.println("Input new Password: ");
                    System.out.println("-----------------------------");
                    ChangePassword.changePassword(currentUser);
                    break;
                case 2:
                    CampViewer.viewAllCamps(campList);
                    break;

                case 3:
                    CampViewer.showAvailableCamp(campList, currentUser);
                    break;

                case 4:
                    CampManager.registerCamp(campList, currentUser);
                    break;

                case 5:
                    CampViewer.showMyRegisteredCamp(currentUser);
                    break;

                case 6: {
                    boolean isCampCommittee = false;
                    if (currentUser.getStudentCampList().isEmpty()) {
                        System.out.println("You have not registered for any camps!\n");
                        break;
                    }
                    System.out.println("Inspect Individual Camp");
                    if (!CampViewer.showMyRegisteredCamp(currentUser)) {
                        break;
                    }
                    System.out.println("Please enter your choice: ");
                    Integer campIndex = sc.nextInt();
                    Camp campChoice = currentUser.getStudentCampList().get(campIndex - 1);
                    for (CampCommittee currentCampCommittee : campCommitteeList) {
                        //Student is a camp committee
                        if (currentCampCommittee.getName() == currentUser.getName()) {
                            isCampCommittee = true;
                            CampCommiteeCampMenu.menu(campChoice, currentCampCommittee, campCommitteeList, enquiryList, suggestionList);
                            break;
                        }
                    }
                    StudentCampMenu.menu(currentUser, campChoice, campCommitteeList, enquiryList);
                    break;
                }

                default:
                    System.out.println("Invalid input!");
            }
        }
        while (x != 7);
    }
}

package Menu.StudentMenu;

import Assets.Camp.Camp;
import Assets.Camp.CampViewer;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Menu.CampCommiteeCampMenus.CampCommiteeCampMenu;
import Menu.StudentCampMenu;
import Menu.StudentMenu.StudentMenuOption;

import java.util.ArrayList;
import java.util.Scanner;


public class InspectCampOption implements StudentMenuOption {
    @Override
    public void execute(Student currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
        Scanner sc = new Scanner(System.in);
        boolean isCampCommittee = false;
        if (currentUser.getStudentCampList().isEmpty())
        {
            System.out.println("--------------------------------------");
            System.out.println("You have not registered for any camps!");
            System.out.println("--------------------------------------\n");
            return;
        }

        System.out.println("-----------------------");
        System.out.println("Inspect Individual Camp");
        System.out.println("-----------------------\n");

        if (!CampViewer.showMyRegisteredCamp(currentUser)) {
            return;
        }

        System.out.println("Please enter your choice:\n");
        Integer campIndex = sc.nextInt();
        Camp campChoice = currentUser.getStudentCampList().get(campIndex - 1);
        for (CampCommittee currentCampCommittee : campCommitteeList) {
            //Student is a camp committee
            if (currentCampCommittee.getName() == currentUser.getName()) {
                isCampCommittee = true;
                CampCommiteeCampMenu.menu(campChoice, currentCampCommittee, campCommitteeList, enquiryList, suggestionList, campList);
                break;
            }
        }
        StudentCampMenu.menu(currentUser, campChoice, campCommitteeList, enquiryList);
    }
}

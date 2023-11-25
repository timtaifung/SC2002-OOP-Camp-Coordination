package Menu.StudentCamps;

import Assets.Camp.Camp;
import Assets.Camp.CampManager;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCampMenu {
    public static void menu(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        int x = 0;
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("Main Menu -> Student " + currentCamp.getName() + " Camp Menu");
            System.out.println("------------------------------------------------------");
            System.out.println("----------------------");
            System.out.println("1. View Camp Details");
            System.out.println("2. Apply Camp Committee");
            System.out.println("3. Leave Camp");
            System.out.println("4. Camp Enquiry");
            System.out.println("5. Back to Main Menu");
            System.out.println("----------------------\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

            switch (x) {
                case 1:
                    new ViewCampDetailsOption().execute(currentStudent, currentCamp, campCommitteesList, enquiryList);
                    break;

                case 2:
                    new ApplyCampCommitteeOption().execute(currentStudent, currentCamp, campCommitteesList, enquiryList);
                    break;

                case 3:
                    new LeaveCampOption().execute(currentStudent, currentCamp, campCommitteesList, enquiryList);
                    break;

                case 4:
                    new CampEnquiryOption().execute(currentStudent, currentCamp, campCommitteesList, enquiryList);
                    break;

                case 5:
                    System.out.println("----");
                    System.out.println("Exit");
                    System.out.println("----\n");
                    break;

                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid choice! Please choose again!");
                    System.out.println("------------------------------------\n");
                    break;
            }
        } while (x != 5);
    }
}

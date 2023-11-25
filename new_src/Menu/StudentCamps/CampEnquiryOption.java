package Menu.StudentCamps;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class CampEnquiryOption implements StudentMenuOption {
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void execute(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        int y = 0;
        do {
            System.out.println("------- Camp Enquiry -------");
            System.out.println("1. View My Camp Enquiry");
            System.out.println("2. Create Camp Enquiry");
            System.out.println("3  Edit Camp Enquiry");
            System.out.println("4. Delete Camp Enquiry");
            System.out.println("5. Back to Camp Menu");
            System.out.println("----------------------------\n");

            y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("View My Camp Enquiry");
                    System.out.println("--------------------\n");
                    EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                    break;

                case 2:
                    System.out.println("-------------------");
                    System.out.println("Create Camp Enquiry");
                    System.out.println("-------------------\n");
                    EnquiryManager.newEnquiry(enquiryList, currentStudent, currentCamp);
                    System.out.println("---------------------");
                    System.out.println("Camp Enquiry created!");
                    System.out.println("---------------------\n");
                    break;

                case 3:
                    System.out.println("-----------------");
                    System.out.println("Edit Camp Enquiry");
                    System.out.println("-----------------\n");
                    if (!EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent)) {
                        break;
                    } else {
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                        EnquiryManager.editEnquiry(currentEnquiry, currentStudent);
                        break;
                    }

                case 4:
                    System.out.println("-------------------");
                    System.out.println("Delete Camp Enquiry");
                    System.out.println("-------------------\n");
                    if (!EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent)) {
                        break;
                    }
                    System.out.println("Please enter your choice: ");
                    Integer enquiryIndex = sc.nextInt();
                    Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                    EnquiryManager.deleteEnquiry(currentEnquiry, enquiryList);
                    break;

                case 5:
                    System.out.println("----");
                    System.out.println("Exit");
                    System.out.println("----\n");
                    break;

                default:
                    System.out.println("--------------");
                    System.out.println("Invalid input!");
                    System.out.println("--------------\n");
                    break;
            }
        } while (y != 5);
    }
}

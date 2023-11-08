package new_src.Menu.Camp;
import new_src.Assets.Camp.Camp;
import new_src.Assets.Roles.Student;
import new_src.Assets.Camp.CampManager;
import new_src.Assets.QnA.Enquiry.*;
import new_src.Assets.QnA.Suggestion.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CampMenu 
{
    public static void indivCampMenu(Camp currentCamp, Student currentStudent, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
        System.out.println("-------------------Camp Menu-------------------");
        System.out.println("1. View Camp Details");
        System.out.println("2. Apply Camp Commitee");
        System.out.println("3. Camp Enquiry");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        switch (x) 
        {
            case 1:
            {
                System.out.println("View Camp Details");
                CampManager.campDetail(currentCamp);
            }

            case 2:
            {
                System.out.println("Apply Camp Commitee");
                CampManager.applyCampCommitee(currentStudent, currentCamp);
            }

            case 3:
            {
                System.out.println("Camp Enquiry");
                System.out.println("-------------------Camp Enquiry-------------------");
                System.out.println("1. View my Camp Enquiry");
                System.out.println("2. Create new Camp Enquiry");
                System.out.println("3. Edit Camp Enquiry");
                System.out.println("4. Delete Camp Enquiry");
                System.out.println("5. Exit");
                int y = sc.nextInt();
                switch (y) {
                    case 1:
                    {
                        System.out.println("View my Camp Enquiry");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        break;
                    }

                    case 2:
                    {
                        System.out.println("Create new Camp Enquiry");
                        EnquiryManager.newEnquiry(enquiryList, currentStudent, currentCamp);
                        break;
                    }

                    case 3:
                    {
                        System.out.println("Edit Camp Enquiry");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex-1);
                        EnquiryManager.editEnquiry(enquiryChoice, currentStudent);
                        break;
                    }

                    case 4:
                    {
                        System.out.println("Delete Camp Enquiry");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryManager.deleteEnquiry(enquiryChoice, enquiryList);
                        break;

                    }

                    case 5:
                        System.out.println("Exit");
                        
                    default:
                        System.out.println("Invalid input!");
                }
            }

            case 4:
            {
                System.out.println("Camp Suggestion");
                System.out.println("-------------------Camp Suggestion-------------------");
                System.out.println("1. View my Camp Suggestion");
                System.out.println("2. Create new Camp Suggestion");
                System.out.println("3. Edit Camp Suggestion");
                System.out.println("4. Delete Camp Suggestion");
                System.out.println("5. Exit");
                int y = sc.nextInt();
                switch (y) {
                    case 1:
                    {
                        System.out.println("View my Camp Suggestion");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Create new Camp Suggestion");
                        EnquiryManager.newEnquiry(enquiryList, currentStudent, currentCamp);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Edit Camp Suggestion");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryManager.editEnquiry(enquiryChoice, currentStudent);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Delete Camp Suggestion");
                        EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryManager.deleteEnquiry(enquiryChoice, enquiryList);
                        break;

                    }
                    case 5:
                    System.out.println("Exit");
                    default:
                    System.out.println("Invalid input!");
                }
            }
            default:
                System.out.println("Invalid input!");
        }
        sc.close();
    }
}

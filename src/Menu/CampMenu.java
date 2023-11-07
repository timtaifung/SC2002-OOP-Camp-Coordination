package Menu;

import Camp.Camp;
import Camp.CampHelper;
import QnA.Enquires.Enquiry;
import QnA.Enquires.EnquiryHelper;
import QnA.Suggestions.Suggestion;
import Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class CampMenu {
    public static void indivCampMenu(Camp currentCamp, Student currentStudent, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
        System.out.println("-------------------Camp Menu-------------------");
        System.out.println("1. View Camp Details");
        System.out.println("2. Apply Camp Commitee");
        System.out.println("3. Camp Enquiry");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("View Camp Details");
                CampHelper.campDetail(currentCamp);
            }
            case 2 -> {
                System.out.println("Apply Camp Commitee");
                CampHelper.applyCampCommitee(currentStudent, currentCamp);
            }
            case 3 -> {
                System.out.println("Camp Enquiry");
                System.out.println("-------------------Camp Enquiry-------------------");
                System.out.println("1. View my Camp Enquiry");
                System.out.println("2. Create new Camp Enquiry");
                System.out.println("3. Edit Camp Enquiry");
                System.out.println("4. Delete Camp Enquiry");
                System.out.println("5. Exit");
                int y = sc.nextInt();
                switch (y) {
                    case 1 -> {
                        System.out.println("View my Camp Enquiry");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Create new Camp Enquiry");
                        EnquiryHelper.newEnquiry(enquiryList, currentStudent, currentCamp);
                        break;
                    }
                    case 3 -> {
                        System.out.println("Edit Camp Enquiry");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex-1);
                        EnquiryHelper.editEnquiry(enquiryChoice, currentStudent);
                        break;
                    }
                    case 4 -> {
                        System.out.println("Delete Camp Enquiry");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryHelper.deleteEnquiry(enquiryChoice, enquiryList);
                        break;

                    }
                    case 5 -> System.out.println("Exit");
                    default -> System.out.println("Invalid input!");
                }

            }
            case 4 -> {
                System.out.println("Camp Suggestion");
                System.out.println("-------------------Camp Suggestion-------------------");
                System.out.println("1. View my Camp Suggestion");
                System.out.println("2. Create new Camp Suggestion");
                System.out.println("3. Edit Camp Suggestion");
                System.out.println("4. Delete Camp Suggestion");
                System.out.println("5. Exit");
                int y = sc.nextInt();
                switch (y) {
                    case 1 -> {
                        System.out.println("View my Camp Suggestion");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        break;
                    }
                    case 2 -> {
                        System.out.println("Create new Camp Suggestion");
                        EnquiryHelper.newEnquiry(enquiryList, currentStudent, currentCamp);
                        break;
                    }
                    case 3 -> {
                        System.out.println("Edit Camp Suggestion");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryHelper.editEnquiry(enquiryChoice, currentStudent);
                        break;
                    }
                    case 4 -> {
                        System.out.println("Delete Camp Suggestion");
                        EnquiryHelper.viewMyEnquiry(enquiryList, currentStudent);
                        System.out.println("Please enter your choice: ");
                        Integer enquiryIndex = sc.nextInt();
                        Enquiry enquiryChoice = currentStudent.getStudentEnquiryList().get(enquiryIndex);
                        EnquiryHelper.deleteEnquiry(enquiryChoice, enquiryList);
                        break;

                    }
                    case 5 -> System.out.println("Exit");
                    default -> System.out.println("Invalid input!");
                }

            }
            default -> System.out.println("Invalid input!");
        }
    }
}

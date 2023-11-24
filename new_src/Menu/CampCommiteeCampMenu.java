package Menu;
import Assets.Camp.Camp;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Assets.Camp.*;
import Assets.QnA.Enquiry.*;
import Assets.QnA.Suggestion.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CampCommiteeCampMenu extends CampMenu{
   //similar to camp menu but with additional features for camp commitee like suggestion reply
   public static void campCommMenu(Camp currentCamp, CampCommittee currentStudent, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
       System.out.println("-------------------Camp Menu-------------------");
       System.out.println("1. View Camp Details");
       System.out.println("2. Apply Camp Commitee");
       System.out.println("3. Leave Camp");
       System.out.println("4. Camp Enquiry");
       System.out.println("5. Camp Suggestion");
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
               System.out.println("Leave Camp");
               System.out.println("Are you sure you want to leave this camp? (Y/N)");
               System.out.println("Once you leave, you will not be able to rejoin the camp.");
               String choice = sc.nextLine();
               if (choice.equals("Y"))
                   CampManager.leaveCamp(currentStudent, currentCamp);
               else if (choice.equals("N"))
                   break;
               else
                   System.out.println("Invalid input!");
           }

           case 4:
           {
               System.out.println("Camp Enquiry");
               System.out.println("-------------------Camp Enquiry-------------------");
               System.out.println("1. View all Camp Enquiry");
               System.out.println("2. Reply Camp Enquiry");
               System.out.println("3. Exit");
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
                       System.out.println("Reply Camp Enquiry");
                          EnquiryManager.viewAllEnquiry(enquiryList);
                            System.out.println("Please enter your choice: ");
                            Integer enquiryIndex = sc.nextInt();
                            Enquiry enquiryChoice = enquiryList.get(enquiryIndex-1);
                            EnquiryManager.replyEnquiry(enquiryChoice);
                            currentStudent.setpoint();
                            break;
                   }
                   case 3:
                       System.out.println("Exit");
                       break;

                   default:
                       System.out.println("Invalid input!");
                       break;
               }
           }
           case 5:
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
                       currentStudent.setpoint();
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
   }
}

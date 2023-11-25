package Menu;

import Assets.Camp.Camp;
import Assets.Camp.CampManager;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.EnquiryManager;
import Assets.QnA.Enquiry.EnquiryViewer;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCampMenu {
    public static void menu(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        int x = 0;
        do {
            System.out.println("Main Menu -> Student" + currentCamp.getName() + " Camp Menu");
            System.out.println("1. View Camp Details");
            System.out.println("2. Apply Camp Commitee");
            System.out.println("3. Leave Camp");
            System.out.println("4. Camp Enquiry");
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
                    System.out.println("Apply Camp Commitee");
                    CampManager.applyCampCommitee(currentStudent, currentCamp, campCommitteesList);
                    break;
                }

                case 3: {
                    System.out.println("Leave Camp");
                    System.out.println("Are you sure you want to leave this camp? (Y/N)");
                    System.out.println("Once you leave, you will not be able to rejoin the camp.");
                    sc.nextLine();
                    String choice = sc.nextLine();
                    if (choice.equals("Y"))
                        CampManager.leaveCamp(currentStudent, currentCamp, campCommitteesList);
                    else if (choice.equals("N"))
                        break;
                    else
                        System.out.println("Invalid input!");
                    break;
                }

                case 4: {
                    int y = 0;
                    do {
                        System.out.println("Camp Enquiry");
                        System.out.println("-------------------Camp Enquiry-------------------");
                        System.out.println("1. View My Camp Enquiry");
                        System.out.println("2. Create Camp Enquiry");
                        System.out.println("3  Edit Camp Enquiry");
                        System.out.println("4. Delete Camp Enquiry");
                        System.out.println("5. Back to Camp Menu");
                        y = sc.nextInt();
                        switch (y) {
                            case 1: {
                                System.out.println("View My Camp Enquiry");
                                EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                                break;
                            }

                            case 2: {
                                System.out.println("Create Camp Enquiry");
                                EnquiryManager.newEnquiry(enquiryList, currentStudent, currentCamp);
                                System.out.println("Camp Enquiry created!");
                                break;
                            }
                            case 3: {
                                System.out.println("Edit Camp Enquiry");
                                EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                                System.out.println("Please enter your choice: ");
                                Integer enquiryIndex = sc.nextInt();
                                Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                                EnquiryManager.editEnquiry(currentEnquiry, currentStudent);
                                break;
                            }
                            case 4: {
                                System.out.println("Delete Camp Enquiry");
                                EnquiryViewer.viewMyEnquiry(enquiryList, currentStudent);
                                System.out.println("Please enter your choice: ");
                                Integer enquiryIndex = sc.nextInt();
                                Enquiry currentEnquiry = enquiryList.get(enquiryIndex - 1);
                                EnquiryManager.deleteEnquiry(currentEnquiry, enquiryList);
                                break;
                            }
                            case 5:
                                System.out.println("Exit");

                            default: {
                                System.out.println("Invalid input!");
                                break;
                            }
                        }
                    } while (y != 5);
                }
                case 5:
                    System.out.println("Exit");

            }
        } while (x != 5);
    }
}

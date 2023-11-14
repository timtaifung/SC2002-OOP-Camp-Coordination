package Menu;
import Assets.Roles.Student;
import Assets.Camp.*;
import Assets.QnA.Enquiry.*;
import Assets.QnA.Suggestion.*;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentCampMenu 
{
    public static void menu(Student currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
        int x=0;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Student Menu");
            System.out.println("Choose your options:");
            System.out.println("1. View All Camps");
            System.out.println("2. View All Available Camps");
            System.out.println("3. Register Camp");
            System.out.println("4. View My Registered Camps");
            System.out.println("5. Inspect Individual Camp");
            System.out.println("6. Logout");
            System.out.println("Please enter your choice: ");
            x = sc.nextInt();

            if (x == 6)
            {
                System.out.println("Successfully logged out!");
                break;
            }

            switch (x) 
            {
                case 1:
                    if(campList.isEmpty()){
					    System.out.println("There are no camps currently!");
				    }
				    else{
					    CampViewer.viewAllCamps(campList);
				    }

                case 2:
                    CampViewer.showAvailableCamp(campList, currentUser);

                case 3:
                    CampManager.registerCamp(campList, currentUser);

                case 4:
                    CampViewer.showMyRegisteredCamp(currentUser);

                case 5:
                {
                    System.out.println("Inspect Individual Camp");
                    CampViewer.showMyRegisteredCamp(currentUser);
                    System.out.println("Please enter your choice: ");
                    Integer campIndex = sc.nextInt();
                    Camp campChoice = currentUser.getStudentCampList().get(campIndex-1);
                    if(currentUser.getIsCampCommitee()){
                        CampCommiteeCampMenu.indivCampMenu(campChoice, currentUser, campList, enquiryList, suggestionList);
                    }
                    else
                        CampMenu.indivCampMenu(campChoice, currentUser, campList, enquiryList, suggestionList);
                }

                default:
                    System.out.println("Invalid input!");
            }
            sc.close();
        }
        while(x!=7);
    }
}

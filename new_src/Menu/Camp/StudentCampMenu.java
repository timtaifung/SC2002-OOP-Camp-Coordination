package new_src.Menu.Camp;
import Camp.Camp;
import Camp.CampHelper;
import QnA.Enquires.Enquiry;
import QnA.Suggestions.Suggestion;
import Roles.Student;
import Roles.User;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentCampMenu 
{
    public static void menu(Student currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
        int x=0;
        do{
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
                    CampHelper.showAllVisibleCamp(campList, currentUser);

                case 2:
                    CampHelper.showAvailableCamp(campList, currentUser);

                case 3:
                    CampHelper.registerCamp(campList, currentUser);

                case 4:
                    CampHelper.showMyRegisteredCamp(currentUser);

                case 5:
                {
                    System.out.println("Inspect Individual Camp");
                    CampHelper.showMyRegisteredCamp(currentUser);
                    System.out.println("Please enter your choice: ");
                    Integer campIndex = sc.nextInt();
                    Camp campChoice = currentUser.getStudentCampList().get(campIndex-1);
                    CampMenu.indivCampMenu(campChoice, currentUser, campList, enquiryList, suggestionList);
                }

                default:
                    System.out.println("Invalid input!");
            }
        }
        while(x!=7);
    }
}

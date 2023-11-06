package Menu;
import java.util.Scanner;
import Roles.User;

public class StaffMenu{
    public static void campView(User user){
        //if (user instanceof Staff staff){
        System.out.println("1. Create a camp");
        System.out.println("2. Edit a camp"); //visibility can be toggled here
        System.out.println("3. Delete a camp");
        System.out.println("4. View all camps");
        System.out.println("5. View own camps");
        System.out.println("6. View and reply enquiries");
        System.out.println("7. View and approve suggestions");
        System.out.println("8. Generate student list");
        System.out.println("9. Generate performance report");
        System.out.println("0. Back");

        System.out.println("Please enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                //createCamp();
                break;

            case 2:
                //editCamp();
                break;

            case 3:
                //deleteCamp();
                break;

            case 4:
                //viewAllCamps();
                break;

            case 5:
                //viewOwnCamps();
                break;

            case 6:
                //viewEnq();
                break;

            case 7:
                //viewSuggestions();
                break;

            case 8:
                //genStudList();
                break;

            case 9:
                //genPerfReport();
                break;

            case 0:
                //return to prev page
                break;

            default:
                //return to prev page
                break;




        }


    }
}
package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Camp.CampViewer;
import Assets.Roles.Student;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterCamp {
    public static void registerCamp(ArrayList<Camp> campList, Student currentUser)
    {
        if (!CampViewer.showAvailableCamp(campList, currentUser))
        {
            return;
        }

        Scanner sc = new Scanner(System.in);
        if (campList.size() == 0)
        {
            return;
        }

        System.out.print("Select Camp to Register: ");
        if (!sc.hasNextInt())           //WHAT IF INPUT OUR OF RANGE
        {
            System.out.println("--------------------------------------------");
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.println("--------------------------------------------\n");
            return;
        }

        int campIndex = sc.nextInt();
        sc.nextLine();
        Camp camp = campList.get(campIndex - 1);

        //check if current user is blacklisted
        for (User blackListedUser : camp.getBlackList())
        {
            if (blackListedUser.equals(currentUser))
            {
                System.out.println("---------------------------------------------------");
                System.out.println("You previously left this camp! Unable to join back!");
                System.out.println("---------------------------------------------------\n");
                return;
            }
        }
        for(int i=0;i<camp.getAttendanceList().size();i++){
            if(camp.getAttendanceList().get(i) == currentUser){
                System.out.println("------------------------------------------");
                System.out.println("You have already registered for this camp!");
                System.out.println("------------------------------------------");
                return;
            }
        }


        if (camp.getAvailableSlots() > 0) {
            //check if student registered camp clash with other camp date
            for (Camp studentCamp : currentUser.getStudentCampList())
            {
                if (studentCamp.getDateofCamp().toString().equals(camp.getDateofCamp().toString()))
                {
                    System.out.println("--------------------------------------------------");
                    System.out.println("You have registered another camp on the same date!");
                    System.out.println("--------------------------------------------------\n");
                    return;
                }
            }
            camp.getAttendanceList().add(currentUser);
            currentUser.getStudentCampList().add(camp);
            System.out.println("------------------------");
            System.out.println("Registered successfully!");
            System.out.println("------------------------");
        }

        else
        {
            System.out.println("-------------");
            System.out.println("Camp is full!");
            System.out.println("-------------\n");
        }

    }
}

package Menu.StudentCamps;

import Assets.Camp.CampManager;
import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaveCampOption implements StudentMenuOption {
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void execute(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Leave Camp");
        System.out.println("Are you sure you want to leave this camp? (Y/N)");
        System.out.println("Once you leave, you will not be able to rejoin the camp.");
        System.out.println("--------------------------------------------------------\n");
        sc.nextLine();
        String choice = sc.nextLine();
        if (choice.equals("Y"))
            CampManager.leaveCamp(currentStudent, currentCamp, campCommitteesList);
        else if (choice.equals("N"))
            return;
        else
            System.out.println("--------------");
        System.out.println("Invalid input!");
        System.out.println("--------------\n");
    }
}

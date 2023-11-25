package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public class ApplyCampCommittee {
    public static Boolean applyCampCommitee(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteeList)
    {
        if (currentCamp.getCommiteeSlots() == 0)
        {
            System.out.println("------------------------------------------------");
            System.out.println("There are no more camp commitee slots available!");
            System.out.println("------------------------------------------------\n");
            return false;
        }
        //Checking if student is already a camp commitee for this camp
        if (currentCamp.getCommiteeList().contains(currentStudent))
        {
            System.out.println("--------------------------------");
            System.out.println("You are already a camp commitee!");
            System.out.println("--------------------------------\n");
            return false;
        }
        //Checking if student is already a camp commitee for another camp
        for (CampCommittee currentCampCommittee : campCommitteeList)
        {
            if (currentCampCommittee.getName().equals(currentStudent.getName()))
            {
                System.out.println("-------------------------------------------------");
                System.out.println("You are already a camp Commitee for another Camp!");
                System.out.println("-------------------------------------------------\n");
                return false;
            }
        }
        CampCommittee campCommittee = new CampCommittee(currentStudent, currentCamp);
        campCommitteeList.add(campCommittee);
        CampCommittee campcommitee = new CampCommittee(currentStudent, currentCamp);
        currentCamp.getCommiteeList().add(campcommitee);
        currentCamp.setCommiteeSlots(currentCamp.getCommiteeSlots() - 1);
        System.out.println("---------------------");
        System.out.println("Applied successfully!");
        System.out.println("---------------------\n");
        return true;
    }
}

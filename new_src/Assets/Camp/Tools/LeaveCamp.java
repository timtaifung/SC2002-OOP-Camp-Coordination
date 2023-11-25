package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public class LeaveCamp {
    public static void leaveCamp(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteeList) {
        currentCamp.getAttendanceList().remove(currentStudent);
        currentStudent.getStudentCampList().remove(currentCamp);
        if (currentCamp.getCommiteeList().contains(currentStudent)) {
            campCommitteeList.remove(currentStudent);
            currentCamp.getCommiteeList().remove(currentStudent);
            currentCamp.setCommiteeSlots(currentCamp.getCommiteeSlots() + 1);
        }
        currentCamp.getBlackList().add(currentStudent);
        System.out.println("-----------------------");
        System.out.println("Left camp successfully!");
        System.out.println("-----------------------\n");
    }

}

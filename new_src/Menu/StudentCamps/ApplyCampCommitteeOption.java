package Menu.StudentCamps;

import Assets.Camp.CampManager;
import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public class ApplyCampCommitteeOption implements StudentMenuOption {
    @Override
    public void execute(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        System.out.println("-------------------");
        System.out.println("Apply Camp Committee");
        System.out.println("-------------------\n");
        if (CampManager.applyCampCommitee(currentStudent, currentCamp, campCommitteesList)) {
            currentStudent.setRole("CampCommittee");
        }
    }
}

package Menu.StudentCamps;

import Assets.Camp.Camp;
import Assets.Camp.Tools.ApplyCampCommittee;
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
        if (ApplyCampCommittee.applyCampCommitee(currentStudent, currentCamp, campCommitteesList)) {
            currentStudent.setRole("CampCommittee");
        }
    }
}

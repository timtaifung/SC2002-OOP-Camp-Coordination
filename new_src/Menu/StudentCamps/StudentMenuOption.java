package Menu.StudentCamps;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public interface StudentMenuOption {
    void execute(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList);
}

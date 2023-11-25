package Menu.StudentCamps;

import Assets.Camp.Camp;
import Assets.Camp.Tools.CampDetails;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;

import java.util.ArrayList;

public class ViewCampDetailsOption implements StudentMenuOption {
    @Override
    public void execute(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteesList, ArrayList<Enquiry> enquiryList) {
        System.out.println("-----------------");
        System.out.println("View Camp Details");
        System.out.println("-----------------\n");
        CampDetails.campDetail(currentCamp);
    }
}

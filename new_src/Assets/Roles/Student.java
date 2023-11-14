package Assets.Roles;
import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;

import java.util.ArrayList;

public class Student extends User
{
    private ArrayList<Camp> studentCampList;
    private ArrayList<Enquiry> studentEnquiryList;
    private ArrayList<String> isCampCommittee;

    public Student(String name, String email, String faculty, String role) 
    {
        super(name, email, faculty,role);
        this.studentCampList = new ArrayList<Camp>();
        this.studentEnquiryList = new ArrayList<Enquiry>();
        this.isCampCommittee = new ArrayList<String>();
    }

    public ArrayList<String> getIsCampCommittee()
    {
        return this.isCampCommittee;
    }

    public ArrayList<Camp> getStudentCampList()
    {
        return this.studentCampList;
    }

    public ArrayList<Enquiry> getStudentEnquiryList()
    {
        return this.studentEnquiryList;
    }

    public void setIsCampCommittee(String camp)
    {
        this.isCampCommittee.add(camp);
    }
}

package Menu.StaffCampMenus;

import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Enquiry.Tools.EnquiryReplier;
import Assets.QnA.Enquiry.Tools.EnquiryViewer;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewReplyEnquiriesOption implements StaffMenuOption {
    private static final Scanner sc = new Scanner(System.in);

    @Override
    public void execute(User currentUser, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList, ArrayList<CampCommittee> campCommitteeList, ArrayList<Assets.Camp.Camp> campList) {
        System.out.println("Staff -> View/Reply Enquiries");
        if (!EnquiryViewer.getAllEnquiry(enquiryList)) {
            System.out.println("No enquiries found!");
            return;
        }
        System.out.println("------------------------------");
        System.out.println("Select an enquiry to reply to:");
        System.out.println("------------------------------\n");
        int eChoice = sc.nextInt();
        Enquiry currentEnquiry = enquiryList.get(eChoice - 1);
        EnquiryReplier.replyEnquiry(currentEnquiry);
    }
}

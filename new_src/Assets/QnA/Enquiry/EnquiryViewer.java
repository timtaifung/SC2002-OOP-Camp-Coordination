package Assets.QnA.Enquiry;

import Assets.Roles.User;

import java.util.ArrayList;

public class EnquiryViewer extends Enquiry {
    public EnquiryViewer(User currentUser) {
        super(currentUser);
    }

    public static Boolean getAllEnquiry(ArrayList<Enquiry> enquiryList) {
        if (enquiryList.isEmpty()) {
            System.out.println("There are no enquiries currently!\n");
            return false;
        }
        Integer i = 1;
        for (Enquiry currentEnquiry : enquiryList) {
            System.out.println(i + ". " + currentEnquiry.getTitle());
        }
        return true;
    }

    public static void viewMyEnquiry(ArrayList<Enquiry> enquiryList, User currentUser) {
        Integer i = 1;
        for (Enquiry currentEnquiry : enquiryList) {
            if (currentEnquiry.getCreatedBy().equals(currentUser)) {
                System.out.print(i + ". " + currentEnquiry.getTitle() + "     ");
                if (currentEnquiry.getProcessedStatus()) {
                    System.out.println("Processed");
                    System.out.println("Reply: " + currentEnquiry.getreply());
                } else {
                    System.out.println("Not Processed");
                }
            }
        }
    }
}

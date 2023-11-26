package Assets.QnA.Enquiry.Tools;

import Assets.QnA.Enquiry.Enquiry;

import java.util.ArrayList;

public class EnquiryDeletor {
    public static void deleteEnquiry(Enquiry currentEnquiry, ArrayList<Enquiry> enquiryList) {
        if(currentEnquiry.getProcessedStatus()){
            System.out.println("------------------------------------------------");
            System.out.println("Enquiry has been processed and cannot be deleted!");
            System.out.println("------------------------------------------------\n");
            return;
        }
        enquiryList.remove(currentEnquiry);
        System.out.println("----------------");
        System.out.println("Enquiry deleted!");
        System.out.println("----------------\n");
    }

}

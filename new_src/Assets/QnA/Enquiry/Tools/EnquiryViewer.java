package Assets.QnA.Enquiry.Tools;

import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.User;

import java.util.ArrayList;

public class EnquiryViewer extends Enquiry {
    public EnquiryViewer(User currentUser) {
        super(currentUser);
    }

    public static Boolean getAllEnquiry(ArrayList<Enquiry> enquiryList) {
        if (enquiryList.isEmpty()) 
        {
            System.out.println("---------------------------------");
            System.out.println("There are no enquiries currently!");
            System.out.println("---------------------------------\n");
            return false;
        }

        Integer i = 1;
        for (Enquiry currentEnquiry : enquiryList) 
        {
            System.out.println("---------------------------------");
            System.out.println(i + ". " + currentEnquiry.getTitle());
            System.out.println("---------------------------------\n");
            i++;
        }
        return true;
    }

    public static Boolean viewMyEnquiry(ArrayList<Enquiry> enquiryList, User currentUser) {
        Integer i = 1;
        for (Enquiry currentEnquiry : enquiryList) 
        {
            if (currentEnquiry.getCreatedBy().equals(currentUser)) 
            {
                System.out.println("---------------------------------");
                System.out.print(i + ". " + currentEnquiry.getTitle() + "     ");
                if (currentEnquiry.getProcessedStatus()) 
                {
                    System.out.println("Processed");
                    System.out.println("Reply: " + currentEnquiry.getreply());
                    System.out.println("---------------------------------\n");
                }
                else 
                {
                    System.out.println("Not Processed");
                    System.out.println("---------------------------------\n");
                }
                i++;
            }
        }
        if(i==1){
            System.out.println("------------------------------------");
            System.out.println("You have not made any enquiries yet!");
            System.out.println("------------------------------------");
            return false;
        }
        return true;
    }
}

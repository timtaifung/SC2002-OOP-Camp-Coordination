package Assets.QnA.Enquiry;
import Assets.Roles.User;

import java.util.ArrayList;

public class EnquiryViewer extends Enquiry
{
    public EnquiryViewer(User currentUser) 
    {
		super(currentUser);
	}

    public static void getAllEnquiry(ArrayList<Enquiry> enquiryList)
    {
		Integer i=1;
		for (Enquiry currentEnquiry : enquiryList) 
        {
			System.out.println(i+". "+currentEnquiry.getTitle());
		}
	}

    public static void viewMyEnquiry(ArrayList<Enquiry> enquiryList, User currentUser)
    {
		Integer i=1;
		for (Enquiry currentEnquiry : enquiryList) 
        {
			if(currentEnquiry.getCreatedBy().equals(currentUser))
            {
				System.out.println(i+". "+currentEnquiry.getTitle());
			}
		}
	}
}

package QnA.Enquires;
import Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EnquiryHelper extends Enquiry{
	public EnquiryHelper(User currentUser) {
		super(currentUser);
	}

	public static void replyEnquiry(Enquiry currentEnquiry){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reply:");
		String y = sc.nextLine();
		currentEnquiry.setreply(y);
		currentEnquiry.setProcessedStatus(true);
		System.out.println("Reply submitted!");
	}
	public static void getAllEnquiry(ArrayList<Enquiry> enquiryList){
		Integer i=1;
		for (Enquiry currentEnquiry : enquiryList) {
			System.out.println(i+". "+currentEnquiry.getTitle());
		}
	}
}
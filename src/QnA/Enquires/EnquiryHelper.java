package QnA.Enquires;
import java.util.ArrayList;
import java.util.Scanner;

public class EnquiryHelper extends Enquiry{
	
	
	public void replyToEnquiry() {
		String content = getcontent();
		System.out.println("The enquiry is: "+ content);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reply below:");
		String y = sc.nextLine();
		setreply(y);
		setProcessedStatus(true);
		System.out.println("Reply saved!");
	}
	public static void getAllEnquiry(ArrayList<Enquiry> enquiryList){
		for (Enquiry en : enquiryList) {
		    en.view();
		}
	}

}
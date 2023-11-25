package Assets.QnA.Enquiry.Tools;

import Assets.Camp.Camp;
import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EnquiryCreator {
    public static void newEnquiry(ArrayList<Enquiry> enquiryList, User currentUser, Camp currentCamp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Enter your enquiry title:");
        System.out.println("-------------------------\n");
        String title = sc.nextLine();
        System.out.println("---------------------------");
        System.out.println("Enter your enquiry content:");
        System.out.println("---------------------------\n");
        String content = sc.nextLine();
        Enquiry newEnquiry = new Enquiry(currentUser);
        newEnquiry.setTitle(title);
        newEnquiry.setContent(content);
        enquiryList.add(newEnquiry);
        System.out.println("------------------");
        System.out.println("Enquiry submitted!");
        System.out.println("------------------\n");
    }

}

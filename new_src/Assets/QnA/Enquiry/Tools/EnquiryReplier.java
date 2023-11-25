package Assets.QnA.Enquiry.Tools;

import Assets.QnA.Enquiry.Enquiry;

import java.util.Scanner;

public class EnquiryReplier {
    public static void replyEnquiry(Enquiry currentEnquiry) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Enquiry content:");
        System.out.println("----------------\n");
        System.out.println(currentEnquiry.getContent());

        System.out.println("-----------------");
        System.out.println("Enter your reply:");
        System.out.println("-----------------\n");
        String y = sc.nextLine();
        currentEnquiry.setreply(y);
        currentEnquiry.setProcessedStatus(true);
        System.out.println("----------------");
        System.out.println("Reply submitted!");
        System.out.println("----------------\n");

    }

}

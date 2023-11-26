package Assets.QnA.Enquiry.Tools;

import Assets.QnA.Enquiry.Enquiry;
import Assets.Roles.User;

import java.util.Scanner;

public class EnquiryEditor {
    public static void editEnquiry(Enquiry currentEnquiry, User currentUser) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1. Edit enquiry title");
        System.out.println("2. Edit enquiry content");
        System.out.println("3. Exit");
        System.out.println("-----------------------\n");
        Integer x = sc.nextInt();
        switch (x) {
            case 1:
            {
                System.out.println("-------------------------");
                System.out.println("Enter your enquiry title:");
                System.out.println("-------------------------\n");
                sc.nextLine();
                String title = sc.nextLine();
                currentEnquiry.setTitle(title);
                System.out.println("----------------------");
                System.out.println("Enquiry title updated!");
                System.out.println("----------------------\n");
                break;
            }

            case 2: {
                System.out.println("---------------------------");
                System.out.println("Enter your enquiry content:");
                System.out.println("---------------------------\n");
                sc.nextLine();
                String content = sc.nextLine();
                currentEnquiry.setContent(content);
                System.out.println("------------------------");
                System.out.println("Enquiry content updated!");
                System.out.println("------------------------\n");
                break;
            }

            case 3:
                System.out.println("----");
                System.out.println("Exit");
                System.out.println("----\n");
                break;

            default:
                System.out.println("--------------");
                System.out.println("Invalid input!");
                System.out.println("--------------\n");
                break;
        }
    }

}

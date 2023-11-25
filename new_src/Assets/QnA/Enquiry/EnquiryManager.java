package Assets.QnA.Enquiry;

import Assets.Camp.Camp;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EnquiryManager extends Enquiry {
    public EnquiryManager(User currentUser) {
        super(currentUser);
    }

    public static void replyEnquiry(Enquiry currentEnquiry) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Enquiry content:");
        System.out.println(currentEnquiry.getContent());
        System.out.println("----------------\n");

        System.out.println("Enter your reply:");
        String y = sc.nextLine();
        currentEnquiry.setreply(y);
        currentEnquiry.setProcessedStatus(true);
        System.out.println("Reply submitted!");
    }

    public static void newEnquiry(ArrayList<Enquiry> enquiryList, User currentUser, Camp currentCamp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your enquiry title:");
        String title = sc.nextLine();
        System.out.println("Enter your enquiry content:");
        String content = sc.nextLine();
        Enquiry newEnquiry = new Enquiry(currentUser);
        newEnquiry.setTitle(title);
        newEnquiry.setContent(content);
        enquiryList.add(newEnquiry);
        System.out.println("Enquiry submitted!");
    }

    public static void editEnquiry(Enquiry currentEnquiry, User currentUser) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Edit enquiry title");
        System.out.println("2. Edit enquiry content");
        System.out.println("3. Exit");
        Integer x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Enter your enquiry title:");
                String title = sc.nextLine();
                sc.nextLine();
                currentEnquiry.setTitle(title);
                System.out.println("Enquiry title updated!");
                break;
            }

            case 2: {
                System.out.println("Enter your enquiry content:");
                String content = sc.nextLine();
                sc.nextLine();
                currentEnquiry.setContent(content);
                System.out.println("Enquiry content updated!");
                break;
            }

            case 3:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    public static void deleteEnquiry(Enquiry currentEnquiry, ArrayList<Enquiry> enquiryList) {
        enquiryList.remove(currentEnquiry);
        System.out.println("Enquiry deleted!");
    }
}

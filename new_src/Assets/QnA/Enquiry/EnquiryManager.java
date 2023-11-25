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
                String title = sc.nextLine();
                sc.nextLine();
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
                String content = sc.nextLine();
                sc.nextLine();
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

    public static void deleteEnquiry(Enquiry currentEnquiry, ArrayList<Enquiry> enquiryList) {
        enquiryList.remove(currentEnquiry);
        System.out.println("----------------");
        System.out.println("Enquiry deleted!");
        System.out.println("----------------\n");
    }
}

package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Camp.CampViewer;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CampEditor {
    public static void editCamp(ArrayList<Camp> campList, User currentUser) {
        if (!CampViewer.viewMyCreatedCamps(campList, currentUser)) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Select Camp to Edit:");
        System.out.println("--------------------\n");
        Integer campIndex = sc.nextInt();
        Camp camp = campList.get(campIndex - 1);

        System.out.println("--------- Edit Camp ---------");
        System.out.println("1. Camp Name");
        System.out.println("2. Date of Camp");
        System.out.println("3. Registeration Closing Date");
        System.out.println("4. Faculty/School");
        System.out.println("5. Location");
        System.out.println("6. Total Slots");
        System.out.println("7. Camp Commitee Slots");
        System.out.println("8. Short Description");
        System.out.println("9. Visiblity Toggle");
        System.out.println("10. Back to homepage");
        System.out.println("-----------------------------\n");

        Integer choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("----------");
                System.out.println("Camp Name:");
                System.out.println("----------\n");
                sc.nextLine();
                String campName = sc.nextLine();
                camp.setName(campName);
                System.out.println("-------------------------------");
                System.out.println("Camp name changed successfully!");
                System.out.println("-------------------------------\n");
                break;

            case 2:
                System.out.println("--------------");
                System.out.println("Date of Camp: ");
                System.out.println("--------------\n");
                sc.nextLine();
                String dateOfCamp = sc.nextLine();
                camp.setDateofCamp(dateOfCamp);
                System.out.println("----------------------------------");
                System.out.println("Date of camp changed successfully!");
                System.out.println("----------------------------------\n");
                break;

            case 3:
                System.out.println("---------------------------");
                System.out.println("Registeration Closing Date:");
                System.out.println("---------------------------\n");
                sc.nextLine();
                String registeraionClosing = sc.nextLine();
                camp.setRegistrationClosing(registeraionClosing);
                System.out.println("------------------------------------------------");
                System.out.println("Registration closing date changed successfully!");
                System.out.println("------------------------------------------------\n");
                break;

            case 4:
                System.out.println("---------------");
                System.out.println("Faculty/School:");
                System.out.println("---------------\n");
                sc.nextLine();
                String grouping = sc.nextLine();
                camp.setGrouping(grouping);
                System.out.println("------------------------------------");
                System.out.println("Faculty/School changed successfully!");
                System.out.println("------------------------------------\n");
                break;

            case 5:
                System.out.println("---------");
                System.out.println("Location:");
                System.out.println("---------\n");
                sc.nextLine();
                String location = sc.nextLine();
                camp.setLocation(location);
                System.out.println("------------------------------");
                System.out.println("Location changed successfully!");
                System.out.println("------------------------------\n");
                break;

            case 6:
                System.out.println("------------");
                System.out.println("Total Slots:");
                System.out.println("------------/n");
                sc.nextLine();
                Integer totalSlots = sc.nextInt();
                camp.setTotalSlots(totalSlots);
                System.out.println("---------------------------------");
                System.out.println("Total slots changed successfully!");
                System.out.println("---------------------------------\n");
                break;

            case 7:
                System.out.println("--------------------");
                System.out.println("Camp Commitee Slots:");
                System.out.println("--------------------\n");
                sc.nextLine();
                Integer commiteeSlots = sc.nextInt();
                camp.setCommiteeSlots(commiteeSlots);
                System.out.println("-----------------------------------------");
                System.out.println("Camp commitee slots changed successfully!");
                System.out.println("-----------------------------------------\n");
                break;

            case 8:
                System.out.println("------------------");
                System.out.println("Short Description:");
                System.out.println("------------------\n");
                sc.nextLine();
                String shortDescription = sc.nextLine();
                camp.setShortDescription(shortDescription);
                System.out.println("---------------------------------------");
                System.out.println("Short description changed successfully!");
                System.out.println("---------------------------------------\n");
                break;

            case 9:
                if (camp.getVisiblity())
                {
                    camp.setVisiblity(false);
                }
                else
                {
                    camp.setVisiblity(true);
                }
                System.out.println("-------------------------------");
                System.out.println("Visiblity changed successfully!");
                System.out.println("-------------------------------\n");
                break;

            case 10:
                break;
        }
    }

}

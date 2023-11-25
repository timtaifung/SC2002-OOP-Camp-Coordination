package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Roles.User;

import java.util.Scanner;

public class CampCreator {
    public static Camp createCamp(User currentUser) {
        Camp camp = new Camp(currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Create Camp -------");
        System.out.println("Camp Name: ");
        String campName = sc.nextLine();
        System.out.println("Date of Camp: ");
        String dateOfCamp = sc.nextLine();
        System.out.println("Registeration Closing Date: ");
        String registeraionClosing = sc.nextLine();
        System.out.println("Faculty/School: ");
        String grouping = sc.nextLine();
        System.out.println("Location: ");
        String location = sc.nextLine();
        System.out.println("Total Slots: ");
        Integer totalSlots = sc.nextInt();      //try throw exception when input is !integer
        System.out.println("Camp Commitee Slots: ");
        Integer commiteeSlots = sc.nextInt();
        sc.nextLine();
        System.out.println("Short Description: ");
        String result = sc.nextLine();
        System.out.println("Camp created successfully!");
        System.out.println("--------------------------\n");

        camp.setName(campName);
        camp.setDateofCamp(dateOfCamp);
        camp.setRegistrationClosing(registeraionClosing);
        camp.setGrouping(grouping);
        camp.setLocation(location);
        camp.setTotalSlots(totalSlots);
        camp.setCommiteeSlots(commiteeSlots);
        camp.setShortDescription(result);
        camp.setVisiblity(true);
        camp.setNTU(grouping);

        return camp;
    }
}

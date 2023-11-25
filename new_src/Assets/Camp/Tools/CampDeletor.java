package Assets.Camp.Tools;

import Assets.Camp.Camp;
import Assets.Camp.CampViewer;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CampDeletor {
    public static void delCamp(ArrayList<Camp> campList, User currentUser)
    {
        if (!CampViewer.viewMyCreatedCamps(campList, currentUser))
        {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Select Camp to Delete:");
        System.out.println("----------------------\n");
        Integer campIndex = sc.nextInt();
        campList.remove(campIndex.intValue() - 1);
        System.out.println("--------------------------");
        System.out.println("Camp deleted successfully!");
        System.out.println("--------------------------\n");
    }
}

package Assets.Tools;

import Assets.Camp.Camp;
import Assets.Roles.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CampReport {
    public static void generateList(ArrayList<Camp> campList) {
        if (campList.isEmpty()) {
            System.out.println("There are no camps to generate a report on currently!");
        } else {
            System.out.println("---- Which camp would you like to generate Report on? ----");
            for (int i = 0; i < campList.size(); i++) {
                System.out.println((i + 1) + ". " + campList.get(i).getName());
            }
            Scanner sc = new Scanner(System.in);
            Camp campChoice = campList.get(sc.nextInt() - 1);

            /*------------------------Filter Selection ----------------------------------*/
            int choice;
            ArrayList<String> list = new ArrayList<>(Arrays.asList("Student", "CampCommittee", "Staff"));
            while (true) {
                if (list.size() == 0) {
                    System.out.println("------You Have Removed All Possible Filters---------------!");
                    break;
                }
                System.out.println("----Filter (Select to remove/Filter) (Select 4 to Confirm) ----");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                choice = sc.nextInt();
                if (choice == 4)
                    break;
                list.remove(choice - 1);
            }


            /*---------------------------Pacing Filtered into a new ArrayList---------------------------*/
            ArrayList<User> filteredList = new ArrayList<User>();
            for (User user : campChoice.getAttendanceList()) {
                if (list.contains(user.getRole()))
                    filteredList.add(user);
            }

            /*----------------------------------Printing it into a .txt File-----------------------------*/
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(campChoice.getName() + ".txt"))) {
                writer.write("------------------------------------ Camp Report ------------------------------------");
                writer.newLine();
                writer.write("Camp Name: " + campChoice.getName());
                writer.newLine();
                writer.write("Camp Date: " + campChoice.getDateofCamp());
                writer.newLine();
                writer.write("Camp Location: " + campChoice.getLocation());
                writer.newLine();
                writer.write("Camp Description: " + campChoice.getShortDescription());
                writer.newLine();
                writer.write("Camp Slots: " + campChoice.getTotalSlots() + " / " + campChoice.getAvailableSlots());
                writer.newLine();
                writer.write("------------------------------------ Attendance List ------------------------------------");
                writer.newLine();
                writer.write("Name, Role, ");
                writer.newLine();
                for (User user : filteredList) {
                    writer.write(user.getName() + ", " + user.getRole() + ", ");
                    writer.newLine();
                }
                System.out.println("Data saved to " + campChoice.getName() + ".txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

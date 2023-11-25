package Assets.Camp;

import Assets.Roles.Student;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Objects;

public class CampViewer {
    public static void viewAllCamps(ArrayList<Camp> campList) {
        if (campList.isEmpty()) 
        {
            System.out.println("-----------------------------");
            System.out.println("There are no camps currently!");
            System.out.println("-----------------------------\n");
        }

        else
        {
            for (int i = 0; i < campList.size(); i++) 
            {
                System.out.println("-----------------------------");
                System.out.println(i + 1 + ". " + campList.get(i).getName());
                System.out.println("-----------------------------\n");
            }
        }
    }

    public static Boolean viewMyCreatedCamps(ArrayList<Camp> campList, User currentUser) {
        int x = 0;
        for (int i = 0; i < campList.size(); i++) {
            if (Objects.equals(campList.get(i).getCreatedBy(), currentUser)) 
            {
                System.out.println("-----------------------------");
                System.out.println(i + 1 + ". " + campList.get(i).getName());
                System.out.println("-----------------------------\n");
                x = 1;
            }
        }

        if (x == 0) 
        {
            System.out.println("-------------------------------");
            System.out.println("You have not created any camps!");
            System.out.println("-------------------------------\n");
            return false;
        }

        return true;
    }

    public static void showAllVisibleCamp(ArrayList<Camp> campList, Student currentUser) {
        int x = 0;
        for (int i = 0; i < campList.size(); i++) {
            if (campList.get(i).getVisiblity() && campList.get(i).getNTU() || campList.get(i).getVisiblity() && Objects.equals(campList.get(i).getGrouping(), currentUser.getFaculty())) 
            {
                System.out.println("---------------------------------------");
                System.out.println((i + 1) + ". " + campList.get(i).getName() + " " + campList.get(i).getAvailableSlots() + "/" + campList.get(i).getTotalSlots());
                System.out.println("---------------------------------------\n");
                x = 1;
            }
        }
        if (x == 0) 
        {
            System.out.println("---------------------------------------");
            System.out.println("There are no camps available currently!");
            System.out.println("---------------------------------------\n");
        }
    }


    public static Boolean showAvailableCamp(ArrayList<Camp> campList, Student currentStudent) 
    {
        int i = 1;
        int x = 0;
        for (Camp camp : campList) {
            if (camp.getAvailableSlots() > 0 && camp.getVisiblity() && camp.getNTU() || camp.getAvailableSlots() > 0 && camp.getVisiblity() && Objects.equals(camp.getGrouping(), currentStudent.getFaculty())) 
            {
                System.out.println("-----------------------------");
                System.out.println((i) + ". " + camp.getName());
                System.out.println("-----------------------------\n");

                i++;
                x = 1;
            }
        }
        if (x == 0) 
        {
            System.out.println("---------------------------------------");
            System.out.println("There are no available camps currently!");
            System.out.println("---------------------------------------\n");
            return false;
        }
        return true;
    }

    public static Boolean showMyRegisteredCamp(Student currentUser) 
    {
        int i = 1;
        int x = 0;
        for (Camp camp : currentUser.getStudentCampList()) 
        {
            System.out.println("------------------------------------------");
            System.out.println((i) + ". " + camp.getName());
            System.out.println("------------------------------------------\n");
            i++;
            x = 1;
        }

        if (x == 0) 
        {
            System.out.println("------------------------------------------");
            System.out.println("You have not registered for any camps yet!");
            System.out.println("------------------------------------------\n");
            return false;
        }
        return true;
    }
}

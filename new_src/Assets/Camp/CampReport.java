package new_src.Assets.Camp;
import new_src.Assets.Roles.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CampReport 
{
    public static  void generateList(ArrayList<Camp> campList)
    {
        System.out.println("---- Which camp would you like to generate Report on? ----");
        for(int i=0;i<campList.size();i++)
        {
            System.out.println((i+1) +". "+ campList.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        Camp campChoice = campList.get(sc.nextInt());

        /*------------------------Filter Selection ----------------------------------*/
        int choice;
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Student", "CampCommitee", "Staff"));
        while(true)
        {
            if(list.size()==0)
            {
                System.out.println("------You Have Removed All Possible Filters---------------!");
                break;
            }
            System.out.println("----Filter (Select to remove/Filter) (Select 4 to Confirm) ----");
            for(int i = 0; i < list.size(); i++)
            {
                System.out.println((i + 1) + ". " + list.get(i));
            }
            choice = sc.nextInt();
            if (choice == 4) 
                break;
            list.remove(choice - 1);
        }
        
        /*---------------------------Pacing Filtered into a new ArrayList---------------------------*/
        ArrayList<User> filteredList = new ArrayList<User>();
        for(User user: campChoice.getAttendanceList())
        {
            if(list.contains(user.getRole()))
                filteredList.add(user);
        }

        /*----------------------------------Printing it into a .txt File-----------------------------*/
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(campChoice.getName() + ".txt"))) 
        {
            oos.writeObject(filteredList);
            System.out.println("ArrayList of Student objects saved to " + campChoice.getName() + ".txt");
        } 

        catch (IOException e) 
        {
            e.printStackTrace();
        }
        sc.close();
    }
}

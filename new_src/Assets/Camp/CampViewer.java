package Assets.Camp;
import Assets.Roles.*;

import java.util.ArrayList;
import java.util.Objects;

public class CampViewer 
{
    public static void viewAllCamps(ArrayList<Camp> campList)
    {
        if(campList.isEmpty()){
            System.out.println("There are no camps currently!\n");
            return;
        }
        for(int i=0; i< campList.size(); i++)
        {
            System.out.println(i+1 + ". " + campList.get(i).getName());
        }
    }

    public static Boolean viewMyCreatedCamps(ArrayList<Camp> campList, User currentUser)
    {
        int x = 0;
        for(int i=0; i< campList.size(); i++){
            if(Objects.equals(campList.get(i).getCreatedBy(), currentUser)){
                System.out.println(i+1 + ". " + campList.get(i).getName());
                x = 1;
            }
        }
        if(x == 0){
            System.out.println("You have not created any camps!\n");
            return false;
        }
        return true;
    }

    public static void showAllVisibleCamp(ArrayList<Camp> campList, Student currentUser)
    {
        int x = 0;
        for(int i=0; i< campList.size(); i++)
        {
            if(campList.get(i).getVisiblity() && campList.get(i).getNTU() || campList.get(i).getVisiblity() && Objects.equals(campList.get(i).getGrouping(), currentUser.getFaculty()))
            {
                System.out.println((i+1) + ". " + campList.get(i).getName() + " " + campList.get(i).getAvailableSlots() + "/" + campList.get(i).getTotalSlots());
                x = 1;
            }
        }
        if(x==0){
            System.out.println("There are no camps available currently!");
        }
    }


    public static Boolean showAvailableCamp(ArrayList<Camp> campList, Student currentStudent)
    {
        int i=1;
        int x=0;
        for (Camp camp : campList) 
        {
            if (camp.getAvailableSlots() > 0 && camp.getVisiblity() && camp.getNTU() || camp.getAvailableSlots() > 0 && camp.getVisiblity() && Objects.equals(camp.getGrouping(), currentStudent.getFaculty())) 
            {
                System.out.println((i)+". "+camp.getName());
                i++;
                x=1;
            }
        }
        if(x==0){
            System.out.println("There are no available camps currently!\n");
            return false;
        }
        return true;
    }

    public static Boolean showMyRegisteredCamp(Student currentUser)
    {
        int i=1;
        int x=0;
        for (Camp camp : currentUser.getStudentCampList()) 
        {
            System.out.println((i)+". "+camp.getName());
            i++;
            x=1;
        }
        if(x==0){
            System.out.println("You have not registered for any camps yet!\n");
            return false;
        }
        return true;
    }
}

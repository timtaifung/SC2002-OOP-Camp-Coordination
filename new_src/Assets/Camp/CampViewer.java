package new_src.Assets.Camp;
import new_src.Assets.Roles.*;

import java.util.ArrayList;
import java.util.Objects;

public class CampViewer 
{
    public static void viewAllCamps(ArrayList<Camp> campList)
    {
        for(int i=0; i< campList.size(); i++)
        {
            System.out.println(campList.get(i).getName());
        }
    }

    public static void viewMyCreatedCamps(ArrayList<Camp> campList, User currentUser)
    {
        for(int i=0; i< campList.size()-1; i++){
            if(Objects.equals(campList.get(i).getCreatedBy(), currentUser)){
                System.out.println(campList.get(i));
            }
        }
    }

    public static void showAllVisibleCamp(ArrayList<Camp> campList, Student currentUser)
    {
        for(int i=0; i< campList.size(); i++)
        {
            if(campList.get(i).getVisiblity() && campList.get(i).getNTU() || campList.get(i).getVisiblity() && Objects.equals(campList.get(i).getGrouping(), currentUser.getFaculty()))
            {
                System.out.println((i+1) + ". " + campList.get(i).getName() + " " + campList.get(i).getAvailableSlots() + "/" + campList.get(i).getTotalSlots());
            }
        }
    }


    public static void showAvailableCamp(ArrayList<Camp> campList, Student currentStudent)
    {
        int i=1;
        for (Camp camp : campList) 
        {
            if (camp.getAvailableSlots() > 0 && camp.getVisiblity() && camp.getNTU() || camp.getAvailableSlots() > 0 && camp.getVisiblity() && Objects.equals(camp.getGrouping(), currentStudent.getFaculty())) 
            {
                System.out.println((i)+". "+camp.getName());
                i++;
            }
        }
    }

    public static void showMyRegisteredCamp(Student currentUser)
    {
        int i=1;
        for (Camp camp : currentUser.getStudentCampList()) 
        {
            System.out.println((i)+". "+camp.getName());
            i++;
        }
    }
}

package Camp;
import Camp.Camp;
import Roles.User;

import java.util.ArrayList;

public class StaffCampViewAll {

    public static void viewAllCamps(ArrayList<Camp> campList){
        for(int i=0; i< campList.size()-1; i++){
            System.out.println(campList.get(i));
        }
    }

    public static void viewOwnCamps(ArrayList<Camp> campList){
        for(int j=0; j< campList.size()-1; j++){
        }
    }

}


    


/*methods relating to camps
o toggle visibility
o view all camps
o view own camps
o view remaining slots
o view attendees
o view camp committee */

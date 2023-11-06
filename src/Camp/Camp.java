package Camp;

import Roles.User;

import java.util.ArrayList;

public class Camp {
    private User createdBy;
    private String name;
    private ArrayList<User> attendanceList;
    public Camp(User createdBy){
        this.attendanceList= new ArrayList<User>();
        this.createdBy=createdBy;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<User> getAttendanceList(){
        return this.attendanceList;
    }


}



/*create camp need to include: 
o Camp Name
o Dates
o Registration closing date
o User group this camp is open to own school or whole NTU
o Location
o Total Slots
o Camp Committee Slots (max 10)
o Description
o Staff in charge (automatically tied to the staff who created it) */
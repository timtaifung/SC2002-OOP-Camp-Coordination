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

package Camp;

import Roles.User;

import java.util.ArrayList;
import java.util.Objects;

public class Camp {
    private User createdBy;
    private Boolean visiblity;
    private String name;
    private ArrayList<User> attendanceList;
    private ArrayList<User> commiteeList;
    private String dateOfCamp;
    private String registeraionClosing;
    private String grouping;
    private Boolean NTU;  //if grouping==NTU, NTu == True
    private String location;
    private Integer totalSlots;
    private Integer availableSlots;
    private Integer availableCommiteeSlots;
    private Integer commiteeSlots;
    private String shortDescription;
    public Camp(User createdBy){
        this.attendanceList= new ArrayList<User>();
        this.commiteeList = new ArrayList<User>();
        this.createdBy=createdBy;
        this.visiblity = true;
        this.availableSlots= this.totalSlots;
        this.NTU = false;

    }
    public String getName(){
        return this.name;
    }
    public ArrayList<User> getAttendanceList(){
        return this.attendanceList;
    }
    public User getCreatedBy(){
        return this.createdBy;
    }
    public String getDateofCamp(){return this.dateOfCamp;}
    public String getRegisteraionClosing(){return this.registeraionClosing;}
    public String getGrouping(){return this.grouping;}
    public Boolean getNTU(){return this.NTU;}
    public String getLocation(){return this.location;}
    public Integer getTotalSlots(){return this.totalSlots;}
    public Integer getCommiteeSlots(){return this.commiteeSlots;}
    public String getShortDescription(){return this.shortDescription;}
    public Boolean getVisiblity(){return this.visiblity;}
    public Integer getAvailableSlots(){return this.totalSlots-this.getAttendanceList().size();}
    public ArrayList<User> getCommiteeList(){return this.commiteeList;}
    public Integer getAvailableCommiteeSlots(){return this.commiteeSlots-this.getCommiteeList().size();}

    public void setName(String name){
        this.name=name;
    }
    public void setDateofCamp(String dateOfCamp){
        this.dateOfCamp=dateOfCamp;
    }
    public void setRegisteraionClosing(String registeraionClosing){
        this.registeraionClosing=registeraionClosing;
    }
    public void setGrouping(String grouping){
        this.grouping=grouping;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setTotalSlots(Integer totalSlots){
        this.totalSlots=totalSlots;
    }
    public void setCommiteeSlots(Integer commiteeSlots){
        this.commiteeSlots=commiteeSlots;
        if(this.commiteeSlots>this.totalSlots){
            System.out.println("Committee slots cannot be more than total slots");
        }
    }
    public void setNTU(String grouping){
        this.NTU= Objects.equals(grouping, "NTU");

    }
    public void setShortDescription(String shortDescription){
        this.shortDescription=shortDescription;
    }
    public void setVisiblity(Boolean visiblity){
        this.visiblity=visiblity;
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
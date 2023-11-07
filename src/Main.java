import Camp.Camp;
import Helper.ExcelReader;
import Helper.LoginHelper.Login;
import QnA.Enquires.Enquiry;
import QnA.Suggestions.Suggestion;
import Roles.StaffCampMenu;
import Roles.User;
import Menu.UserCampMenu;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args){
        /* ---------------Declaration of Databases ----------------------*/
        String excelFile = "C:\\Users\\arthu\\IdeaProjects\\SC2002_Project\\SC2002_Camp_Coordination\\src\\staff_list.xlsx";
        ArrayList<User> userList = ExcelReader.read(excelFile);
        ArrayList<Camp> campList = new ArrayList<Camp>();
        ArrayList<Enquiry> enquiryList = new ArrayList<Enquiry>();
        ArrayList<Suggestion> suggestionList = new ArrayList<Suggestion>();

        /* --------------- Login Page View ----------------------*/
        User currentUser = Login.login(userList);
        while (currentUser.getUserID()=="fail"){
            System.out.println("Wrong Username / Password!");
            currentUser = Login.login(userList);
        }

        /*-----------------Main Menu Page -----------------------*/
        switch(currentUser.getRole().toString()){
            case "Student":
                UserCampMenu.menu(currentUser);
                break;
            case "Staff":
                StaffCampMenu.mainMenu(currentUser);
                break;
            case "CampCommitee":

        }
    }
}

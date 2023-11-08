package new_src;
import Camp.Camp;
import Helper.ExcelReader;
import Helper.LoginHelper.Login;
import Menu.StaffCampMenu;
import QnA.Enquires.Enquiry;
import QnA.Suggestions.Suggestion;
import Roles.Student;
import Roles.User;
import Menu.StudentMenu;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args){
        /* ---------------Declaration of Databases ----------------------*/
        String excelFile = "staff_list.xlsx";
        ArrayList<User> userList = ExcelReader.read(excelFile);
        ArrayList<Camp> campList = new ArrayList<Camp>();
        ArrayList<Enquiry> enquiryList = new ArrayList<Enquiry>();
        ArrayList<Suggestion> suggestionList = new ArrayList<Suggestion>();

        /* --------------- Login Page View ----------------------*/
        while(true){
            User currentUser = Login.login(userList);

            while (currentUser.getUserID()=="fail"){
                System.out.println("Wrong Username / Password!");
                currentUser = Login.login(userList);
            }

            /*-----------------Main Menu Page -----------------------*/
            switch(currentUser.getRole().toString()){
                case "Student":
                    Student currentUserStudent = (Student) currentUser;
                    StudentMenu.menu(currentUserStudent, campList, enquiryList, suggestionList);
                    break;
                case "Staff":
                    StaffCampMenu.menu(currentUser, campList, enquiryList, suggestionList);
                    break;
                case "CampCommitee":
            }
            System.out.println("Successfully logged out!");
        }
    }
}

package new_src;
import new_src.Assets.ExcelReader;
import new_src.Assets.Roles.*;
import new_src.Assets.Camp.Camp;
import new_src.Assets.QnA.Enquiry.Enquiry;
import new_src.Assets.QnA.Suggestion.Suggestion;
import new_src.Assets.Login.Login;
import new_src.Menu.*;

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

            while (currentUser.getUserID()=="fail")
            {
                System.out.println("Wrong Username / Password!");
                currentUser = Login.login(userList);
            }

            /*-----------------Main Menu Page -----------------------*/
            switch(currentUser.getRole().toString()){
                case "Student":
                    Student currentUserStudent = (Student) currentUser;
                    StudentCampMenu.menu(currentUserStudent, campList, enquiryList, suggestionList);
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

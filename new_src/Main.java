import Assets.Camp.Camp;
import Assets.ExcelReader;
import Assets.Login.Login;
import Assets.QnA.Enquiry.Enquiry;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Assets.Roles.User;
import Menu.MainMenu;
import Menu.StaffCampMenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* ---------------Declaration of Databases ----------------------*/
        String excelFile = "new_src/database.xlsx";
        ArrayList<User> userList = ExcelReader.read(excelFile);
        ArrayList<Camp> campList = new ArrayList<Camp>();
        ArrayList<CampCommittee> campCommitteeList = new ArrayList<CampCommittee>();
        ArrayList<Enquiry> enquiryList = new ArrayList<Enquiry>();
        ArrayList<Suggestion> suggestionList = new ArrayList<Suggestion>();

        /* --------------- Login Page View ----------------------*/
        while (true) {
            User currentUser = Login.login(userList);

            while (currentUser.getUserID() == "fail") {
                System.out.println("Wrong Username / Password!");
                currentUser = Login.login(userList);
            }
            System.out.println("Checkpoint");
            /*-----------------Main Menu Page -----------------------*/
            switch (currentUser.getRole().toString()) {
                case "Student":
                    Student currentUserStudent = (Student) currentUser;
                    MainMenu.menu(currentUserStudent, campList, enquiryList, suggestionList, campCommitteeList);
                    break;

                case "Staff":
                    StaffCampMenu.menu(currentUser, campList, enquiryList, suggestionList);
                    break;
            }
        }
    }
}

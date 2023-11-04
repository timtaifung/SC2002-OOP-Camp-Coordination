import Helper.Database.ExcelReader;
import Roles.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String excelFile = "C:\\Users\\arthu\\IdeaProjects\\SC2002_Project\\SC2002_Camp_Coordination\\src\\staff_list.xlsx";
        ArrayList<User> userList = ExcelReader.read(excelFile);
    }
}

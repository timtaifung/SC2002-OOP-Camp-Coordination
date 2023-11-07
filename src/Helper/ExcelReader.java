package Helper;

import java.io.IOException;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;


import Roles.CampCommitee;
import Roles.Staff;
import Roles.Student;
import Roles.User;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Objects;


public class ExcelReader {
    public static ArrayList<User> read(String excelFile) {
        ArrayList<User> userList = new ArrayList<User>();
        try (FileInputStream fis = new FileInputStream(new File(excelFile));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                Cell nameCell = row.getCell(0);
                Cell emailCell = row.getCell(1);
                Cell facultyCell = row.getCell(2);
                Cell roleCell =row.getCell(3);
                Cell isCampCommiteeCell = row.getCell(4);

                if (nameCell != null && emailCell != null && facultyCell !=null) {
                    String name = nameCell.toString();
                    String email = emailCell.toString();
                    String faculty = facultyCell.toString();
                    String role = roleCell.toString();
                    String commiteeIdentifier = isCampCommiteeCell.toString();
                    boolean isCampCommitee;
                    if(commiteeIdentifier == "TRUE"){
                        isCampCommitee = true;
                    }else{
                        isCampCommitee = false;
                    }
                    if(Objects.equals(name, "")) break;
                    switch(role){
                        case "Student":
                            if(isCampCommitee){
                                CampCommitee campCommitee = new CampCommitee(name,email,faculty,role);
                                userList.add(campCommitee);
                            }else{
                                Student student = new Student(name,email,faculty,role);
                                userList.add(student);
                            }
                            break;
                        case "Staff":
                            Staff staff = new Staff(name,email,faculty,role);
                            userList.add(staff);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Display the users stored in the ArrayList
        for (User user : userList) {
            System.out.println("User ID: " + user.getUserID());
        }

        return userList;
    }
}

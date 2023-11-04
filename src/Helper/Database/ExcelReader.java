package Helper.Database;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import Roles.User;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.Objects;


public class ExcelReader {
    public static ArrayList<User> read(String excelFile) {
        ArrayList<User> userList = new ArrayList<User>();
        try (FileInputStream fis = new FileInputStream(new File(excelFile));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

            for (Row row : sheet) {
                Cell nameCell = row.getCell(0);
                Cell emailCell = row.getCell(1);
                Cell facultyCell = row.getCell(1);

                if (nameCell != null && emailCell != null && facultyCell !=null) {
                    String name = nameCell.toString();
                    String email = emailCell.toString();
                    String faculty = facultyCell.toString();
                    if(Objects.equals(name, "")) break;
                    User user = new User(name,email,faculty);
                    userList.add(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        userList.remove(0);
        // Display the users stored in the ArrayList
        for (User user : userList) {
            System.out.println("User ID: " + user.getUserID());
        }

        return userList;
    }
}

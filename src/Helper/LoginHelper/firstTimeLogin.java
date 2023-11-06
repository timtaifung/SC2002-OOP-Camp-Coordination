package Helper.LoginHelper;

import java.util.Scanner;

import Roles.User;

public class firstTimeLogin {
    public static void firstLogin(User user){
        System.out.println("Frist Login");
        changePassword.changePassword(user);
    }
}

package Helper.LoginHelper;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Roles.User;

public class Login {
    public static User login(ArrayList<User> userList){
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String usernameInput = sc.nextLine();
        System.out.print("Password: ");
        String passwordInput = sc.nextLine();
        for(User user : userList){
            String comparatorUser =user.getUserID();
            String comparatorPassword = user.getPassword();
            if(Objects.equals(comparatorUser, usernameInput)){
                if(Objects.equals(comparatorPassword, passwordInput)){
                    if(Objects.equals(comparatorPassword, "password")){
                        firstTimeLogin.firstLogin(user);
                        return user;
                    }
                    else{
                        return user;
                    }
                }
            }
        }
        User fail = new User("fail", "fail","fail", "fail");
        return fail;
    }
}

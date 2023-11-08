package new_src.Assets.Login;
import new_src.Assets.Roles.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Login 
{
    public static User login(ArrayList<User> userList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String usernameInput = sc.nextLine();

        System.out.print("Password: ");
        String passwordInput = sc.nextLine();
        sc.close();

        for(User user : userList)
        {
            String comparatorUser = user.getUserID();
            String comparatorPassword = user.getPassword();
            
            if(Objects.equals(comparatorUser, usernameInput))
            {
                if(Objects.equals(comparatorPassword, passwordInput))
                {
                    if(Objects.equals(comparatorPassword, "password"))
                    {
                        NewLogin.firstLogin(user);
                        return user;
                    }

                    else
                    {
                        return user;
                    }
                }
            }
        }

        User fail = new User("fail", "fail","fail", "fail");
        return fail;
    }
}

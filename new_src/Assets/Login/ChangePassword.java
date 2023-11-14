package Assets.Login;
import Assets.Roles.User;

import java.util.Scanner;

public class ChangePassword {
    public static void changePassword(User user) 
    {
        boolean invalidPassword = true;

        while (invalidPassword) 
        {
            System.out.println("Please enter your new password:");
            Scanner sc = new Scanner(System.in);

            String newPasswordInput = sc.nextLine();
            if(newPasswordInput.equals(user.getPassword()))
            {
                System.out.println("New password cannot be the same as old password!\n");
            }

            else if (newPasswordInput.contains(" "))
            {
                System.out.println("Password cannot contain spaces!\n");
            }

            else 
            {
                user.setPassword(newPasswordInput);
                System.out.println("Password changed!\n");
                invalidPassword = false;
            }
        }

        // Do not close the scanner here
    }
}

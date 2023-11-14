package Assets.Login;
import Assets.Roles.User;

import java.util.Scanner;

public class ChangePassword {
    public static void changePassword(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Change Your Password:");
        boolean validPassword = false;

        while (!validPassword) {
            String newPasswordInput = sc.next();
            if(newPasswordInput == user.getPassword()) {
                System.out.println("New password cannot be the same as old password!");
            }
            if (newPasswordInput.contains(" ")){
                System.out.println("Password cannot contain spaces!");
            }
            else {
                user.setPassword(newPasswordInput);
                System.out.println("Password changed!");
                validPassword = true;
            }
        }

        // Do not close the scanner here
    }
}

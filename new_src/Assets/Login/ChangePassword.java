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

            if (!newPasswordInput.contains(" ")) {
                user.setPassword(newPasswordInput);
                validPassword = true;
            } else {
                System.out.println("Password cannot contain spaces. Try again:");
            }
        }

        // Do not close the scanner here
    }
}

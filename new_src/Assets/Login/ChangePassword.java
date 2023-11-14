package Assets.Login;
import Assets.Roles.User;

import java.util.Scanner;

public class ChangePassword 
{
    private static boolean containsSpecialCharacter(String password) 
    {
        for (char c : password.toCharArray()) 
        {
            if (!Character.isLetterOrDigit(c)) 
            {
                return true;
            }
        }
        return false;
    }

    private static boolean containsNumericCharacter(String password) 
    {
        for (char c : password.toCharArray()) 
        {
            if (Character.isDigit(c)) 
            {
                return true;
            }
        }
        return false;
    }

    public static void changePassword(User user) 
    {
        boolean invalidPassword = true;

        while (invalidPassword) 
        {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Please follow the password requirements:");
            System.out.println("1. Do not reuse the old password");
            System.out.println("2. Do not include spaces in the new password");
            System.out.println("3. Include at least one special character in the new password, eg. '*', '!', etc.");
            System.out.println("4. Include at least one numerical character in the new password");
            System.out.println("5. Passwords must be at least 6 characters long");
            System.out.println("---------------------------------------------------------------------------------\n");
            System.out.println("Please enter your new password:");

            Scanner sc = new Scanner(System.in);
            String newPasswordInput = sc.nextLine();

            if (newPasswordInput.equals(user.getPassword())) 
            {
                System.out.println("New password cannot be the same as old password!\n");
            } 

            else if (newPasswordInput.contains(" ")) 
            {
                System.out.println("Password cannot contain spaces!\n");
            } 

            else if (!containsSpecialCharacter(newPasswordInput)) 
            {
                System.out.println("Password must include at least one special character!\n");
            } 

            else if (!containsNumericCharacter(newPasswordInput)) 
            {
                System.out.println("Password must include at least one numerical character!\n");
            } 

            else if (newPasswordInput.length() < 6) 
            {
                System.out.println("Password must be at least 6 characters long!\n");
            } 

            else 
            {
                user.setPassword(newPasswordInput);
                System.out.println("Password changed!\n");
                invalidPassword = false;
            }
        }
    }
}

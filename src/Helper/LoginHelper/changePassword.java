package Helper.LoginHelper;

import java.util.Scanner;

import Roles.User;

public class changePassword {
    public static void changePassword(User user){
        System.out.println("Change Your Password:");
        Scanner sc = new Scanner(System.in);
        String newPasswordInput=sc.nextLine(); // possible to check if only 1 single string is added in
        boolean checked =false;
        while(!checked){
            if (newPasswordInput.contains(" "))
                newPasswordInput=sc.nextLine();
            else
                checked=true;
        }
        user.setPassword(newPasswordInput);
    }
}

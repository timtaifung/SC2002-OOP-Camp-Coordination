package Assets.Login;
import Assets.Roles.User;

public class NewLogin 
{
    public static void firstLogin(User user)
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("                          First Login");
        System.out.println("For security purposes, please change the default password provided");
        System.out.println("------------------------------------------------------------------\n");
        ChangePassword.changePassword(user);
    }
}

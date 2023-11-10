package Assets.Login;
import Assets.Roles.User;

public class NewLogin 
{
    public static void firstLogin(User user)
    {
        System.out.println("First Login");
        ChangePassword.changePassword(user);
    }
}

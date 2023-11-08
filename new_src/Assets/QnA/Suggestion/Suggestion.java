package new_src.Assets.QnA.Suggestion;
import new_src.Assets.QnA.Submission;
import new_src.Assets.Roles.User;

public class Suggestion extends Submission 
{
	private boolean approved;
	private boolean checked;

	public Suggestion(User currentUser) 
    {
        super(currentUser);
        this.checked = false;
    }

	public void setApprovedStatus(boolean s) 
    {
        this.approved = s; 
        this.checked = true;
    }

	public boolean getApprovedStatus() 
    {
        return this.approved;
    }

    public boolean getCheckedStatus()
    {
        return this.checked;
    }
}
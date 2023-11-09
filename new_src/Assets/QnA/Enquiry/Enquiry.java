package Assets.QnA.Enquiry;
import Assets.QnA.Submission;
import Assets.Roles.User;

public class Enquiry extends Submission
{
	private String content;
	private String reply;
	private boolean processed;

	public Enquiry(User currentUser) 
    {
        super(currentUser);
        this.processed = false;
	}

	public String getContent() 
    {
        return content;
    }

	public void setContent(String content) 
    {
        this.content = content;
    }

	public String getreply() 
    {
        return reply;
    }

	public void setreply(String reply)
    {
        this.reply = reply;
    }

	public boolean getProcessedStatus() 
    {
        return processed;
    }

	public void setProcessedStatus(boolean processed) 
    {
        this.processed = processed;
    }
}

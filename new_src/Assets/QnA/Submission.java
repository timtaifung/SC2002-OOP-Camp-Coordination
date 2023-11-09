package Assets.QnA;

import Assets.Roles.User;

public class Submission 
{
    private String title;
	private String content;
	private User createdBy;

	public Submission(User currentUser) 
    {
        this.createdBy = currentUser; 
        this.title = ""; 
        this.content = "";
    }

	public String getTitle()
    {
        return this.title;
    }

	public String getContent()
    {
        return this.content;
    }

	public User getCreatedBy()
    {
        return this.createdBy;
    }

	public void setTitle(String t)
    {
        this.title = t;
    }

	public void setContent(String c)
    {
        this.content = c;
    }

	public void setCreatedBy(User u)
    {
        this.createdBy = u;
    }
}

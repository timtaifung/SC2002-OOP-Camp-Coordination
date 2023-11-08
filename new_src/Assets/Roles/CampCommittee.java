package new_src.Assets.Roles;
import new_src.Assets.Suggestion.Suggestion;

import java.util.ArrayList;

public class CampCommittee extends Student
{
    private int point;
    private ArrayList<Suggestion> ssl;

    public CampCommittee(String name, String email, String faculty, String role) 
    {
        super(name, email, faculty, role); 
        this.point = 0;
        this.ssl = new ArrayList<Suggestion>();
    }

    public void setpoint() 
    {
		point++;
	}
	public void removepoint() 
    {
		point--;
	}
	
	public int getpoint() 
    {
		return this.point;
	}
	
	public ArrayList<Suggestion> getSuggestionList() 
    {
		return ssl;
	}

	public void setSuggestionList(ArrayList<Suggestion> s) 
    {
		this.ssl=s;
	}

	public void addToSuggestionList(Suggestion suggest) 
    {
		ssl.add(suggest);
	}
}

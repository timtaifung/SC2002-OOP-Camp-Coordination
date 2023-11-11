package Assets.Roles;
import java.util.ArrayList;

import Assets.QnA.Suggestion.Suggestion;

public class CampCommittee extends Student
{
    private int point;
    private ArrayList<Suggestion> suggestions;

    public CampCommittee(String name, String email, String faculty, String role) 
    {
        super(name, email, faculty, role); 
        this.point = 0;
        this.suggestions = new ArrayList<Suggestion>();
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
		return suggestions;
	}

	public void setSuggestionList(ArrayList<Suggestion> s) 
    {
		this.suggestions =s;
	}

	public void addToSuggestionList(Suggestion suggest) 
    {
		suggestions.add(suggest);
	}
}

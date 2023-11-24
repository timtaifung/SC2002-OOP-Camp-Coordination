package Assets.Roles;
import java.util.ArrayList;

import Assets.Camp.Camp;
import Assets.QnA.Suggestion.Suggestion;
import Assets.Roles.CampCommittee;

public class CampCommittee extends Student
{
    private int point;
    private ArrayList<Suggestion> suggestions;
	private ArrayList<CampCommittee> camps;

    public CampCommittee(Student student) 
    {
        super(student.getName(), student.getEmail(), student.getFaculty(), "CampCommittee"); 
        this.point = 0;
        this.suggestions = new ArrayList<Suggestion>();
		this.camps = new ArrayList<CampCommittee>();
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

	public ArrayList<CampCommittee> getCamps()
	{
		return this.camps;
	}
	
	public ArrayList<Suggestion> getSuggestionList() 
    {
		return suggestions;
	}

	public void addSuggestion (Suggestion s) 
    {
		this.suggestions.add(s);
	}

	public void addToSuggestionList(Suggestion suggest) 
    {
		suggestions.add(suggest);
	}
}

package Assets.Roles;

import Assets.Camp.Camp;
import Assets.QnA.Suggestion.Suggestion;

import java.util.ArrayList;

public class CampCommittee extends Student {
    private Camp camp;
    private int point;
    private ArrayList<Suggestion> suggestions;

    public CampCommittee(Student student, Camp camp) {
        super(student.getName(), student.getEmail(), student.getFaculty(), "CampCommittee");
        this.camp = camp;
        this.point = 0;
        this.suggestions = new ArrayList<Suggestion>();
    }

    public Camp getCamp() {
        return this.camp;
    }

    public void setpoint() {
        point++;
    }

    public void removepoint() {
        point--;
    }

    public int getpoint() {
        return this.point;
    }

    public ArrayList<Suggestion> getSuggestionList() {
        return suggestions;
    }

    public void addSuggestion(Suggestion s) {
        this.suggestions.add(s);
    }

    public void addToSuggestionList(Suggestion suggest) {
        suggestions.add(suggest);
    }
}

package Assets.QnA.Suggestion;

import Assets.QnA.Submission;
import Assets.Roles.User;

public class Suggestion extends Submission {
    private boolean approved;
    private boolean checked;

    public Suggestion(User currentUser) {
        super(currentUser);
        this.checked = false;
    }

    public boolean getApprovedStatus() {
        return this.approved;
    }

    public void setApprovedStatus(boolean s) {
        this.approved = s;
        this.checked = true;
    }

    public boolean getCheckedStatus() {
        return this.checked;
    }
}
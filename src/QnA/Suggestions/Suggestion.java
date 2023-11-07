package QnA.Suggestions;
import QnA.Submission;
import Roles.User;

import java.util.Scanner;

public class Suggestion extends Submission {
	private boolean approved;
	private boolean checked;

	public Suggestion(User currentUser) {super(currentUser);this.checked=false;}
	public void setApprovedStatus(boolean s) {this.approved=s; this.checked=true;}
	public boolean getApprovedStatus() {return this.approved;}

}

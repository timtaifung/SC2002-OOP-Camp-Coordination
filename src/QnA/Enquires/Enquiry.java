package QnA.Enquires;
import java.util.Scanner;
import QnA.Submission;
import Roles.User;

public class Enquiry extends Submission {
	private String content;
	private String reply;
	private boolean processed;

	public Enquiry(User currentUser) {super(currentUser);this.processed = false;}

	public String getreply() {return this.reply;}
	public void setreply(String r) {this.reply=r;}
	public void setProcessedStatus(boolean s) {this.processed=s;}
	public boolean getProcessedStatus() {return this.processed;}

}


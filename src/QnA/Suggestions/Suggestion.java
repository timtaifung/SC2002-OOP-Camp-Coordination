package QnA.Suggestions;
import QnA.Submission;
import java.util.Scanner;

public class Suggestion extends Submission {
    private String content;
	private boolean processed;
	private boolean approved;
	
	public Suggestion() {super();this.content=null; this.processed = false; this.approved = false;}
	public Suggestion(String c,boolean x,boolean z) {super(c);this.content=c;this.processed=x;this.approved= z;}
	
	
	public String getcontent() {
		return this.content;
	}
	public void setcontent(String c) {
		this.content=c;
	}
	public void setApprovalStatus(boolean s) {
		this.approved=s;
	}
	public void setProcessedStatus(boolean s) {
		this.processed=s;
	}
	public boolean getProcessedStatus() {
		return this.processed;
	}
	public void view() {
		 if(processed==false&&approved == false) {
			 super.view();
		 }
		 else if(processed==true&&approved == false) {
			 System.out.println("Your suggestion was not approved.");
			 
		 }
		 else if(processed==true&&approved == true) {
			 System.out.println("Your suggestion was approved!");
		 }
	 }
	 
	 public void edit() {
		 if(processed==false) {
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your content below:");
			String y = sc.nextLine();
			setcontent(y);
			super.edit(y);
		 }
		 else {
			 System.out.println("This function is not applicable!");
		 }
	 }
}

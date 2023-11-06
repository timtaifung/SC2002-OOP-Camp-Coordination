package QnA.Enquires;
import QnA.Submission;
import java.util.Scanner;
 
public class Enquiry extends Submission {
	private String content;
	private String reply;
	private boolean processed;
	
	public Enquiry() {super();this.content=null; this.reply =null; this.processed = false;}
	public Enquiry(String c,String r,boolean z) {super(c);this.content=c; this.reply=r; this.processed= z;}
	
	public String getreply() {
		return this.reply;
	}
	
	public void setreply(String r) {
		this.reply=r;
	}
	public String getcontent() {
		return this.content;
	}
	public void setcontent(String c) {
		this.content=c;
	}
	public void setProcessedStatus(boolean s) {
		this.processed=s;
	}
    public boolean getProcessedStatus() {
		return this.processed;
	}
	
	public void view() {
		if(processed == false) {
			 super.view();
		}
		else {
			 System.out.println("Your Enquiry was:");
			 super.view();
			 System.out.println("Reply to your enquiry: "+ getreply());
		}	 
	}
	 
	public void edit() {
		if(processed == false) {
			 
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


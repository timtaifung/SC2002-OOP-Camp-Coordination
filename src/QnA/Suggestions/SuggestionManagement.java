package QnA.Suggestions;
import java.util.Scanner;
import Roles.CampCommitee;

public class SuggestionManagement extends Suggestion {
	
	public void approveSugestion(CampCommitee c) {
		String content = getcontent();
		System.out.println("The suggestion is: "+ content);
		Scanner sc = new Scanner(System.in);
		System.out.println("Selct your choice:");
		System.out.println("1. Approve");
		System.out.println("2. Reject");
		int y = sc.nextInt();
		
		if(y==1) {
			setProcessedStatus(true);
			setApprovalStatus(true);
			c.setpoint();
		}
		else if(y==2) {
			setProcessedStatus(true);
			setApprovalStatus(false);
		}
		System.out.println("Approval updated!");
		
	}
	

}
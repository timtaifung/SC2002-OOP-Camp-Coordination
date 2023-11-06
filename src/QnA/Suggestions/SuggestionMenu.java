package QnA.Suggestions;
import Roles.CampCommitee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SuggestionMenu extends Suggestion{

	public  void mainSuggestionMenu(CampCommitee student) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your options:");
		System.out.println("1. Submit");
		System.out.println("2. View");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		choice=sc.nextInt();
		
		switch(choice) {

		case 1:
			System.out.println("Enter your suggestion:");
			Scanner in = new Scanner(System.in);
			String y = in.nextLine();
			Suggestion s = new Suggestion(y,false,false);
			student.addToSuggestionList(s);
			student.setpoint();
			System.out.println("Suggestion submitted!");
			break;	
		case 2:
			for (Suggestion en : student.getSuggestionList()) {
			    en.view(); 
			}
			break;
		case 3:
			Scanner inp = new Scanner(System.in);
			for (Suggestion en : student.getSuggestionList()) {
                if(en.getProcessedStatus()==false){
                    en.view();
                    System.out.println("Is this the suggestion you want to edit?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int x =inp.nextInt();
                    if(x==1){
                        en.edit();
                        
                     }
                    else{
                       continue;
                    }
                    continue;
                }
                else {
                    continue;
                }
			}

			break;
		case 4:
			ArrayList<Suggestion> suggestionToRemove = new ArrayList<>();
			Scanner c = new Scanner(System.in);
			
			Iterator<Suggestion> iterator = student.getSuggestionList().iterator();
			while (iterator.hasNext()) {
				Suggestion en = iterator.next();
			    if (!en.getProcessedStatus()) {
			        en.view();
			        System.out.println("Is this the suggestion you want to delete?");
			        System.out.println("1. Yes");
			        System.out.println("2. No");
			        int x = c.nextInt();

			        if (x == 1) {
			        	student.removepoint();
			        	suggestionToRemove.add(en);
			        }
			    }
			}

			student.getEnquiryList().removeAll(suggestionToRemove);
			break;
			
		default:
			break;
		}
        
    }

}
package Menu;
import QnA.Enquires.Enquiry;
import Roles.Student;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentEnquiryMenu extends Enquiry {

    public static void MainEnquiryMenu(Student student){
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
			System.out.println("Enter your enquiry:");
			Scanner in = new Scanner(System.in);
			String y = in.nextLine();
			Enquiry e = new Enquiry(y,null,false);
			student.addToEnquiryList(e);
			System.out.println("Enquiry submitted!");
			break;	
		case 2:
			for (Enquiry en : student.getEnquiryList()) {
			    en.view(); 
			}
			break;
		case 3:
			Scanner inp = new Scanner(System.in);
			for (Enquiry en : student.getEnquiryList()) {
                if(en.getProcessedStatus()==false){
                    en.view();
                    System.out.println("Is this the enquiry you want to edit?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int x =inp.nextInt();
                    if(x==1){
                        en.edit();
                     }
                    else{
                        continue;
                    }
                }
                else {
                    continue;
                }
			}
			break;
		case 4:
			ArrayList<Enquiry> enquiriesToRemove = new ArrayList<>();
			Scanner c = new Scanner(System.in);
			
			Iterator<Enquiry> iterator = student.getEnquiryList().iterator();
			while (iterator.hasNext()) {
			    Enquiry en = iterator.next();
			    if (!en.getProcessedStatus()) {
			        en.view();
			        System.out.println("Is this the enquiry you want to delete?");
			        System.out.println("1. Yes");
			        System.out.println("2. No");
			        int x = c.nextInt();

			        if (x == 1) {
			            enquiriesToRemove.add(en);
			        }
			    }
			}

			student.getEnquiryList().removeAll(enquiriesToRemove);
			

			break;
			
		default:
			break;
		}
        
    }

}
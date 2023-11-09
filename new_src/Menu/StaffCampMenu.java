package Menu;
import java.util.ArrayList;
import java.util.Scanner;

import Assets.Camp.*;
import Assets.Roles.*;
import Assets.QnA.Enquiry.*;
import Assets.QnA.Suggestion.*;

public class StaffCampMenu 
{
    private static final Scanner sc = new Scanner(System.in);

	private static void displayStaffCampMenu(){
		System.out.println("-------------------Camps-------------------");
		System.out.println("\nCamps");
    	System.out.println("2. View all Camps");
		System.out.println("3. View own Camps");
    	System.out.println("4. Create new Camp");
    	System.out.println("5. Edit/Delete camp");

		System.out.println("-------------------QnA-------------------");
    	System.out.println("\nEnquiries and Suggestions");
    	System.out.println("6. View/Reply Enquiries");
    	System.out.println("7. View/Approve Suggestions");

		System.out.println("-------------------Reports-------------------");
    	System.out.println("\nReports");
    	System.out.println("8. Generate reports");
    	System.out.println("9. Logout");
		

	}

    public static void menu(User currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
    	int choice1, choice2;
    	
    	do {
    		System.out.println("Staff Menu:");
			System.out.println("-------------------Personal Details-------------------");
    		System.out.println("1. Change password");


    		displayStaffCampMenu();
    		
    		choice1 = sc.nextInt();  
    		if(choice1 == 9) {
				System.out.println("Successfully logged out!");
				return;
			}
    		switch (choice1) {
    		case 1:
    			System.out.println("Staff -> Change Password");
				System.out.print("Input new Password: ");
				String passwordInput = sc.nextLine();
				currentUser.setPassword(passwordInput);
				System.out.println("Password reset successfully!");
				break;
    		case 2:
    			System.out.println("Staff -> View All Camps");
    			CampViewer.viewAllCamps(campList);
    			break;

			case 3:
				System.out.println("Staff -> View my Created Camp");
                CampViewer.viewMyCreatedCamps(campList, currentUser);
				break;

    		case 4:
                System.out.println("Staff -> Create Camp");
				campList.add(CampManager.createCamp(currentUser));					
    			break;

    		case 5:
				do{
					System.out.println("1. Edit Camp");
    				System.out.println("2. Delete Camp");
    				System.out.println("3. Back to homepage");

					choice2 = sc.nextInt();
					switch (choice2) {
						case 1:
							System.out.println("Staff -> Edit Camp");
							CampManager.editCamp(campList, currentUser);							
							break;
						case 2:
							System.out.println("Staff -> Delete Camp");
							CampManager.delCamp(campList, currentUser);
							break;
						case 3:
							break;
					
						default:
							System.out.println("Invalid choice! Please choose again!");
							break;
					}
				}while (choice2 != 3);

				
    		case 6:
    			System.out.println("Staff -> View/Reply Enquiries");
				EnquiryViewer.getAllEnquiry(enquiryList);
				System.out.println("Select an enquiry to reply to:");
				int eChoice = sc.nextInt();
				Enquiry currentEnquiry = enquiryList.get(eChoice - 1);
				EnquiryManager.replyEnquiry(currentEnquiry);
    			break;
    					
    		case 7:
    			System.out.println("Staff -> View/Reply Suggestions");
                SuggestionViewer.getAllSuggestion(suggestionList);
				System.out.println("Select a suggestion to approve/reject:");
				int sChoice = sc.nextInt();
				Suggestion currentSuggestion = suggestionList.get(sChoice-1);
				SuggestionManager.approveSuggestion(currentSuggestion);
    			break;
    					
    		case 8:
    			System.out.println("Staff -> Generate reports");
				CampReport.generateList(campList);
                CampReport.generateList(campList);
				break;
    					
    		case 9:
    			System.out.println("Leaving staff menu");
    			return;
    					
    		default: 
    			System.out.println("Invalid choice! Please choose again!");
    			break;	
    			
    		}
    	}
    	while(choice1 != 9);
	}
}

package Menu;

import java.util.ArrayList;
import java.util.Scanner;
import Camp.Camp;
import Camp.CampHelper;

import static Camp.CampHelper.createCamp;

import QnA.Enquires.Enquiry;
import QnA.Suggestions.Suggestion;
import Roles.User;

public class StaffCampMenu {
    
    private static final Scanner sc = new Scanner(System.in);

    public static void menu(User currentUser, ArrayList<Camp> campList, ArrayList<Enquiry> enquiryList, ArrayList<Suggestion> suggestionList){
    	int choice1, choice2;
    	boolean reverse = false;
    	
    	do {
    		System.out.println("Staff Menu:");
    		System.out.println("1. Change password");
    		
    		System.out.println("\nCamps");
    		System.out.println("2. View all Camps");
    		System.out.println("3. Create new Camp");
    		System.out.println("4. Edit/Delete camp");
    		System.out.println("5. Toggle Camp Visibility");
    		System.out.println("6. View my Created Camps");
    		
    		System.out.println("\nEnquiries and Suggestions");
    		System.out.println("7. View/Reply Enquiries");
    		System.out.println("8. View/Approve Suggestions");
    		
    		System.out.println("\nReports");
    		System.out.println("9. Generate reports");
    		System.out.println("0. Exit");
    		
    		choice1 = sc.nextInt();  
    		
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
    			CampHelper.viewAllCamps(campList);
    			break;

    		case 3:
    			do {
                    System.out.println("Staff -> Create/Edit/Delete Camp");
					System.out.println("1. Create Camp");
    				System.out.println("2. Edit Camp");
    				System.out.println("3. Delete Camp");
    				System.out.println("4. Back to homepage");
    				choice2 = sc.nextInt();
    				switch (choice2) {
						case 1:
							System.out.println("Staff -> Create/Edit/Delete Camp -> Create Camp");
							campList.add(createCamp(currentUser));
						case 2:
    						System.out.println("Staff -> Edit/Delete Camp -> Edit Camp");
                            CampHelper.editCamp(campList, currentUser);
    						break;
    					case 3:
                            System.out.println("Staff -> Edit/Delete Camp -> Delete Camp");
    						CampHelper.delCamp(campList, currentUser);
    						break;
    					case 4:
    						reverse = true;
    						break;
    					default:
    						System.out.println("Invalid choice! Please choose again!");
    						break;
    				}
                    if (choice2 == 1 || choice2 == 2) {
							CommonView.pressEnterToContinue();
    			}while (reverse == false);
    			break;
    		case 5:
    			System.out.println("Staff -> View my Created Camp");
                CampHelper.viewMyCreatedCamps(campList, currentUser);
    					
    		case 6:
    			System.out.println("Staff -> View/Reply Enquiries");

    			break;
    					
    		case 7:
    			System.out.println("Staff -> View/Reply Suggestions");
                SuggestionMenu suggestionMenu = new SuggestionMenu();
    			suggstionMenu = run.SuggestionMenu();
    			break;
    					
    		case 8:
    			System.out.println("Staff -> Generate reports");
                Helper.generateList();
    					
    		case 0:
    			System.out.println("Leaving staff menu");
    			return;
    					
    		default: 
    			System.out.println("Invalid choice! Please choose again!");
    			break;	
    			
    	}
        if (choice >= 2 && choice <9) {
				CommonView.pressEnterToContinue();
    		
    }while(true);
    	}
    }
    
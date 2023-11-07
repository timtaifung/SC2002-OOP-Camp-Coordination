package Roles;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Camp.CampMenu;
import Camp.Camp;
import Camp.CampView;
import Helper.LoginHelper.changePassword;
import Helper.GenerateList;
import QnA.Enquiries.Enquiry;
import QnA.Enquiries.EnquiryManagement;
import QnA;Enquiries.EnquiryMenu;
import QnA.Suggestions.Suggestion;
import QnA.Suggestions.SuggestionManagement;
import QnA.Suggestions.SuggestionMenu;
import QnA.Submission;
import Roles.Staff;





public class StaffMainMenu extends UserMenu{
    
    private static final Scanner sc = new Scanner(System.in);

    public StaffMenu() {}
    
    public void start() {
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
                if(changePassword()) {
    				//method to restart session again so classname.methodname
                    Login.login();
    				System.out.println("Password reset successfully!");
    			    System.out.println("Please login again");
    			return;
    			}
    		case 2:
    			System.out.println("Staff -> View All Camps");
    			CampView.viewAllCamp();
    			break;
    			
    		case 3:
    			System.out.println("Staff -> Create new Camp");
                createCamp();
    			break;
    		
    		case 4:
    			do {
                    System.out.println("Staff -> Edit/Delete Camp");
    				System.out.println("1. Edit Camp");
    				System.out.println("2. Delete Camp");
    				System.out.println("Back to homepage");
    				choice2 = sc.nextInt();
    				switch (choice2) {
    					case 1:
    						System.out.println("Staff -> Edit/Delete Camp -> Edit Camp");
                            editCamp();
    						break;
    					case 2:
                            System.out.println("Staff -> Edit/Delete Camp -> Delete Camp");
    						deleteCamp();
    						break;
    					case 3:
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
    			System.out.println("Staff -> Toggle Camp Visibility");
                CampView.toggleVisibility();
    			break;
    				
    		case 6:
    			System.out.println("Staff -> View my Created Camp");
                CampView.viewPersonalCamp();
    					
    		case 7:
    			System.out.println("Staff -> View/Reply Enquiries");
                EnquiryMenu enquiryMenu = new EnquiryMenu();
    			enquiryMenu = run.EnquiryMenu();
    			break;
    					
    		case 8:
    			System.out.println("Staff -> View/Reply Suggestions");
                SuggestionMenu suggestionMenu = new SuggestionMenu();
    			suggstionMenu = run.SuggestionMenu();
    			break;
    					
    		case 9:
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
    
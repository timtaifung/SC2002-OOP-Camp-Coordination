package Assets.Camp;

import Assets.Roles.CampCommittee;
import Assets.Roles.Student;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CampManager {
    public static Camp createCamp(User currentUser) {
        Camp camp = new Camp(currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Create Camp -------");
        System.out.println("Camp Name: ");
        String campName = sc.nextLine();
        System.out.println("Date of Camp: ");
        String dateOfCamp = sc.nextLine();
        System.out.println("Registeration Closing Date: ");
        String registeraionClosing = sc.nextLine();
        System.out.println("Faculty/School: ");
        String grouping = sc.nextLine();
        System.out.println("Location: ");
        String location = sc.nextLine();
        System.out.println("Total Slots: ");
        Integer totalSlots = sc.nextInt();      //try throw exception when input is !integer
        System.out.println("Camp Commitee Slots: ");
        Integer commiteeSlots = sc.nextInt();
        sc.nextLine();
        System.out.println("Short Description: ");
        String result = sc.nextLine();
        System.out.println("Camp created successfully!");
        System.out.println("--------------------------\n");

        camp.setName(campName);
        camp.setDateofCamp(dateOfCamp);
        camp.setRegistrationClosing(registeraionClosing);
        camp.setGrouping(grouping);
        camp.setLocation(location);
        camp.setTotalSlots(totalSlots);
        camp.setCommiteeSlots(commiteeSlots);
        camp.setShortDescription(result);
        camp.setVisiblity(true);
        camp.setNTU(grouping);

        return camp;
    }

    public static void editCamp(ArrayList<Camp> campList, User currentUser) {
        if (!CampViewer.viewMyCreatedCamps(campList, currentUser)) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Select Camp to Edit:");
        System.out.println("--------------------\n");
        Integer campIndex = sc.nextInt();
        Camp camp = campList.get(campIndex - 1);

        System.out.println("--------- Edit Camp ---------");
        System.out.println("1. Camp Name");
        System.out.println("2. Date of Camp");
        System.out.println("3. Registeration Closing Date");
        System.out.println("4. Faculty/School");
        System.out.println("5. Location");
        System.out.println("6. Total Slots");
        System.out.println("7. Camp Commitee Slots");
        System.out.println("8. Short Description");
        System.out.println("9. Visiblity Toggle");
        System.out.println("10. Back to homepage");
        System.out.println("-----------------------------\n");

        Integer choice = sc.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("----------");
                System.out.println("Camp Name:");
                System.out.println("----------\n");
                sc.nextLine();
                String campName = sc.nextLine();
                camp.setName(campName);
                System.out.println("-------------------------------");
                System.out.println("Camp name changed successfully!");
                System.out.println("-------------------------------\n");
                break;

            case 2:
                System.out.println("--------------");
                System.out.println("Date of Camp: ");
                System.out.println("--------------\n");
                sc.nextLine();
                String dateOfCamp = sc.nextLine();
                camp.setDateofCamp(dateOfCamp);
                System.out.println("----------------------------------");
                System.out.println("Date of camp changed successfully!");
                System.out.println("----------------------------------\n");
                break;

            case 3:
                System.out.println("---------------------------");
                System.out.println("Registeration Closing Date:");
                System.out.println("---------------------------\n");
                sc.nextLine();
                String registeraionClosing = sc.nextLine();
                camp.setRegistrationClosing(registeraionClosing);
                System.out.println("------------------------------------------------");
                System.out.println("Registration closing date changed successfully!");
                System.out.println("------------------------------------------------\n");
                break;

            case 4:
                System.out.println("---------------"); 
                System.out.println("Faculty/School:");
                System.out.println("---------------\n"); 
                sc.nextLine();
                String grouping = sc.nextLine();
                camp.setGrouping(grouping);
                System.out.println("------------------------------------"); 
                System.out.println("Faculty/School changed successfully!");
                System.out.println("------------------------------------\n"); 
                break;

            case 5:
                System.out.println("---------"); 
                System.out.println("Location:");
                System.out.println("---------\n"); 
                sc.nextLine();
                String location = sc.nextLine();
                camp.setLocation(location);
                System.out.println("------------------------------"); 
                System.out.println("Location changed successfully!");
                System.out.println("------------------------------\n"); 
                break;

            case 6:
                System.out.println("------------"); 
                System.out.println("Total Slots:");
                System.out.println("------------/n"); 
                sc.nextLine();
                Integer totalSlots = sc.nextInt();
                camp.setTotalSlots(totalSlots);
                System.out.println("---------------------------------"); 
                System.out.println("Total slots changed successfully!");
                System.out.println("---------------------------------\n"); 
                break;

            case 7:
                System.out.println("--------------------"); 
                System.out.println("Camp Commitee Slots:");
                System.out.println("--------------------\n"); 
                sc.nextLine();
                Integer commiteeSlots = sc.nextInt();
                camp.setCommiteeSlots(commiteeSlots);
                System.out.println("-----------------------------------------"); 
                System.out.println("Camp commitee slots changed successfully!");
                System.out.println("-----------------------------------------\n"); 
                break;

            case 8:
                System.out.println("------------------"); 
                System.out.println("Short Description:");
                System.out.println("------------------\n"); 
                sc.nextLine();
                String shortDescription = sc.nextLine();
                camp.setShortDescription(shortDescription);
                System.out.println("---------------------------------------"); 
                System.out.println("Short description changed successfully!");
                System.out.println("---------------------------------------\n"); 
                break;

            case 9:
                if (camp.getVisiblity()) 
                {
                    camp.setVisiblity(false);
                } 
                else
                {
                    camp.setVisiblity(true);
                }
                System.out.println("-------------------------------"); 
                System.out.println("Visiblity changed successfully!");
                System.out.println("-------------------------------\n"); 
                break;

            case 10:
                break;
        }
    }

    public static void delCamp(ArrayList<Camp> campList, User currentUser) 
    {
        if (!CampViewer.viewMyCreatedCamps(campList, currentUser)) 
        {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------"); 
        System.out.println("Select Camp to Delete:");
        System.out.println("----------------------\n"); 
        Integer campIndex = sc.nextInt();
        campList.remove(campIndex.intValue() - 1);
        System.out.println("--------------------------"); 
        System.out.println("Camp deleted successfully!");
        System.out.println("--------------------------\n"); 
    }

    public static void registerCamp(ArrayList<Camp> campList, Student currentUser) 
    {
        if (!CampViewer.showAvailableCamp(campList, currentUser)) 
        {
            return;
        }

        Scanner sc = new Scanner(System.in);
        if (campList.size() == 0) 
        {
            return;
        }

        System.out.print("Select Camp to Register: ");
        if (!sc.hasNextInt())           //WHAT IF INPUT OUR OF RANGE
        {
            System.out.println("--------------------------------------------");
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.println("--------------------------------------------\n");
            return;
        }

        int campIndex = sc.nextInt();
        sc.nextLine();
        Camp camp = campList.get(campIndex - 1);

        //check if current user is blacklisted
        for (User blackListedUser : camp.getBlackList()) 
        {
            if (blackListedUser.equals(currentUser)) 
            {
                System.out.println("---------------------------------------------------");
                System.out.println("You previously left this camp! Unable to join back!");
                System.out.println("---------------------------------------------------\n");
                return;
            }
        }
        for(int i=0;i<camp.getAttendanceList().size();i++){
            if(camp.getAttendanceList().get(i) == currentUser){
                System.out.println("------------------------------------------");
                System.out.println("You have already registered for this camp!");
                System.out.println("------------------------------------------");
                return;
            }
        }


        if (camp.getAvailableSlots() > 0) {
            //check if student registered camp clash with other camp date
            for (Camp studentCamp : currentUser.getStudentCampList()) 
            {
                if (studentCamp.getDateofCamp().toString().equals(camp.getDateofCamp().toString())) 
                {
                    System.out.println("--------------------------------------------------");
                    System.out.println("You have registered another camp on the same date!");
                    System.out.println("--------------------------------------------------\n");
                    return;
                }
            }
            camp.getAttendanceList().add(currentUser);
            currentUser.getStudentCampList().add(camp);
            System.out.println("------------------------");
            System.out.println("Registered successfully!");
            System.out.println("------------------------");
        } 

        else 
        {
            System.out.println("-------------");
            System.out.println("Camp is full!");
            System.out.println("-------------\n");
        }

    }

    public static void campDetail(Camp currentCamp) 
    {
        System.out.println("--------------------------------------------");
        System.out.println("Camp Name: " + currentCamp.getName());
        System.out.println("Date of Camp: " + currentCamp.getDateofCamp());
        System.out.println("Registeration Closing Date: " + currentCamp.getRegistrationClosing());
        System.out.println("Faculty/School: " + currentCamp.getGrouping());
        System.out.println("Location: " + currentCamp.getLocation());
        System.out.println("Total Slots: " + currentCamp.getTotalSlots());
        System.out.println("Short Description: " + currentCamp.getShortDescription());
        System.out.println("Available Slots: " + currentCamp.getAvailableSlots());
        System.out.println("--------------------------------------------");
    }

    public static Boolean applyCampCommitee(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteeList)
    {
        if (currentCamp.getCommiteeSlots() == 0) 
        {
            System.out.println("------------------------------------------------");
            System.out.println("There are no more camp commitee slots available!");
            System.out.println("------------------------------------------------\n");
            return false;
        }
        //Checking if student is already a camp commitee for this camp
        if (currentCamp.getCommiteeList().contains(currentStudent)) 
        {
            System.out.println("--------------------------------");
            System.out.println("You are already a camp commitee!");
            System.out.println("--------------------------------\n");
            return false;
        }
        //Checking if student is already a camp commitee for another camp
        for (CampCommittee currentCampCommittee : campCommitteeList) 
        {
            if (currentCampCommittee.getName().equals(currentStudent.getName())) 
            {
                System.out.println("-------------------------------------------------");
                System.out.println("You are already a camp Commitee for another Camp!");
                System.out.println("-------------------------------------------------\n");
                return false;
            }
        }
        CampCommittee campCommittee = new CampCommittee(currentStudent, currentCamp);
        campCommitteeList.add(campCommittee);
        CampCommittee campcommitee = new CampCommittee(currentStudent, currentCamp);
        currentCamp.getCommiteeList().add(campcommitee);
        currentCamp.setCommiteeSlots(currentCamp.getCommiteeSlots() - 1);
        System.out.println("---------------------");
        System.out.println("Applied successfully!");
        System.out.println("---------------------\n");
        return true;
    }

    public static void leaveCamp(Student currentStudent, Camp currentCamp, ArrayList<CampCommittee> campCommitteeList) {
        currentCamp.getAttendanceList().remove(currentStudent);
        currentStudent.getStudentCampList().remove(currentCamp);
        if (currentCamp.getCommiteeList().contains(currentStudent)) {
            campCommitteeList.remove(currentStudent);
            currentCamp.getCommiteeList().remove(currentStudent);
            currentCamp.setCommiteeSlots(currentCamp.getCommiteeSlots() + 1);
        }
        currentCamp.getBlackList().add(currentStudent);
        System.out.println("-----------------------");
        System.out.println("Left camp successfully!");
        System.out.println("-----------------------\n");
    }
}

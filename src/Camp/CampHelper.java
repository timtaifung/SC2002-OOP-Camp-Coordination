package Camp;

import Roles.User;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//hi im nic

public class CampHelper {
    public static void viewAllCamps(ArrayList<Camp> campList){
        for(int i=0; i< campList.size()-1; i++){
            System.out.println(campList.get(i));
        }
    }
    public static void viewMyCreatedCamps(ArrayList<Camp> campList, User currentUser){
        for(int i=0; i< campList.size()-1; i++){
            if(Objects.equals(campList.get(i).getCreatedBy(), currentUser)){
                System.out.println(campList.get(i));
            }
        }
    }

    public static Camp createCamp(User currentUser){
        Camp camp = new Camp(currentUser);
        System.out.println("------Create Camp------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Camp Name: ");
        String campName = sc.nextLine();
        camp.setName(campName);
        System.out.print("Date of Camp: ");
        String dateOfCamp = sc.nextLine();
        camp.setDateofCamp(dateOfCamp);
        System.out.print("Registeration Closing Date: ");
        String registeraionClosing = sc.nextLine();
        camp.setRegisteraionClosing(registeraionClosing);
        System.out.print("Faculty/School: ");
        String grouping = sc.nextLine();
        camp.setGrouping(grouping);
        System.out.print("Location: ");
        String location = sc.nextLine();
        camp.setLocation(location);
        System.out.print("Total Slots: ");
        Integer totalSlots = sc.nextInt();
        camp.setTotalSlots(totalSlots);
        System.out.print("Camp Commitee Slots: ");
        Integer commiteeSlots = sc.nextInt();
        camp.setCommiteeSlots(commiteeSlots);
        System.out.print("Short Description: ");
        String shortDescription = sc.nextLine();
        camp.setShortDescription(shortDescription);

        return camp;
    }

    public static void editCamp(ArrayList<Camp> campList, User currentUser){
        viewMyCreatedCamps(campList, currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Camp to Edit: ");
        Integer campIndex = sc.nextInt();
        Camp camp = campList.get(campIndex);
        System.out.println("------Edit Camp------");
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
        Integer choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Camp Name: ");
                String campName = sc.nextLine();
                camp.setName(campName);
                break;
            case 2:
                System.out.print("Date of Camp: ");
                String dateOfCamp = sc.nextLine();
                camp.setDateofCamp(dateOfCamp);
                break;
            case 3:
                System.out.print("Registeration Closing Date: ");
                String registeraionClosing = sc.nextLine();
                camp.setRegisteraionClosing(registeraionClosing);
                break;
            case 4:
                System.out.print("Faculty/School: ");
                String grouping = sc.nextLine();
                camp.setGrouping(grouping);
                break;
            case 5:
                System.out.print("Location: ");
                String location = sc.nextLine();
                camp.setLocation(location);
                break;
            case 6:
                System.out.print("Total Slots: ");
                Integer totalSlots = sc.nextInt();
                camp.setTotalSlots(totalSlots);
                break;
            case 7:
                System.out.print("Camp Commitee Slots: ");
                Integer commiteeSlots = sc.nextInt();
                camp.setCommiteeSlots(commiteeSlots);
                break;
            case 8:
                System.out.print("Short Description: ");
                String shortDescription = sc.nextLine();
                camp.setShortDescription(shortDescription);
                break;
            case 9:
                if(camp.getVisiblity()){
                    camp.setVisiblity(false);
                }else{
                    camp.setVisiblity(true);
                }
                break;
            case 10:
                break;
        }
    }

    public static void delCamp(ArrayList<Camp> campList, User currentUser){
        viewMyCreatedCamps(campList, currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Camp to Delete: ");
        Integer campIndex = sc.nextInt();
        campList.remove(campIndex);
    }


}

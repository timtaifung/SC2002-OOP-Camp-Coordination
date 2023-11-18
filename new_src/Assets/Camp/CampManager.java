package Assets.Camp;
import Assets.Roles.Student;
import Assets.Roles.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CampManager 
{
    public static Camp createCamp(User currentUser)
    {
        Camp camp = new Camp(currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.println("------Create Camp------");
        System.out.print("Camp Name: ");
        String campName = sc.nextLine();
        System.out.print("Date of Camp: ");
        String dateOfCamp = sc.nextLine();
        System.out.print("Registeration Closing Date: ");
        String registeraionClosing = sc.nextLine();
        System.out.print("Faculty/School: ");
        String grouping = sc.nextLine();
        System.out.print("Location: ");
        String location = sc.nextLine();
        System.out.print("Total Slots: ");
        Integer totalSlots = sc.nextInt();
        System.out.print("Camp Commitee Slots: ");
        Integer commiteeSlots = sc.nextInt();
        sc.nextLine();
        System.out.print("Short Description: ");
        String result=sc.nextLine();

        camp.setName(campName);
        camp.setDateofCamp(dateOfCamp);
        camp.setRegisteraionClosing(registeraionClosing);
        camp.setGrouping(grouping);
        camp.setLocation(location);
        camp.setTotalSlots(totalSlots);
        camp.setCommiteeSlots(commiteeSlots);
        camp.setShortDescription(result);
        camp.setVisiblity(true);
        camp.setNTU(grouping);

        return camp;
    }

    public static void editCamp(ArrayList<Camp> campList, User currentUser)
    {
        CampViewer.viewMyCreatedCamps(campList, currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Camp to Edit: ");
        Integer campIndex = sc.nextInt();
        Camp camp = campList.get(campIndex-1);
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
        switch(choice)
        {
            case 1:
                System.out.print("Camp Name: ");
                sc.nextLine();
                String campName = sc.nextLine();
                camp.setName(campName);
                System.out.println("Camp name changed successfully!");
                break;

            case 2:
                System.out.print("Date of Camp: ");
                sc.nextLine();
                String dateOfCamp = sc.nextLine();
                camp.setDateofCamp(dateOfCamp);
                System.out.println("Date of camp changed successfully!");
                break;

            case 3:
                System.out.print("Registeration Closing Date: ");
                sc.nextLine();
                String registeraionClosing = sc.nextLine();
                camp.setRegisteraionClosing(registeraionClosing);
                System.out.println("Registeration closing date changed successfully!");
                break;

            case 4:
                System.out.print("Faculty/School: ");
                sc.nextLine();
                String grouping = sc.nextLine();
                camp.setGrouping(grouping);
                System.out.println("Faculty/School changed successfully!");
                break;

            case 5:
                System.out.print("Location: ");
                sc.nextLine();
                String location = sc.nextLine();
                camp.setLocation(location);
                System.out.println("Location changed successfully!");
                break;

            case 6:
                System.out.print("Total Slots: ");
                sc.nextLine();
                Integer totalSlots = sc.nextInt();
                camp.setTotalSlots(totalSlots);
                System.out.println("Total slots changed successfully!");
                break;

            case 7:
                System.out.print("Camp Commitee Slots: ");
                sc.nextLine();
                Integer commiteeSlots = sc.nextInt();
                camp.setCommiteeSlots(commiteeSlots);
                System.out.println("Camp commitee slots changed successfully!");
                break;

            case 8:
                System.out.print("Short Description: ");
                sc.nextLine();
                String shortDescription = sc.nextLine();
                camp.setShortDescription(shortDescription);
                System.out.println("Short description changed successfully!");
                break;

            case 9:
                if(camp.getVisiblity())
                {
                    camp.setVisiblity(false);
                }

                else
                {
                    camp.setVisiblity(true);
                }
                System.out.println("Visiblity changed successfully!");
                break;
                
            case 10:
                break;
        }
    }

    public static void delCamp(ArrayList<Camp> campList, User currentUser)
    {
        CampViewer.viewMyCreatedCamps(campList, currentUser);
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Camp to Delete: ");
        Integer campIndex = sc.nextInt();
        campList.remove(campIndex.intValue()-1);

        sc.close();
    }

    public static void registerCamp(ArrayList<Camp> campList, Student currentUser)
    {
        CampViewer.showAvailableCamp(campList, currentUser);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Select Camp to Register: ");
        if (!sc.hasNextInt()) 
        {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        int campIndex = sc.nextInt();
        sc.nextLine();
        Camp camp = campList.get(campIndex-1);

        //check if current user is blacklisted
        for(User blackListedUser: camp.getBlackList())
        {
            if(blackListedUser.equals(currentUser))
            {
                System.out.println("You previously left this camp! Unable to join back");
                return;
            }
        }


        if(camp.getAvailableSlots()>0)
        {
            //check if student registered camp clash with other camp date
            for(Camp studentCamp: currentUser.getStudentCampList())
            {
                if(studentCamp.getDateofCamp().toString().equals(camp.getDateofCamp().toString()))
                {
                    System.out.println("You have registered another camp on the same date!");
                    return;
                }
            }
            camp.getAttendanceList().add(currentUser);
            currentUser.getStudentCampList().add(camp);
            System.out.println("Registered successfully!");
        }

        else
        {
            System.out.println("Camp is full!");
        }

    }

    public static void campDetail(Camp currentCamp)
    {
        System.out.println("Camp Name: "+currentCamp.getName());
        System.out.println("Date of Camp: "+currentCamp.getDateofCamp());
        System.out.println("Registeration Closing Date: "+currentCamp.getRegisteraionClosing());
        System.out.println("Faculty/School: "+currentCamp.getGrouping());
        System.out.println("Location: "+currentCamp.getLocation());
        System.out.println("Total Slots: "+currentCamp.getTotalSlots());
        System.out.println("Short Description: "+currentCamp.getShortDescription());
        System.out.println("Available Slots: "+currentCamp.getAvailableSlots());
    }

    public static void applyCampCommitee(Student currentStudent, Camp currentCamp)
    {
        if(currentCamp.getCommiteeSlots() > 0 && !currentStudent.getIsCampCommittee().contains(currentCamp.getName()))
        {
            currentCamp.getCommiteeList().add(currentStudent);
            currentStudent.setIsCampCommittee(currentCamp.getName());
            System.out.println("Applied successfully!");
        }

        else if (currentStudent.getIsCampCommittee().contains(currentCamp.getName()))
        {
            System.out.println("You are already a camp commitee!");
        }

        else
        {
            System.out.println("Camp commitee slots are full!");
        }
    }

    public static void leaveCamp(Student currentStudent, Camp currentCamp) 
    {
        currentCamp.getAttendanceList().remove(currentStudent);
        currentStudent.getStudentCampList().remove(currentCamp);
        currentCamp.addBlackList(currentStudent);
        System.out.println("Left camp successfully!");
    }
}

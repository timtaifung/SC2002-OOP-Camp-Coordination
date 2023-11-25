package Assets.Camp.Tools;

import Assets.Camp.Camp;

public class CampDetails {
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
}

package Camp;

import java.time.LocalDate;
import java.util.stream.Collectors;

import Camp.camp;
import camp.CampView;

public class CampMenu {

	/**
	 * 
	 */
	public CampMenu() {
		

		System.out.println("Name: " + Camp.getName());
		System.out.println("Dates: " + Camp.getDate());
		System.out.println("Closing: " + Camp.regClosingDate());
		//System.out.println("Schools: " + availableString);
		System.out.println("Location: " + Camp.getLocation());
		System.out.println("Description: " + Camp.getDescription());
		System.out.println("Staff IC: " + Camp.staffInCharge());
		System.out.println("Number of slots left: " + Camp.campComSlots());
		System.out.println("Committee members: " + Camp.campCommittee());
		System.out.println("Students attending: " + Camp.attendees);
	}

}

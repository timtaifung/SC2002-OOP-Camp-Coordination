package Assets.Tools;

import Assets.Camp.Camp;
import Assets.Roles.CampCommittee;
import Assets.Roles.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PerformanceReport {
    public static void generateList(ArrayList<CampCommittee> campCommitteeList, ArrayList<Camp> campList) {
            /*----------------------------------Printing it into a .txt File-----------------------------*/
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("CampCommiteeReport.txt"))) {
                writer.write("------------------------------------ Camp Report ------------------------------------");
                writer.newLine();
                writer.newLine();

                for(Camp camp: campList) {
                    writer.write("------------------------------------ "+camp.getName()+ " ------------------------------------");
                    writer.newLine();
                    for(CampCommittee currentPerson: campCommitteeList) {
                        if(currentPerson.getCamp().getName() != camp.getName()) {
                            continue;
                        }
                        writer.write("Camp Commitee Name: " + currentPerson.getName());
                        writer.newLine();
                        writer.write("Points: " + currentPerson.getpoint());
                        writer.newLine();
                        writer.write("Enquiries Answered: ");
                        writer.newLine();
                        for(int i = 0; i < currentPerson.getEnquiryAnswered().size(); i++) {
                            writer.write(currentPerson.getEnquiryAnswered().get(i).getTitle());
                            writer.newLine();
                            writer.write(currentPerson.getEnquiryAnswered().get(i).getContent());
                            writer.newLine();
                        }
                        writer.newLine();
                        writer.write("Suggestions: ");
                        writer.newLine();
                        for(int i = 0; i < currentPerson.getSuggestionList().size(); i++) {
                            writer.write(currentPerson.getSuggestionList().get(i).getTitle());
                            writer.newLine();
                            writer.write(currentPerson.getSuggestionList().get(i).getContent());
                            writer.newLine();
                        }
                        writer.newLine();
                    }

                }
                System.out.println("Data saved to CampCommiteeReport.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


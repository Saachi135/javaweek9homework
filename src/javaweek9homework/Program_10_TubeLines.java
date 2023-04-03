package javaweek9homework;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_10_TubeLines {
    public static void main(String[] args) {
        Program_10_TubeLines obj = new Program_10_TubeLines();
        obj.tubeLine();
    }
    public void tubeLine() {

        Map<String, String> stations = new HashMap<>();
        stations.put("Aldgate", "Metropolitan");
        stations.put("Aldgate East", "District");
        stations.put("Angel", "Northern");
        stations.put("Baker Street", "Bakerloo");
        stations.put("Bank", "Central");
        stations.put("Barbican", "Metropolitan");
        stations.put("Bayswater", "District");
        stations.put("Blackfriars", "District");
        stations.put("Bond Street", "Central");
        stations.put("Borough", "Northern");
        stations.put("Cannon Street", "District");
        stations.put("Chancery Lane", "Central");
        stations.put("Charing Cross", "Bakerloo");
        stations.put("City Thameslink", "Thameslink");
        stations.put("Covent Garden", "Piccadilly");
        stations.put("Earl's Court", "District");
        stations.put("Edgware Road (Bakerloo)", "Bakerloo");
        stations.put("Elephant & Castle", "Bakerloo/Northern");
        stations.put("Embankment", "Bakerloo/Northern");
        stations.put("Euston", "Northern/Victoria");
        stations.put("Euston Square", "Circle/Hammersmith & City/Metropolitan");
        stations.put("Gloucester Road", "Circle/District/Piccadilly");
        stations.put("Goodge Street", "Northern");
        stations.put("Green Park", "Jubilee/Piccadilly/Victoria");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter station name:");              //input from console
        String station = scanner.nextLine();

        if (stations.containsKey(station)) {
            System.out.println(station + " station is on the " + stations.get(station) + " line.");
            return;

        } else {
            System.out.println("Sorry, this station is not in Zone 1.");

            scanner.close();                    // closing scanner object
            return;

        }
    }
}

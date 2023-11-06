package javaweek5homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name.
 */
public class Programme_10 {

    public static void main(String[] args) {
        Map<String, String[]> lines = new HashMap<>();
        lines.put("Baker Street", new String[]{"Circle", "Hammersmith & City", "Jubilee", "Metropolitan", "Bakerloo"});
        lines.put("Victoria", new String[]{"Victoria"});
        lines.put("Oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});

        String station1 = "Baker Street"; // Change this to the first station
        String station2 = "Victoria"; // Change this to the second station

        String result = findLineBetweenStations(lines, station1, station2);
        System.out.println(result);
    }

    public static String findLineBetweenStations(Map<String, String[]> lines, String station1, String station2) {
        for (Map.Entry<String, String[]> entry : lines.entrySet()) {
            String station = entry.getKey();
            String[] lineList = entry.getValue();

            if (containsStation(lineList, station1) && containsStation(lineList, station2)) {
                return "The " + String.join(", ", lineList) + " line passes through " + station1 + " and " + station2;
            }
        }

        return "No direct line found between " + station1 + " and " + station2;
    }

    public static boolean containsStation(String[] lineList, String station) {
        for (String line : lineList) {
            if (line.equals(station)) {
                return true;
            }
        }
        return false;
    }
}





package assignment31;

import java.util.Scanner;

public class NavalVesselSolution {

    // Method to find average completed voyages based on percentage
    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int totalCompleted = 0;
        int count = 0;

        for (NavalVessel vessel : vessels) {
            int completedPercentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (completedPercentage >= percentage) {
                totalCompleted += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        } else {
            return totalCompleted / count;
        }
    }

    // Method to find the vessel by its purpose and calculate classification
    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                int completedPercentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();

                // Assign classification based on the percentage
                if (completedPercentage == 100) {
                    vessel.setClassification("Star");
                } else if (completedPercentage >= 80) {
                    vessel.setClassification("Leader");
                } else if (completedPercentage >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null; // Return null if no vessel with the specified purpose is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create array for 4 NavalVessel objects
        NavalVessel[] vessels = new NavalVessel[4];

        // Input for 4 vessels
        for (int i = 0; i < 4; i++) {
            int vesselId = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            String vesselName = scanner.nextLine();
            int noOfVoyagesPlanned = scanner.nextInt();
            int noOfVoyagesCompleted = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            String purpose = scanner.nextLine();

            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        // Read percentage and purpose
        int percentage = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        String purpose = scanner.nextLine();

        // Call the methods and display results
        int avgCompletedVoyages = findAvgVoyagesByPct(vessels, percentage);
        if (avgCompletedVoyages == 0) {
            System.out.println("No vessels found with the specified percentage criteria.");
        } else {
            System.out.println(avgCompletedVoyages);
        }

        NavalVessel vesselWithGrade = findVesselByGrade(vessels, purpose);
        if (vesselWithGrade != null) {
            System.out.println(vesselWithGrade.getVesselName() + "%" + vesselWithGrade.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        scanner.close(); // Close the scanner
    }
}

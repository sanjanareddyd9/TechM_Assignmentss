package assignment31;

import java.util.Scanner;

public class InstitutionHandler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input for 4 Institution objects
        Institution[] instArray = new Institution[4];

        // Collecting input for 4 institutions
        for (int i = 0; i < 4; i++) {
            int institutionId = sc.nextInt();
            sc.nextLine(); // consume the newline character
            String institutionName = sc.nextLine();
            String noOfStudentsPlaced = sc.nextLine();
            int noOfStudentsCleared = sc.nextInt();
            sc.nextLine(); // consume the newline character
            String location = sc.nextLine();

            instArray[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        // Read location and institution name for specific queries
        String locationQuery = sc.nextLine();
        String institutionNameQuery = sc.nextLine();

        // Call the methods
        int numCleared = findNumClearancedByLoc(instArray, locationQuery);
        if (numCleared > 0) {
            System.out.println(numCleared);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution updatedInstitution = updateInstitutionGrade(instArray, institutionNameQuery);
        if (updatedInstitution != null) {
            System.out.println(updatedInstitution.getInstitutionName() + "::" + updatedInstitution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }

        sc.close(); // Closing the scanner object
    }

    // Method to find total number of cleared students in a location
    public static int findNumClearancedByLoc(Institution[] instArray, String location) {
        int totalCleared = 0;
        for (Institution institution : instArray) {
            if (institution.getLocation().equalsIgnoreCase(location)) {
                totalCleared += institution.getNoOfStudentsCleared();
            }
        }
        return totalCleared;
    }

    // Method to update institution grade based on students placed and cleared
    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) {
        for (Institution institution : instArray) {
            if (institution.getInstitutionName().equalsIgnoreCase(instName)) {
                // Calculate grade
                double rating = (Double.parseDouble(institution.getNoOfStudentsPlaced()) * 100) / institution.getNoOfStudentsCleared();
                String grade = (rating >= 80) ? "A" : "B";
                institution.setGrade(grade);
                return institution;
            }
        }
        return null; // Return null if no institution matches
    }
}

// Institution class with required attributes and methods
class Institution {
    private int institutionId;
    private String institutionName;
    private String noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    // Getters and Setters
    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

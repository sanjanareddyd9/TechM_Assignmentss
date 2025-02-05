package assignment31;

import java.util.Scanner;

public class AssociateTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Associate[] associates = new Associate[5];

        for (int i = 0; i < 5; i++) {
            int id = scanner.nextInt(); 
            scanner.nextLine(); 
            String name = scanner.nextLine(); 
            String technology = scanner.nextLine(); 
            int experienceInYears = scanner.nextInt(); 
            scanner.nextLine(); 

            associates[i] = new Associate(id, name, technology, experienceInYears);
        }

       
        String searchTechnology = scanner.nextLine(); 

        
        Associate[] result = associatesForGivenTechnology(associates, searchTechnology);

       
        if (result.length > 0) {
            for (Associate associate : result) {
                System.out.println(associate.getId());
            }
        }

        scanner.close();
    }

    
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
       
        int count = 0;

        
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) &&
                associate.getExperienceInYears() % 5 == 0) {
                count++;
            }
        }

       
        if (count == 0) {
            return new Associate[0];
        }

        
        Associate[] result = new Associate[count];
        int index = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) &&
                associate.getExperienceInYears() % 5 == 0) {
                result[index++] = associate;
            }
        }

        return result;
    }
}

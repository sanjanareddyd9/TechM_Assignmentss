package assignment31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedicineSolution {

    
    public static ArrayList<Integer> getPriceByDisease(Medicine[] medicines, String disease) {
        ArrayList<Integer> prices = new ArrayList<>();
        
        
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease.trim())) {
                prices.add(medicine.getPrice());
            }
        }

        
        Collections.sort(prices);
        return prices;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Medicine[] medicines = new Medicine[4];

        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter medicine " + (i + 1) + " details:");

           
            String medicineName = scanner.nextLine();
            String batch = scanner.nextLine();
            String disease = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine();  

            
            medicines[i] = new Medicine(medicineName, batch, disease, price);
        }

        
        System.out.println("Enter disease:");
        String disease = scanner.nextLine();

        
        ArrayList<Integer> prices = getPriceByDisease(medicines, disease);

        
        if (prices.isEmpty()) {
            System.out.println("No medicines found for the specified disease.");
        } else {
            for (int price : prices) {
                System.out.println(price);
            }
        }

        scanner.close(); 
    }
}

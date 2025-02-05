package assignment31;

import java.util.Scanner;

public class AutonomousCarTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        AutonomousCar[] cars = new AutonomousCar[4];

        for (int i = 0; i < 4; i++) {
            int carId = scanner.nextInt(); 
            scanner.nextLine(); 
            String brand = scanner.nextLine(); 
            int noOfTestsConducted = scanner.nextInt(); 
            int noOfTestsPassed = scanner.nextInt(); 
            scanner.nextLine(); 
            String environment = scanner.nextLine();

            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        
        String environmentSearch = scanner.nextLine(); 
        String brandSearch = scanner.nextLine(); 

      
        int totalTestsPassed = findTestPassedByEnv(cars, environmentSearch);
        if (totalTestsPassed > 0) {
            System.out.println(totalTestsPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar car = updateCarGrade(cars, brandSearch);
        if (car != null) {
            System.out.println(car.getBrand() + "::" + car.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }

        scanner.close();
    }

    
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int totalPassed = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                totalPassed += car.getNoOfTestsPassed();
            }
        }
        return totalPassed;
    }

    
    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
                if (rating >= 80) {
                    car.setGrade("A1");
                } else {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }
}

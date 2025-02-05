package assignment31;
import java.util.Scanner;

public class PhoneHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input for 4 Phone objects
        Phone[] phoneArray = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int phoneId = sc.nextInt();
            sc.nextLine(); // Consume newline  
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline  
            phoneArray[i] = new Phone(phoneId, os, brand, price);
        }

        // Read brand and os for specific queries
        String brandQuery = sc.nextLine();
        String osQuery = sc.nextLine();

        // Close scanner
        sc.close();

        // Call the methods
        int totalPrice = findPriceForGivenBrand(phoneArray, brandQuery);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phone = getPhoneIdBasedOnOs(phoneArray, osQuery);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] phoneArray, String brand) {
        int totalPrice = 0;
        for (Phone phone : phoneArray) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                totalPrice += phone.getPrice();
            }
        }
        return totalPrice;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phoneArray, String os) {
        for (Phone phone : phoneArray) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

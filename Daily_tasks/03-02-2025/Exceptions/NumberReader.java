package pack3;

import java.io.*;
import java.util.*;

public class NumberReader {
    
    public static void readNumbersFromFile(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);  

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new Exception("Positive number found: " + number);
            }
        }

        System.out.println("All numbers are non-positive.");
        scanner.close();  
    }

    public static void main(String[] args) {
        try {
            readNumbersFromFile("numbers.txt");  
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


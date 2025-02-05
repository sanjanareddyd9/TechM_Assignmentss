package pack3;

import java.io.*;
import java.util.*;

public class FileEmptyChecker {
    
    
    public static void readFileAndCheckEmpty(String fileName) throws Exception {
        File file = new File(fileName);
        
        
        if (!file.exists()) {
            throw new Exception("File not found: " + fileName);
        }

        
        if (file.length() == 0) {
            throw new Exception("The file is empty: " + fileName);
        }

        
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());  
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFileAndCheckEmpty("example.txt"); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


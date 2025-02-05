package pack4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadPlainTextFile {
    public static void main(String[] args) {
       
        File file = new File("sample.txt"); 

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
}


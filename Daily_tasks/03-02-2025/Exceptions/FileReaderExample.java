package pack3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file); 
        System.out.println("File found and ready to read.");
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
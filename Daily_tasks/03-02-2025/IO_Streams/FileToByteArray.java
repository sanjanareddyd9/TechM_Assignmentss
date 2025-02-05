package pack4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
       
        File file = new File("example.txt");  

        try (FileInputStream fis = new FileInputStream(file)) {
            
            byte[] byteArray = new byte[(int) file.length()];
            
            
            fis.read(byteArray);

            
            System.out.println("File content in bytes:");
            System.out.println(new String(byteArray));  
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


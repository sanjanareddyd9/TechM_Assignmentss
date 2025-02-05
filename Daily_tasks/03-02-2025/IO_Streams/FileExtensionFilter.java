package pack4;

import java.io.File;

public class FileExtensionFilter {

    
    public static void listFilesWithExtension(String directoryPath, String extension) {
        File directory = new File(directoryPath);
        
        
        if (directory.exists() && directory.isDirectory()) {
           
            File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
            
           
            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + extension + " in " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());  
                }
            } else {
                System.out.println("No files with extension " + extension + " found.");
            }
        } else {
            System.out.println("The specified path is not a valid directory or it does not exist.");
        }
    }

    public static void main(String[] args) {
       
        String directoryPath = "C:\\Users\\dodda\\OneDrive\\Documents\\New folder";  
        String extension = ".txt";  
        
        listFilesWithExtension(directoryPath, extension);
    }
}
package pack4;

import java.io.File;

public class DirectoryLister {

   
    public static void listFilesAndDirectories(String directoryPath) {
        File directory = new File(directoryPath);

        
        if (directory.exists() && directory.isDirectory()) {
            
            String[] filesAndDirs = directory.list();

           
            if (filesAndDirs != null) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String fileOrDir : filesAndDirs) {
                    System.out.println(fileOrDir);  
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a valid directory or it does not exist.");
        }
    }

    public static void main(String[] args) {
        
        String directoryPath = "C:\\Users\\dodda\\OneDrive\\Documents\\4th_SEM_NOTES";  
        
        listFilesAndDirectories(directoryPath);
    }
}


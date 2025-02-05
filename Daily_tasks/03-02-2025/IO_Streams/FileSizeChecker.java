package pack4;

import java.io.File;

public class FileSizeChecker {

    
    public static void getFileSize(String pathname) {
       
        File file = new File(pathname);

        
        if (file.exists()) {
            
            long fileSizeInBytes = file.length();

            
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            
            System.out.println("File size in bytes: " + fileSizeInBytes + " bytes");
            System.out.println("File size in KB: " + fileSizeInKB + " KB");
            System.out.println("File size in MB: " + fileSizeInMB + " MB");
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }

    public static void main(String[] args) {
       
        String pathname = "C:\\Users\\dodda\\OneDrive\\Documents\\r";  

        getFileSize(pathname);
    }
}

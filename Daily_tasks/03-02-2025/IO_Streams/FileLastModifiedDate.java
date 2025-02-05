package pack4;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileLastModifiedDate {

    
    public static void getLastModifiedDate(String pathname) {
        
        File file = new File(pathname);

        
        if (file.exists()) {
            
            long lastModified = file.lastModified();

            
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            String formattedDate = sdf.format(lastModified);

            System.out.println("The file was last modified on: " + formattedDate);
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }

    public static void main(String[] args) {
        
        String pathname = "C:\\Users\\dodda\\OneDrive\\Documents\\New folder";  
        
        getLastModifiedDate(pathname);
    }
}
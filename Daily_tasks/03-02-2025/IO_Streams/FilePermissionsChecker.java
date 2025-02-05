package pack4;

import java.io.File;

public class FilePermissionsChecker {

    
    public static void checkPermissions(String pathname) {
        
        File file = new File(pathname);

        
        if (file.exists()) {
            
            if (file.canRead()) {
                System.out.println(pathname + " has read permission.");
            } else {
                System.out.println(pathname + " does not have read permission.");
            }

            if (file.canWrite()) {
                System.out.println(pathname + " has write permission.");
            } else {
                System.out.println(pathname + " does not have write permission.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }

    public static void main(String[] args) {
        
        String pathname = "C:\\Users\\dodda\\OneDrive\\Documents\\New folder";  
        
        checkPermissions(pathname);
    }
}
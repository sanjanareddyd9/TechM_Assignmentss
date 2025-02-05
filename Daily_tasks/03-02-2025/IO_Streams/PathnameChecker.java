package pack4;

import java.io.File;

public class PathnameChecker {

    
    public static void checkPathname(String pathname) {
        
        File file = new File(pathname);

        
        if (file.exists()) {
            
            if (file.isFile()) {
                System.out.println(pathname + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(pathname + " is a directory.");
            } else {
                System.out.println(pathname + " is neither a file nor a directory.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }

    public static void main(String[] args) {
        
        String pathname = "C:\\Users\\dodda\\OneDrive\\Documents\\New folder";  
        
        checkPathname(pathname);
    }
}

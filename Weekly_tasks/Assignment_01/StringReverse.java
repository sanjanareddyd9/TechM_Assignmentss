package assignment31;

public class StringReverse {
    public static void main(String[] args) {
        // Input string
        String input = "WelCome";
        
        // Convert string to lowercase and reverse it
        String reversed = new StringBuilder(input.toLowerCase()).reverse().toString();
        
        // Output the reversed string
        System.out.println(reversed);
    }
}

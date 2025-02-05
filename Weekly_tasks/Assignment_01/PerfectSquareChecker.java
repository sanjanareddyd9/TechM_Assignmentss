package assignment31;

public class PerfectSquareChecker {

    
    public static boolean isPerfectSquare(int number) {
        
        double sqrt = Math.sqrt(number);
        
        
        return (sqrt == Math.floor(sqrt));
    }

    public static void main(String[] args) {
        
        int number = 9; 
        
        
        if (isPerfectSquare(number)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

package pack3;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
          
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed.");
        }
        
        System.out.println("Program continues after exception handling...");
    }
}


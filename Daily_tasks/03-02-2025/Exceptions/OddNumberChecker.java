package pack3;



class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: " + number + " is an odd number!");
        } else {
            System.out.println(number + " is even.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(7); 
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkEven(8); 
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}



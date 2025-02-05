package assignment31;

import java.util.*;

public class DataValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); 
        sc.close(); 

        
        input = input.substring(0, input.length() - 1);

       
        String[] parts = input.split(" ");
        List<Integer> primes = new ArrayList<>();

       
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        
        Collections.sort(primes, Collections.reverseOrder());

       
        int totalPrimes = primes.size();
        int secondLargestPrime = primes.get(1); 

        
        int result = totalPrimes + secondLargestPrime;
        System.out.println(result);
    }

   
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


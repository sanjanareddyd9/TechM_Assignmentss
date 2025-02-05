package assignment31;

import java.util.Scanner;

public class SmallestVowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        
        char smallestVowel = 'z'; 
        
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1 && ch < smallestVowel) {
                smallestVowel = ch;
            }
        }
        
        if (smallestVowel != 'z') {
            System.out.println(smallestVowel);
        } else {
            System.out.println("No vowels found");
        }
    }
}


package assignment31;

import java.util.Scanner;

public class OddPositionCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        for (int i = 1; i < input.length(); i += 2) { // 0-based index, so odd positions are at even indices
            System.out.print(input.charAt(i));
        }
    }
}


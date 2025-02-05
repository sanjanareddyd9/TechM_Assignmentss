package assignment31;
import java.util.Scanner;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scanner.nextLine();
		String str = input.toLowerCase();
		int vowelCount = 0, consonantCount = 0;
		String vowels = "aeiou";
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch) != -1) {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowels Count : " + vowelCount);
		System.out.println("Consonants Count : " + consonantCount);
		
		scanner.close();
	}

}

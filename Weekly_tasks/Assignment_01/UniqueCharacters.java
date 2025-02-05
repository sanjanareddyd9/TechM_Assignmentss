package assignment31;
import java.util.Scanner;
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = sc.nextLine();
		String str = input.toLowerCase();
		String result = "";
		for(char ch : str.toCharArray()) {
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		System.out.println(result);
		sc.close();
	}

}

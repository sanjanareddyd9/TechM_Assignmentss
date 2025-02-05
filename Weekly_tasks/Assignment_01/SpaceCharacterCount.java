package assignment31;
public class SpaceCharacterCount {
    public static void main(String[] args) {
        String input = "Hello This is ABCD from XYZ city";

        int spaceCount = 0, charCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else if (Character.isLetter(ch)) {
                charCount++;
            }
        }

        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
    }
}


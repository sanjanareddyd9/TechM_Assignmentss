package assignment31;

public class LastCharacterOfWords {
    public static void main(String[] args) {
        String input = "Hey3 Java   Learners"; 
        String result = getLastCharacterOfWords(input);
        System.out.println(result);
    }

    public static String getLastCharacterOfWords(String input) {
        StringBuilder lastCharacters = new StringBuilder();
        
        
        String[] words = input.split("\\s+");

        for (String word : words) {
            
            if (!word.isEmpty() && !word.matches(".*\\d.*")) {
                
                lastCharacters.append(word.charAt(word.length() - 1));
            }
        }

        return lastCharacters.toString();
    }
}


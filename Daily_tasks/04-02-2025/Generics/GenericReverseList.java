package pack6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class GenericReverseList {
    
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list); 
        Collections.reverse(reversedList); 
        return reversedList; 
    }

    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original Integer List: " + intList);
        System.out.println("Reversed Integer List: " + reverseList(intList));

        
        List<String> strList = Arrays.asList("apple", "banana", "cherry");
        System.out.println("\nOriginal String List: " + strList);
        System.out.println("Reversed String List: " + reverseList(strList));
    }
}


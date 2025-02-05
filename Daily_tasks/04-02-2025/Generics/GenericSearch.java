package pack6;

import java.util.List;
import java.util.Arrays;

public class GenericSearch {
    
    public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50, 30);
        System.out.println("Index of 30 in intList: " + findFirstIndex(intList, 30)); // Output: 2
        System.out.println("Index of 25 in intList: " + findFirstIndex(intList, 25)); // Output: -1

       
        List<String> strList = Arrays.asList("apple", "banana", "cherry", "banana");
        System.out.println("Index of 'banana' in strList: " + findFirstIndex(strList, "banana")); // Output: 1
        System.out.println("Index of 'grape' in strList: " + findFirstIndex(strList, "grape")); // Output: -1
    }
}


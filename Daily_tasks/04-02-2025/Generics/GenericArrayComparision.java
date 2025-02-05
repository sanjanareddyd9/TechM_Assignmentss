package pack6;

import java.util.Arrays;

public class GenericArrayComparision {
    
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
       
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};

        System.out.println("intArray1 and intArray2 are equal: " + areArraysEqual(intArray1, intArray2)); // true
        System.out.println("intArray1 and intArray3 are equal: " + areArraysEqual(intArray1, intArray3)); // false

       
        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        String[] strArray3 = {"apple", "banana", "grape"};

        System.out.println("strArray1 and strArray2 are equal: " + areArraysEqual(strArray1, strArray2)); // true
        System.out.println("strArray1 and strArray3 are equal: " + areArraysEqual(strArray1, strArray3)); // false
    }
}


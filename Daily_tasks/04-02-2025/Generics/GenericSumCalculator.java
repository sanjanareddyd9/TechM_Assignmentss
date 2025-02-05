package pack6;

import java.util.List;
import java.util.ArrayList;

public class GenericSumCalculator {
   
    public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        double evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.doubleValue();
            } else {
                oddSum += num.doubleValue();
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println("Integer List:");
        sumEvenOdd(intList);

        
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);

        System.out.println("\nDouble List:");
        sumEvenOdd(doubleList);
    }
}


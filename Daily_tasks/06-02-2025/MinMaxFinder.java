package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 3, 47, 89, 15, 60, 5);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElseThrow());
        System.out.println("Minimum value: " + min.orElseThrow());
    }
}

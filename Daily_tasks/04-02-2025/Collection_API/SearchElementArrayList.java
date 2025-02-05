package pack7;

import java.util.ArrayList;
import java.util.List;

public class SearchElementArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        String searchElement = "Green";
        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " found in the list at index " + colors.indexOf(searchElement));
        } else {
            System.out.println(searchElement + " not found in the list.");
        }
    }
}


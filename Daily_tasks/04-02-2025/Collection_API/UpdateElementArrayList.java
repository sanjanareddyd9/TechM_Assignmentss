package pack7;

import java.util.ArrayList;
import java.util.List;

public class UpdateElementArrayList {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        
        System.out.println("Original List: " + colors);

        
        int index = 2;
        String newElement = "Orange";

        if (index >= 0 && index < colors.size()) {
            colors.set(index, newElement); 
            System.out.println("Updated List after replacing index " + index + " with '" + newElement + "': " + colors);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
}


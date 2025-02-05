package pack7;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {
    public static void main(String[] args) {
       
        List<String> colors = new ArrayList<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        
        System.out.println("ArrayList: " + colors);

        
        int index = 2;
        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
}

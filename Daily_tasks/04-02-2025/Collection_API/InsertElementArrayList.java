package pack7;

import java.util.ArrayList;
import java.util.List;

public class InsertElementArrayList {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        
        System.out.println("Original List: " + colors);

        
        colors.add(0, "Orange");

        
        System.out.println("Updated List after inserting 'Orange' at first position: " + colors);
    }
}


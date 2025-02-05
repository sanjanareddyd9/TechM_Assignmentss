package pack7;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<>();

       
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        
        System.out.println("Original List: " + colors);

        
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            colors.remove(indexToRemove); 
            System.out.println("Updated List after removing third element: " + colors);
        } else {
            System.out.println("Invalid index: " + indexToRemove);
        }
    }
}


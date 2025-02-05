package pack7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");
        list1.add("Yellow");
        list1.add("Purple");

        List<String> list2 = new ArrayList<>(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            list2.add(""); 
        }

        Collections.copy(list2, list1);

        System.out.println("Original List: " + list1);
        System.out.println("Copied List: " + list2);
    }
}

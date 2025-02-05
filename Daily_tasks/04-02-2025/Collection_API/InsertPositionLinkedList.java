package pack7;

import java.util.LinkedList;

public class InsertPositionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original List: " + list);

        list.add(1, "Yellow");
        list.add(2, "Purple");

        System.out.println("Updated List: " + list);
    }
}


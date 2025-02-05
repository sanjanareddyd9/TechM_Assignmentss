package pack7;

import java.util.LinkedList;

public class InsertAtPositionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        list.add(2, "Purple");

        System.out.println("Updated List: " + list);
    }
}


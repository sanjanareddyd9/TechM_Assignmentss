package pack7;

import java.util.LinkedList;

public class InsertEndLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original List: " + list);

        list.addLast("Yellow");

        System.out.println("Updated List: " + list);
    }
}


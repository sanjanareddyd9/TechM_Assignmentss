package pack7;

import java.util.LinkedList;

public class InsertFirstLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original List: " + list);

        list.addFirst("Yellow");
        list.addLast("Purple");

        System.out.println("Updated List: " + list);
    }
}


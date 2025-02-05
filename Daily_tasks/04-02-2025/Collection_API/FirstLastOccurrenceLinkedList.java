package pack7;

import java.util.LinkedList;

public class FirstLastOccurrenceLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Purple");

        System.out.println("First occurrence of Blue: " + list.indexOf("Blue"));
        System.out.println("Last occurrence of Blue: " + list.lastIndexOf("Blue"));
    }
}


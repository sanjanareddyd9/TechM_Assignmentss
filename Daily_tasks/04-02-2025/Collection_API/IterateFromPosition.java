package pack7;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        int startIndex = 2;
        ListIterator<String> iterator = list.listIterator(startIndex);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


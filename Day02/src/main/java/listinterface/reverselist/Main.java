package listinterface.reverselist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        LinkedList<Integer> linkedList = new LinkedList<>(list);

        System.out.println("Reversed ArrayList : " + ListReverse.reverseList(list));
        System.out.println("Reversed LinkedList : " + LinkedListReverse.reverseLinkedList(linkedList));

    }
}

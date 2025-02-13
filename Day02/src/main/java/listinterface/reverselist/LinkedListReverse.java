package listinterface.reverselist;

import java.util.LinkedList;

public class LinkedListReverse {


        public static <T> LinkedList<T> reverseLinkedList(LinkedList <T> list){
            LinkedList<T> reverseList = new LinkedList<>();

            for(T item : list){
                reverseList.addFirst(item);
            }
            return reverseList;
        }
    }



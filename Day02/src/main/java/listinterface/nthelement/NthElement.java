package listinterface.nthelement;


import java.util.LinkedList;

public class NthElement {
    public static String nthElement(LinkedList<String> list , int n){
        var first = list.listIterator();
        var second = list.listIterator();

        for (int i = 0; i < n; i++) {
            first.next();
        }
        while(first.hasNext()){
            first.next();
            second.next();
        }
        return second.next();
    }
}

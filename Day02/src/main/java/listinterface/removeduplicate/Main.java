package listinterface.removeduplicate;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("New list with no duplicates : "+ RemoveDuplicate.removeDuplicate(list));
    }

}

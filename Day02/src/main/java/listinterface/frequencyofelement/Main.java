package listinterface.frequencyofelement;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        System.out.println("Frequency Count : "+FrequencyCount.frequencyCount(list));
    }

}

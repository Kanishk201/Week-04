package regexproblems.advancedproblems.repeatingwordinsentence;

import java.util.regex.*;
import java.util.*;

public class RepeatingWord {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\b";  // Match words

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text.toLowerCase());

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new LinkedHashSet<>();

        while (matcher.find()) {
            String word = matcher.group(1);
            if (!seen.add(word)) {
                repeated.add(word);
            }
        }
        System.out.println(repeated);
    }
}

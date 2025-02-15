package regexproblems.advancedproblems.extractcurrencyvalues;

import java.util.regex.*;
import java.util.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        String regex = "\\$\\d+\\.\\d+|\\d+\\.\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }

        System.out.println(matches);
    }
}

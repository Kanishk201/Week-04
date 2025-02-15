package regexproblems.extractionproblems.extractcapitalisedwordsfromsentence;

import java.util.regex.*;

public class ExtractCapitalisedWord {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);

        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

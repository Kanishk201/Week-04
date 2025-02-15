package regexproblems.extractionproblems.extractlinkfromwebpage;
import java.util.regex.*;

public class ExtractLink {
    public static void main(String[] args) {
        String regex = "https?://([a-z]+\\.)+[a-z]+";

        Pattern pattern = Pattern.compile(regex);

        String input = "Visit https://www.google.com and http://example.org for more info.";

        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

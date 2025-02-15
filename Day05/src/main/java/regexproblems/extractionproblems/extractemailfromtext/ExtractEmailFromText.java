package regexproblems.extractionproblems.extractemailfromtext;

import java.util.regex.*;

public class ExtractEmailFromText {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        String input = "Contact us at support@example.com and info@company.org";

        Matcher matcher = pattern.matcher(input);

        System.out.println("Extracted email addresses:");
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

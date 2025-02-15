package regexproblems.advancedproblems.extractprogramminglanguagenames;
import java.util.regex.*;


public class ProgrammingLanguageNames {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

            String regex = "Javascript|Java|Python|Go|C|Ruby|Kotlin";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()){
                System.out.println(matcher.group());
        }

    }
}

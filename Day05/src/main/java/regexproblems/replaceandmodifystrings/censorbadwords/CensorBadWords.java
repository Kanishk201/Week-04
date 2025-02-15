package regexproblems.replaceandmodifystrings.censorbadwords;

public class CensorBadWords {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};

        String text = "This is a damn bad example with some stupid words.";

        for (String badWord : badWords) {
            String regex = "\\b" + badWord + "\\b";
            text = text.replaceAll(regex, "****");
        }

        System.out.println(text);
    }
}

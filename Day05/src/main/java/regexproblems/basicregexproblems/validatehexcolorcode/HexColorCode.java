package regexproblems.basicregexproblems.validatehexcolorcode;
import java.util.regex.*;
import java.util.*;

public class HexColorCode {
    public static void main(String[] args) {
        String regex = "^#[0-9a-fA-F]{6}$";

        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hex Color Code: ");
        String input = sc.nextLine();

        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Valid Hex Color Code");
        }
        else{
            System.out.println("Invalid Hex Color Code");
        }
    }
}

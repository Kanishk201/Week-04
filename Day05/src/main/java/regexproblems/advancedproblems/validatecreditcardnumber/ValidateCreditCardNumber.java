package regexproblems.advancedproblems.validatecreditcardnumber;
import java.util.regex.*;
import java.util.*;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String regex = "4|5[0-9]{15}";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid Credit Card Number");
        }
        else{
            System.out.println("Invalid Credit Card Number");
        }
    }
}

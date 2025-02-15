package regexproblems.advancedproblems.validateipaddress;
import java.util.regex.*;
import java.util.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9]\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9]$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("Valid IP Address");
        }
        else{
            System.out.println("Invalid IP Address");
        }
    }
}

package regexproblems.basicregexproblems.validatelicenceplatenumber;

import java.util.regex.*;
import java.util.*;

public class LicencePlateNumber {
    public static void main(String[] args) {

        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Licence Plate number: ");
        String input = sc.nextLine();

        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Valid Licence Plate number");
        }
        else{
            System.out.println("Invalid Licence Plate number");
        }
    }
}

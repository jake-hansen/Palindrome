package Palindrome;
/**
 * Created by Jacob Hansen on 8/25/16.
 * Millard North High School
 *
 * This program accepts user input as a string, and then checks it to see if it is a Palindrome
 */
import java.util.Scanner;

public class PalindromeRunner {
    public static void main (String [] args){

        String Continue, userString, userStringCopy, userStringBackwards;
        Scanner inputContinue = new Scanner(System.in);
        Scanner inputUserString = new Scanner(System.in);
        do {
            System.out.println ("Please enter a String...");
            userString = inputUserString.nextLine();

            userStringCopy = userString;

            userString = userString.toLowerCase().replaceAll("\\s+", "");

            userStringBackwards = BackwardsString.toBackwards(userString);

            if (userStringBackwards.equals(userString)){
                System.out.println ("\"" + userStringCopy + "\"" + " is a Palindrome!" );
            }
            else System.out.println ("\"" + userStringCopy + "\"" + " is NOT a Palindrome!" );

            userStringBackwards = ("");
            
            do {
                System.out.println ("Do you want to check another String? (Y/N)");
                Continue = inputContinue.nextLine();
            }
            while (!Continue.equals("Y") && !Continue.equals("y") && !Continue.equals("N") && !Continue.equals("n"));
        }
        while (Continue.equals("Y") || Continue.equals("y"));
    }
}

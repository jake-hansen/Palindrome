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
        String Continue, userStringCopy;
        Scanner inputContinue = new Scanner(System.in);
        Scanner inputUserString = new Scanner(System.in);
        BackwardsString BS1 = new BackwardsString();
        do {
            System.out.println ("Please enter a String...");
            BS1.stringInput = inputUserString.nextLine();
            userStringCopy = BS1.stringInput;
            BS1.stringInput = BS1.stringInput.toLowerCase().replaceAll("\\s+", "");
            BS1.toBackwards();

            if (BS1.stringInput.equals(BS1.stringOutput)){
                System.out.println ("\"" + userStringCopy + "\"" + " is a Palindrome!" );
            }
            else System.out.println ("\"" + userStringCopy + "\"" + " is NOT a Palindrome!" );

            BS1.stringOutput = ("");

            do {
                System.out.println ("Do you want to check another String? (Y/N)");
                Continue = inputContinue.nextLine();
            }
            while (!Continue.equals("Y") && !Continue.equals("y") && !Continue.equals("N") && !Continue.equals("n"));
        }
        while (Continue.equals("Y") || Continue.equals("y"));
    }
}

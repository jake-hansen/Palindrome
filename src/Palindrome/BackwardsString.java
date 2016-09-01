package Palindrome;
/**
 * Created by Jacob Hansen on 8/25/16.
 * Millard North High School
 */
public class BackwardsString {
    public static String toBackwards (String stringInput){
        String stringOutput = ("");

        for (int i = stringInput.length() - 1; i >= 0; i--){
            stringOutput += stringInput.toLowerCase().charAt(i);
        }

        return stringOutput;
    }
}

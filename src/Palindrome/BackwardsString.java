package Palindrome;

/**
 * Created by Jacob Hansen on 8/25/16.
 * Millard North High School
 */
public class BackwardsString {
    String stringInput;
    String stringOutput = ("");
    public void toBackwards (){
        for (int i = stringInput.length() - 1; i >= 0; i--){
            stringOutput += stringInput.toLowerCase().charAt(i);
        }
    }
}

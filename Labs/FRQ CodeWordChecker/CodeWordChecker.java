
/**
 * CodeWordChecker
 *
 * @author (Noel Salmeron)
 * @version (307)
 */
public class CodeWordChecker implements StringChecker
{
    // instance variables
    private int minLength;
    private int maxLength;
    private String nonString;

    public CodeWordChecker(int minLen, int maxLen, String noStr)
    {
        // initialise instance variables
        minLength = minLen;
        maxLength = maxLen;
        nonString = noStr;
    }
    
    public CodeWordChecker(String noString)
    {
        // initialise instance variables
        minLength = 6;
        maxLength = 20;
        nonString = noString;
    }

    public boolean isValid(String str)
    {
        if (str.length() >= minLength && str.length() <= maxLength && 
            str.indexOf(nonString) == -1) {
                return true;
            } else {
                return false;
            }
    }
}

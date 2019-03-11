
/**
 * WordPair
 *
 * @author (Noel Salmeron)
 * @version (311)
 */
import java.util.ArrayList;
public class WordPair
{
    private String a;
    private String b;
    
    /**
     * Constructor for objects of class WordPair
     */
    public WordPair(String first, String second)
    {
        a = first;
        b = second;
    }
    
    public String getFirst(){
        return a;
    }
    
    public String getSecond(){
        return b;
    }
}

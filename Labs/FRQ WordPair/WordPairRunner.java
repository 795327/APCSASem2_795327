
/**
 * WordPairRunner
 *
 * @author (Noel Salmeron)
 * @version (311)
 */
import java.util.ArrayList;
public class WordPairRunner
{
    public static void main(){
        String[] words = new String[3];
        words[0] = "dog";
        words[1] = "dog";
        words[2] = "dog";
        WordPairList wpl = new WordPairList(words);
        System.out.println(wpl.numMatches());
    }
}


/**
 * WordPairList
 *
 * @author (Noel Salmeron)
 * @version (311)
 */
import java.util.ArrayList;
public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    /**
     * Constructor for objects of class WordPair
     */
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length - 1; i++){
            for (int j = i+1; j < words.length; j++){
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches()
    {
        int matches = 0;
        for (int i = 0; i < allPairs.size(); i++){
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond()))
                matches += 1;
        }
        return matches;
    }
}

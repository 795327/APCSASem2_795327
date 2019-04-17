
/**
 * Four
 *
 * @author (Noel Salmeron)
 * @version (415)
 */
import java.util.Arrays;
import java.util.ArrayList;
public class Four
{
    // instance variables - replace the example below with your own
    private ArrayList<String> nList;

    /**
     * Constructor for objects of class Four
     */
    public Four()
    {
        nList = new ArrayList<String>();
        nList.add("dog");
        nList.add("cat");
        nList.add("rabbit");
        nList.add("bird");
    }

    public void sortStrings(ArrayList<String> names){
        String temp = "";
        for (int i = 1; i < names.size(); i++){
            for (int j = i; j > 0; j--){
                if (names.get(j).compareTo(names.get(j-1)) < 0){
                    temp = names.get(j);
                    names.set(j, names.get(j-1));
                    names.set(j-1, temp);
                }
            }
        }
    }

    public void shuffleStrings(ArrayList<String> names){
        String temp = "";
        for (int i = 0; i < names.size(); i++){
            int randInt = (int)(Math.random()*names.size());
            temp = names.get(i);
            names.set(i, names.get(randInt));
            names.set(randInt, temp);
        }
    }

    public void insertString(String word){
        for (int i = 0; i < nList.size(); i++){
            if (word.compareTo(nList.get(i)) < 0){
                nList.add(i, word);
                return;
            }
        }
    }

    public ArrayList<String> getList(){
        return nList;
    }

    public void printList(){
        System.out.println(Arrays.toString(nList.toArray()));
    }
}

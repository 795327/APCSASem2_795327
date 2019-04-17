
/**
 * FourRunner
 *
 * @author (Noel Salmeron)
 * @version (415)
 */
public class FourRunner
{
    public static void main(){
        Four a = new Four();
        System.out.println("Original:");
        a.printList();
        a.sortStrings(a.getList());
        System.out.println("\nSorted:");
        a.printList();
        System.out.println("\nSorted w/ added string:");
        a.insertString("hamster");
        a.printList();
        System.out.println("\nShuffled w/ added string:");
        a.shuffleStrings(a.getList());
        a.printList();
    }
}
